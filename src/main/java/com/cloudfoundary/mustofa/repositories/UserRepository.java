package com.cloudfoundary.mustofa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudfoundary.mustofa.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	User findByEmail(String email);
}
