package com.cloudfoundary.mustofa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cloudfoundary.mustofa.entities.Post;

public interface PostRepository extends JpaRepository<Post, Integer> {

}
