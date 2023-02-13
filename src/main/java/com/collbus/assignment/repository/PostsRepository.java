package com.collbus.assignment.repository;

import com.collbus.assignment.domain.Posts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
}
