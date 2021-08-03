package com.service;

import com.pojo.Books;

import java.util.List;

/**
 * @author wangbw-b
 * @create 2021-07-15 15:35
 */
public interface BookService {
    int addBook(Books book);
    int deleteBook(int id);
    int updateBook(Books books);
    Books queryBook(int id);
    List<Books> queryAllBooks();
    Books queryBookByName(String bookName);
}
