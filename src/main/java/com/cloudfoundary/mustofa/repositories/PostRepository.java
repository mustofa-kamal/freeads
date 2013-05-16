package com.cloudfoundary.mustofa.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudfoundary.mustofa.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {
	List<Post> findByTitle(String title);
}
