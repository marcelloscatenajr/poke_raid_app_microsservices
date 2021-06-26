package com.scatena.marcello.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.scatena.marcello.users.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
