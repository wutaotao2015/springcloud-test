package com.controller;

import com.model.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

/**
 * WebController
 *
 * @author wutaotao
 * @version 2019/5/6 9:46
 */
@Controller
@RequestMapping("/")
public class WebController {

    @GetMapping("index")
    public String index() {
       return "index";
    }

    @GetMapping("test/{url}")
    public ModelAndView test(@PathVariable String url){
        ModelAndView modelAndView = new ModelAndView("test");
        Book book1 = new Book("author1", "title1", url);
        Book book2 = new Book("author2", "title2", "url2");
        Book book3 = new Book("author3", "title3", "url3");
        modelAndView.addObject("bookList", Arrays.asList(new Book[]{book1, book2, book3}));
        return modelAndView;
    }
}
