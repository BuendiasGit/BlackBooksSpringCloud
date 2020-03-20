package com.buendia.service.books.controller;

import com.buendia.service.books.mapper.TBooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BooksController {

    @Autowired
    private TBooksMapper mapper;

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String selectPort(String msg){
        return "this port is "+port+",and your message is "+msg;
    }

    @RequestMapping(value = "getOne",method = RequestMethod.GET)
    public String selectOne(Integer id){
        System.out.println(mapper.selectByPrimaryKey(id).toString());
        return mapper.selectByPrimaryKey(id).toString();
    }
}
