use basic;

select * from employee;

select * from branch;

select * from employee where branchId=(
select branchId from branch where branch='chennai');

select * from employee where branchId=any(
select branchId from branch where branch in('trichy','covai'));

select * from employee where branchId <>all(
select branchId from branch where branch in('trichy','covai'));

select * from branch where exists (
select * from employee where job='manager' and
branch.branchId=employee.branchId);

select b.branch,count(empId) from employee as e right join branch as b
on e.branchId=b.branchId
where e.job='developer'
group by e.branchId
having count(empId)>1
order by b.branch;

insert into employee (name,salary,job,branchId) values('virat',40000,'developer',1);
insert into employee (name,salary,job,branchId) values('rohit',57000,'developer',2);
insert into employee (name,salary,job,branchId) values('rahul',70000,'developer',1);

desc employee;

select b.branch,count(empId) from employee as e right join branch as b
on e.branchId=b.branchId
where e.empId<>all(select empId from employee where job='ceo')
group by branch
having count(empId) >1
order by count(empId);

-------------------------------------------------------------------------------------------------

use basic;

select * from employee;

update employee set salary=80000 where empId=3;

select name,salary from employee where salary=
(select max(salary) from employee);

select name,branchId,salary from employee where salary =(
select max(salary) from employee);


select branchId,max(salary) from employee
group by branchId;

select e.name,e.salary,e.job,b.branch from employee as e inner join branch as b
on e.branchId=b.branchId
where salary in(
select max(salary) from employee
group by branchId);
