package com.modadugu.store.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.modadugu.store.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByTitle(String title);
}
