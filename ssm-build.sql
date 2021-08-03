create database mybatis;
use mybatis;

create table books (
	bookID int(10) not null auto_increment comment '书id',
	bookName varchar(100) not null comment '书名',
	bookCounts int(11) not null comment '数量',
	details varchar(200) not null comment '描述',
	key bookID (bookID)
) engine=INNODB default charset=utf8;

insert into books(bookID, bookName, bookCounts, details) values
(1, 'Java', 10, 'jdk'),
(2, 'C', 20, 'C++'),
(3, 'Python', 30, 'script');