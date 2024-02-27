package com.dto.demo.controllers;

import com.dto.demo.dto.PostCreationDTO;
import com.dto.demo.models.Post;
import com.dto.demo.services.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/posts")
public class PostController {
    @Autowired
    PostService postService;

    @PostMapping
    public ResponseEntity<Post> createPost(@RequestBody PostCreationDTO postCreationDTO) {
        Post newPost = postService.createPost(postCreationDTO);
        return new ResponseEntity<>(newPost, HttpStatus.CREATED);
    }
}












