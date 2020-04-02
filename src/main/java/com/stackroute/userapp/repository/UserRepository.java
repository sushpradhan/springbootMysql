package com.stackroute.userapp.repository;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.stackroute.userapp.model.User;

@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, Integer> {

	
}
