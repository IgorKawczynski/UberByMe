package org.igokaw.service;

import org.igokaw.entity.User;
import org.igokaw.repository.UserRepository;
import org.igokaw.repository.annotation.HibernateUserRepositoryQualifier;
import org.igokaw.repository.annotation.JDBCUserRepositoryQualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public final UserRepository userRepository;


    //Autowired mówi springowi, aby przy tworzeniu Beana UserService znaleźć w kontekście (context)
    // tego UserRepository z konstruktora i wstrzyknąć go w pole powyżej
    @Autowired          /*mogłoby też być @JDBCUserRepositoryQualifier*/
    public UserService(@HibernateUserRepositoryQualifier UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user1){
        userRepository.add(user1);
    }

    public User findByUId(int uId){
        return userRepository.findByUId(uId);
    }

    public User findByEmail(String email){
        return userRepository.findByEmail(email);
    }
}
