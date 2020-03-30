package com.buendia.service.books.service;

import com.buendia.service.books.entity.TBooks;
import com.buendia.service.books.mapper.TBooksMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private TBooksMapper mapper;

    public TBooks selectById(Integer id){
        return mapper.selectByPrimaryKey(id);
    }

    public List<TBooks> selectAll(){
        return mapper.selectAll();
    }

}
