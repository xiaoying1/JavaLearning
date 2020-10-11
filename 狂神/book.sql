create database if not exists demo;

use demo;

drop table if exists book;

create table if not exists book(
	book_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL,
    price INT NOT NULL,
    author VARCHAR(50) NOT NULL,
    publisher VARCHAR(50) NOT NULL,
    primary key(book_id)
)Engine=INNODB DEFAULT CHARSET=UTF8;

insert into book (name,price,author,publisher) values('三国演义',15,'罗贯中','人民出版社');
insert into book (name,price,author,publisher) values('西游记',20,'吴承恩','人民出版社');
insert into book (name,price,author,publisher) values('红楼梦',25,'曹雪芹','南方出版社');
insert into book (name,price,author,publisher) values('水浒传',30,'施耐庵','北方出版社');

select * from book;

