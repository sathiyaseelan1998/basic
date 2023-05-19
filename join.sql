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

