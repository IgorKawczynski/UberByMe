package org.igokaw.repository.jdbc;

import org.igokaw.entity.AccountType;
import org.igokaw.entity.Client;
import org.igokaw.entity.Client2;
import org.igokaw.entity.User;
import org.igokaw.repository.Client2Repository;
import org.igokaw.repository.annotation.JDBCClient2RepositoryQualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.sql.*;


@Repository
@JDBCClient2RepositoryQualifier
public class JDBCClient2Repository implements Client2Repository {

    public final String user;
    public final String password;
    public final String jdbc_url;

    public JDBCClient2Repository(@Value("${jdbc.user}")String user,
                                @Value("${jdbc.password}")String password,
                                @Value("${jdbc.url}")String jdbc_url)
    {
        this.user = user;
        this.password = password;
        this.jdbc_url = jdbc_url;
    }

    @Override
    public void add(Client2 client) {
        try(Connection connection = DriverManager.getConnection(jdbc_url, user, password))
        {
            final int uId = client.getUId();
            final String address = client.getAddress();
            final String firstName = client.getFirstName();
            final String secondname = client.getSecondName();
            final String cardNumber = client.getCardNumber();
            final Boolean premium = client.getPremium();
            final Double portfolioBalance = client.getPortfolioBalance();

            final PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO clients(id, address, firstName, secondName, cardNumber, premium, portfolioBalance) VALUES (?,?,?,?,?,?,?)");
            preparedStatement.setInt(1, uId);
            preparedStatement.setString(2, address);
            preparedStatement.setString(3, firstName);
            preparedStatement.setString(4, secondname);
            preparedStatement.setString(5, cardNumber);
            preparedStatement.setBoolean(6, premium);
            preparedStatement.setDouble(7, portfolioBalance);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Client2 findByUId(int uId1) {
        try(Connection connection = DriverManager.getConnection(jdbc_url, user, password))
        {
            final PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM clients WHERE id=?");
            preparedStatement.setInt(1, uId1);
            final ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next())
            {
                final int resultUId = resultSet.getInt("id");
                final String resultAddress = resultSet.getString("email");
                final String resultFirstName = resultSet.getString("password");
                final String resultSecondName = resultSet.getString("phoneNumber");
                final String resultCardNumber = resultSet.getString("password");
                final Boolean resultPremium = resultSet.getBoolean("phoneNumber");
                final Double resultPortfolioBalance = resultSet.getDouble("password");
                return new Client2(resultUId, resultAddress, resultFirstName, resultSecondName,
                                    resultCardNumber, resultPremium, resultPortfolioBalance);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
