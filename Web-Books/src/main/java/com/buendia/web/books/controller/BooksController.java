package com.buendia.web.books.controller;

import com.buendia.web.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @Autowired
    private BooksService service;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String msg){
        return service.sayHi(msg);
    }

    @RequestMapping(value = "getOne",method = RequestMethod.GET)
    public String selectOne(@RequestParam Integer id){
        return service.selectOne(id);
    }

}
