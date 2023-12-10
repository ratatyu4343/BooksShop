package com.example.demo.repo;

import com.example.demo.models.books;
import org.springframework.data.repository.CrudRepository;

public interface booksRepository extends CrudRepository<books, Long>{
}
