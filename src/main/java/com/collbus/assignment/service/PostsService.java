package com.collbus.assignment.service;

import com.collbus.assignment.domain.AccountType;
import com.collbus.assignment.domain.Likes;
import com.collbus.assignment.domain.Posts;
import com.collbus.assignment.domain.User;
import com.collbus.assignment.repository.LikesRepository;
import com.collbus.assignment.repository.PostsRepository;
import com.collbus.assignment.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.support.SimpleJpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostsService {

    @Autowired
    private PostsRepository postsRepository;

    @Autowired
    private LikesRepository likesRepository;

    @Autowired
    private UserRepository userRepository;

    public Posts createPost(Posts post, Long userId){
        User user = userRepository.findById(userId).orElse(null);
        if(user == null){
            throw new IllegalArgumentException("유저가 등록되어 있지 않습니다.");
        }
        if (user.getAccount_type() == AccountType.EXTRA){
            throw new IllegalArgumentException("외부 사용자는 글쓰기가 허용되지 않습니다.");
        }
        return postsRepository.save(post);
    }

    public Posts updatePost(Posts post, Long userId){
        User user = userRepository.findById(userId).orElse(null);
        if(user == null){
            throw new IllegalArgumentException("유저가 등록되어 있지 않습니다.");
        }
        if(user.getAccount_type() == AccountType.EXTRA){
            throw new IllegalArgumentException("외부사용자는 글을 수정할 수 없습니다.");
        }
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
