package org.igokaw.repository.jdbc;

import org.igokaw.entity.User;
import org.igokaw.repository.UserRepository;
import org.igokaw.repository.annotation.JDBCUserRepositoryQualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;


@Repository
@JDBCUserRepositoryQualifier
public class JDBCUserRepository implements UserRepository {

    public final String user;
    public final String password;
    public final String jdbc_url;

    public JDBCUserRepository(@Value("${jdbc.user}")String user,
                              @Value("${jdbc.password}")String password,
                              @Value("${jdbc.url}")String jdbc_url)
    {
        this.user = user;
        this.password = password;
        this.jdbc_url = jdbc_url;
    }

    @Override
    public void add(User user1) {
        try(Connection connection = DriverManager.getConnection(jdbc_url, user, password))
        {
            final int uId = user1.getuId();
            final String email = user1.getEmail();
            final String password = user1.getPassword();
            final String phoneNumber = user1.getPhoneNumber();

//            connection.prepareStatement("INSERT INTO users(email, gId, password, phoneNumber) VALUES ('"+email+"', '"+gId+"', '"+password+"', '"+phoneNumber+"')"); //SQL INJECTION, TAK ZLE, POWODUJE BLEDY PRZY KWERENDOWANIU DROP TABLE ITD ITP
            final PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users(uid, email, gid, password, phonenumber) VALUES (?,?,?,?,?)");
            preparedStatement.setInt(1, uId);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, "CLIENT");
            preparedStatement.setString(4, password);
            preparedStatement.setString(5, phoneNumber);
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public User findByUId(int uId1) {
        try(Connection connection = DriverManager.getConnection(jdbc_url, user, password))
        {
            final PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE uId=?");
            preparedStatement.setInt(1, uId1);
            final ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                final int resultUId = resultSet.getInt("uId");
                final String resultEmail = resultSet.getString("email");
                final String resultPassword = resultSet.getString("password");
                final String resultPhoneNumber = resultSet.getString("phoneNumber");
                return new User("CLIENT", resultUId, resultEmail, resultPassword, resultPhoneNumber);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    @Override
    public User findByEmail(String email1) {
        try(Connection connection = DriverManager.getConnection(jdbc_url, user, password))
        {
            final PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM users WHERE email=?");
            preparedStatement.setString(1, email1);
            final ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                final int resultUId = resultSet.getInt("uId");
                final String resultEmail = resultSet.getString("email");
                final String resultPassword = resultSet.getString("password");
                final String resultPhoneNumber = resultSet.getString("phoneNumber");
                return new User("CLIENT", resultUId, resultEmail, resultPassword, resultPhoneNumber);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
