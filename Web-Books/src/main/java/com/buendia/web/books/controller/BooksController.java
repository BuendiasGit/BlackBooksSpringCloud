package com.buendia.web.books.controller;

import com.buendia.web.books.entity.TBooks;
import com.buendia.web.books.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class BooksController {

    @Autowired
    private BooksService service;

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    @ResponseBody
    public String sayHi(@RequestParam String msg){
        return service.sayHi(msg);
    }

    @RequestMapping(value = "getOne",method = RequestMethod.GET)
    @ResponseBody
    public String selectOne(@RequestParam Integer id){
        return service.selectOne(id);
    }

    @RequestMapping("querybooks")
    public String querybooks(Model model){
        List<TBooks> tBooks =service.selectAll();
        model.addAttribute("tbooks",tBooks);
        return "index";
    }

}
