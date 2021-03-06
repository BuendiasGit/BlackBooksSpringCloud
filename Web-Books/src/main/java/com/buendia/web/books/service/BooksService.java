package com.buendia.web.books.service;

import com.buendia.web.books.entity.TBooks;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(value = "Service-Books")
public interface BooksService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "msg")String msg);

    @RequestMapping(value = "getOne",method = RequestMethod.GET)
    public String selectOne(@RequestParam(value = "id")Integer id);

    @RequestMapping(value = "getAll",method = RequestMethod.GET)
    public List<TBooks> selectAll();
}
