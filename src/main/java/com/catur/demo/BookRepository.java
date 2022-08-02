package com.catur.demo;

import org.springframework.data.repository.CrudRepository;

import com.catur.demo.Book;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BookRepository extends CrudRepository<Book, Integer> {

}
