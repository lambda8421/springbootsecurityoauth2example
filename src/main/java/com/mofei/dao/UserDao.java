package com.mofei.dao;

import com.mofei.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UserDao extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
