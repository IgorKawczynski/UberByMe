package org.igokaw.repository;

import org.igokaw.entity.User;

public interface UserRepository {

    void add(User user1);

    User findByEmail(String email);

    User findByUId(int uId);


}
