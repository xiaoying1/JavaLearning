create database if not exists demo;

use demo;

drop table if exists user;

create table if not exists user(
	id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(50) NOT NULL,
    pwd VARCHAR(50) NOT NULL,
    primary key(id)
)Engine=INNODB DEFAULT CHARSET=UTF8;

insert into user (name,pwd) values('罗贯中','123');
insert into user (name,pwd) values('吴承恩','123');
insert into user (name,pwd) values('曹雪芹','123');
insert into user (name,pwd) values('施耐庵','123');

select * from book;