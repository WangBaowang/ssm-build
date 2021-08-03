package com.dao;

import com.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangbw-b
 * @create 2021-07-15 15:18
 */
public interface BookMapper {
    int addBook(Books book);
    int deleteBook(@Param("bookId") int id);
    int updateBook(Books books);
    Books queryBook(@Param("bookId") int id);
    List<Books> queryAllBooks();
    Books queryBookByName(@Param("bookName") String bookName);
}
