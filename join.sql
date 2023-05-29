create table branch(branchId int primary key,branch varchar(20));

create table employee(empId int primary key,name varchar(20),salary int,job varchar(20),branchId int,constraint brId foreign key(branchId) references branch(branchId));


select * from employee;


select * from branch;


insert into branch values(1,'chennai'),(2,'trichy'),(3,'covai'),(4,'madurai'),(5,'salem');

insert into employee values(1,'ram',25000,'developer',2),
(2,'ravi',15000,'salesmen',3),
(3,'karthi',50000,'manager',2),
(4,'siva',35000,'developer',1),
(5,'murali',45000,'hr',4),
(6,'vijay',25000,'salesmen',1),
(7,'david',60000,'hr',1),
(8,'arif',12000,'developer',3),
(9,'kumar',65000,'manager',2),
(10,'surya',80000,'ceo',1);

select e.name,e.salary,e.job,b.branch from employee as e inner join branch as b on e.branchId=b.branchId;

select e.name,e.job from employee as e inner join branch as b
on e.branchId=b.branchId
where branch='trichy';

select job,count(empId) from employee group by job;

select e.job,avg(salary),count(empId) from employee as e inner join branch as b
on e.branchId = b.branchId
where branch='chennai'
group by job having avg(salary)>50000
order by job desc;

select e.name,e.salary,e.job,b.branch from employee as e left join branch as b
on e.branchId=b.branchId;

select e.name,e.salary,e.job,b.branch from employee as e right join branch as b
on e.branchId=b.branchId;

select e.name,e.salary,e.job,b.branch from employee as e cross join branch as b
on e.branchId=b.branchId;


--------------------------------------------------------------------------------------------------------------------------------

select now();

select date(now());

select curdate();

select date_format(curdate(),"%d/%m/%Y");

select ucase(name) from employee;

select name,char_length(name) from employee;

select concat('Rs.',salary) from employee;

select format(salary,0) from employee;

select right(name,3) from employee;

select name from employee order by name;

select job,count(empId) from employee group by job;

select branchId,count(*) from employee
group by branchId
having count(*)>2;

select e.name,e.salary,b.branch from employee as e inner join branch as b
on e.branchId=b.branchId
where branch='chennai' and salary>50000;

select b.branch,min(salary) from employee as e inner join branch as b
on e.branchId=b.branchId
group by e.branchId;

select * from employee;

----------------------------------------------------------------------------------------------------------

use basic;

select * from customer;

select * from department;

alter table customer drop column job;

alter table customer add column deptId int;


alter table customer add foreign key(deptId) references department(id);

create table department(id int primary key,dept varchar(20),locId int,constraint fkLocId foreign key(locId) references location(id));

desc customer;

desc department;

select count(*),deptId from customer group by deptId;

select count(*),locId from department group by locId;

select * from customer c join department d on c.deptId=d.id
join location l on d.locId=l.id;

