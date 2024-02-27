package com.dto.demo.services;

import com.dto.demo.dto.PostCreationDTO;
import com.dto.demo.models.Author;
import com.dto.demo.models.Post;
import com.dto.demo.repository.AuthorRepository;
import com.dto.demo.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    @Autowired
    AuthorRepository authorRepository;

    public Post createPost(PostCreationDTO postCreationDTO) {
        Author author = authorRepository.findById(postCreationDTO.getAuthorId())
                .orElseThrow(() -> new RuntimeException("Author not found"));

        Post newPost = new Post();
        newPost.setTitle(postCreationDTO.getTitle());
        newPost.setContent(postCreationDTO.getContent());
        newPost.setAuthor(author);

        return postRepository.save(newPost);
    }













}
