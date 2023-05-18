create table employee(id int,name varchar(20),salary int,address varchar(20),primary key(id));

insert into employee (id,name,salary,address) values (3,'kumar',25000,'theni');
insert into employee values(2,'ravi',20000,'chennai');
insert into employee values(7,'david',50000,'madurai'),(8,'gowdham',12000,'tricy'),(9,'madhan',60000,'chennai');


select * from employee;

select * from employee where job='developer' or job='hr';

alter table employee add column job varchar(20);

update employee set address='trichy' where id=8;

update employee set job='hr' where id in(5,9);

select * from employee order by name;

select * from employee order by name desc;

select address,count(id) as countOfMembers from employee group by address;

select job,avg(salary) from employee group by job;

select job,count(id)as member from employee group by job having member>2;

select name from employee where name like 'b%';

select * from employee where name like '%m';

select * from employee where name like '___i%';

select * from employee where salary between 30000 and 50000;
