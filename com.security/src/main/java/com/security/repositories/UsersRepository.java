package com.security.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.security.entities.User;

@Repository
public interface UsersRepository extends CrudRepository<User, Integer>{

	public Optional<User> findUserByName(String name); 
}