package com.kanouakira.mapper;

import com.kanouakira.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userMapper")
public interface UserMapper {
    List<User> findAll();
}
