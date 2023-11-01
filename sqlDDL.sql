create database demo;

use demo;

create table location (id int,name varchar(50));

insert into location values (1,'chennai');

select * from location;

drop table location;

delete from location;

alter table location rename to address;

select * from address;

alter table address rename column name to address;

alter table address add column dob date;

alter table address modify name varchar(20) not null;

desc address;

alter table address modify id int primary key;

alter table address alter name set default 'hi';

alter table address alter name drop default;

alter table address drop column dob;

create table employee (id int primary key,name varchar(20),salary int,addId int ,constraint fkId foreign key(addId) references address(id));
