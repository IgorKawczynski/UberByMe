package org.igokaw.repository;

import org.igokaw.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class InMemoryUserRepository {

    ArrayList<User> userRepository = new ArrayList<>();

    public InMemoryUserRepository(ArrayList<User> userRepository)
    {
        this.userRepository = userRepository;
    }


    public ArrayList<User> getUserRepository()
    {
        return userRepository;
    }

    public void setUserRepository(ArrayList<User> userRepository)
    {
        this.userRepository = userRepository;
    }

    public void addUser(User user1)
    {
        if(this.userRepository.stream().anyMatch(user -> user.getuId() == user1.getuId()))
            System.out.println("This user is already in database!!");
        else
            this.userRepository.add(user1);
    }

    public void printUserRepository()
    {
        for(int i=0; i<this.userRepository.size(); i++)
        {
            System.out.println("User " + i + " : " + this.userRepository.stream().toList().get(i));
        }
    }

    @Override
    public String toString()
    {
        return "UserRepository{" +
                userRepository +
                '}';
    }
}
