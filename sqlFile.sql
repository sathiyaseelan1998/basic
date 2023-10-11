use basic;

create table emp (id int primary key,name varchar(20),salary int,dept varchar(50),address varchar(50));

drop table emp;

select * from emp;

insert into emp(id,name,salary,dept,address) values (2,'ajith',30000,'actor','trichy');

insert into emp values(10,'neru',90000,'politician','trichy'),(11,'mahesh',45000,'politician','karur');

update emp set id=6 where name='ajith';

select * from emp where salary>=50000 and salary<=100000;

select * from emp where id=4 || id=8;

select * from emp order by name;

select * from emp order by name desc;

select count(*) from emp;

select avg(salary) from emp;

select sum(salary) from emp;

select min(salary) from emp;

select max(salary) from emp;

select name from emp where name like 's%';

select name from emp where name like '%h';

select name from emp where name like '__h%';

select count(name) from emp where name like '__h%';

select dept,count(dept) as dept_count from emp group by dept;

select address,count(address) as a from emp group by address having a>1;

select * from emp where salary = (select max(salary) from emp);

select * from emp where address not in (select address from emp where address='chennai');

select * from emp where address!='chennai';

select count(salary) from emp where salary>=20000 && salary<=50000;

SELECT * FROM branch b;

SELECT * FROM employee e;

select empId,e.name,e.salary,b.branch from employee as e inner join branch as b on e.branchId=b.branchId order by empId;
