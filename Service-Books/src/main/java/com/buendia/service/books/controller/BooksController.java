package com.buendia.service.books.controller;

import com.buendia.service.books.entity.TBooks;
import com.buendia.service.books.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BooksController {

    @Autowired
    private BookService service;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String selectPort(String msg){
        return "this port is "+port+",and your message is "+msg;
    }

    @RequestMapping(value = "getOne",method = RequestMethod.GET)
    public String selectOne(Integer id){
        System.out.println(service.selectById(id).toString());
        return service.selectById(id).toString();
    }

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<TBooks> selectAll(Model model){
        model.addAttribute("tbooks",service.selectAll());
        return service.selectAll();
    }
}
