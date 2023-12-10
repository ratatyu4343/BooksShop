package com.example.demo.controllers;

import com.example.demo.models.books;
import com.example.demo.repo.booksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController{
    @GetMapping("/")
    public String homepage(Model model) {
        return "home";
    }

    @Autowired
    private booksRepository booksRepository;
    @GetMapping("/books")
    public String all_books(Model model) {
        Iterable<books> books = booksRepository.findAll();
        model.addAttribute("books",  books);
        return "books";
    }

}