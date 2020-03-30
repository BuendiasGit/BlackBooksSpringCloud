package com.buendia.service.books.mapper;

import com.buendia.service.books.entity.TBooks;

import java.util.List;

public interface TBooksMapper {
    int deleteByPrimaryKey(Integer bid);

    int insert(TBooks record);

    int insertSelective(TBooks record);

    TBooks selectByPrimaryKey(Integer bid);

    List<TBooks> selectAll();

    int updateByPrimaryKeySelective(TBooks record);

    int updateByPrimaryKey(TBooks record);
}