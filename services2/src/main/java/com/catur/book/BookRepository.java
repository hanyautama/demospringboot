package com.catur.book;

import org.springframework.data.repository.CrudRepository;

import com.catur.book.Book;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface BookRepository extends CrudRepository<Book, Integer> {

}
