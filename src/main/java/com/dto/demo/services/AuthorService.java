package com.dto.demo.services;

import com.dto.demo.models.Author;
import com.dto.demo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;

    public Author createAuhtor(Author author) {
        return authorRepository.save(author);
    }
}
