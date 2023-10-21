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





use basic;

SELECT * FROM customer c;

SELECT * FROM department d;

SELECT * FROM location l;

select * from customer where deptId in
(select id from department where locId=
(select id from location where location='delhi'));

select job,count(id)as member from employee group by job having member>2;

select name from employee where name like 'b%';

select * from employee where name like '%m';

select * from employee where name like '___i%';

select * from employee where salary between 30000 and 50000;

--------------------------------------------------------------------------------------------------
use basic;

select * from employee;

select * from branch;

select * from employee where salary>=50000;

select * from employee where salary in(25000,80000);

select * from employee where salary not in(25000,80000);

select * from employee where salary between 25000 and 70000;

select name from employee where name like '__r%';

select name from employee order by name desc;

select job,count(job) from employee group by job;

select job,count(job)as j from employee group by job having j=2;

select branchId,count(branchId) from employee group by branchId;

select e.name,e.salary,job,b.branch from employee as e join branch as b on e.branchId=b.branchId where branch='chennai';



select * from employee where salary =(select max(salary) from employee);

select * from employee where branchId =(select branchId from branch where branch='chennai');

select b.branch,max(salary),count(empId) from employee as e right join branch as b on e.branchId=b.branchId group by b.branchId;

select * from branch as b where branchId in (select branchId from employee as e where b.branchId=e.branchId);




