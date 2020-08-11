package com.geekbrains.book.store.controllers;

import com.geekbrains.book.store.entities.Book;
import com.geekbrains.book.store.entities.Genre;
import com.geekbrains.book.store.services.BookService;
import com.geekbrains.book.store.utils.BookFilter;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/books")
@AllArgsConstructor
public class BookController {
    private BookService bookService;

    @GetMapping
    public String showAllBooks(Model model,
                               @RequestParam(name = "p", defaultValue = "1") Integer pageIndex,
                               @RequestParam Map<String, String> params
    ) {
        BookFilter bookFilter = new BookFilter(params);
        model.addAttribute("currentPage", pageIndex);
        Page<Book> page = bookService.findAll(bookFilter.getSpec(), pageIndex - 1, 5);
        model.addAttribute("books", page.getContent());
        model.addAttribute("filterParameters", bookFilter.getFilterParams());
        model.addAttribute("page", page);
        model.addAttribute("genres", Genre.values());
        return "store-page";
    }

}
