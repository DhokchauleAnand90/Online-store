package com.ecommerce.store.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.store.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
