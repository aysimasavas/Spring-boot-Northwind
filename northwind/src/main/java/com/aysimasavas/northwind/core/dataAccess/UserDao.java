package com.aysimasavas.northwind.core.dataAccess;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aysimasavas.northwind.core.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	User findByEmail(String email);


}
