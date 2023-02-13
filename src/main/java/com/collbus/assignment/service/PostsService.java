package com.collbus.assignment.service;

import com.collbus.assignment.domain.Likes;
import com.collbus.assignment.domain.Posts;
import com.collbus.assignment.repository.LikesRepository;
import com.collbus.assignment.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    @Autowired
    private LikesRepository likesRepository;

    public Posts createPost(Posts post){
        return postsRepository.save(post);
    }

    public Posts updatePost(Posts post){
        return postsRepository.save(post);
    }

    public void deletePost(Long id){
        postsRepository.deleteById(id);
    }

    public Likes addLike(Likes like){
        return likesRepository.save(like);
    }

    public List<Posts> getPosts(){
        return postsRepository.findAll();
    }
}
