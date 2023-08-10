SELECT * FROM employee e;

SELECT * FROM branch b;

select e.name,b.branch from employee as e right join branch as b on e.branchId=b.branchId;

select job,count(job) as c from employee group by job having c>=2;

select branch from branch where branchId=1;

select name from employee where branchId in(select branchId from branch where branch='trichy');

-----------------------------------------------------------------------------------------------------

use basic;

select * from customer;

select * from department;

select * from location;

select salary from customer where salary  between 25000 and 40000;
                                                                  -- both are equal --
select salary from customer where salary>=25000 and salary<=40000;


select salary from customer where salary in (25000 , 40000);
                                                                -- both are equal --
select salary from customer where salary=25000 or salary=40000;


select salary from customer where salary not in(25000,40000);
                                                                  -- both are equal --
select salary from customer where salary!=25000 and salary!=40000;



select name from customer where name like 'a%';

select name from customer where name like '%i';

select name from customer where name like '__r%';



select id,name from customer where id>=10 order by name;


select max(salary) from customer;

select sum(salary) from customer;

select avg(salary) from customer;

select min(salary) from customer;

select count(salary) from customer;


select deptId,count(deptId) as total from customer group by deptId;

select deptId,count(deptId) as total from customer group by deptId having total>=2;

select deptId,count(deptId) as total from customer group by deptId having total>=2 order by total;


select c.name,c.deptId,d.dept from customer as c inner join department as d on c.deptId=d.id;

select d.dept,count(deptId) from customer as c inner join department as d on c.deptId=d.id group by c.deptId;

select dept,location from department inner join location as l on locId=l.id;

select location,count(locId) from department inner join location as l on locId=l.id group by locId;


select * from customer where salary=(select max(salary) from customer);

-- find location based on highest salary from third table --

select * from location where id=(
select locId from department where id=(
select deptId from customer where salary=(
select max(salary) from customer)));
----------------------------------------------------------------------------------------------------------------------

SELECT * FROM location l;

SELECT * FROM department d;

SELECT * FROM customer c;


select * from customer where deptId in(
select id from department where locId=(
select id from location where location='mumbai'));

-- working in chennai only --
select * from customer where deptId=any(
select id from department where exists
(select id from location where location='chennai' and location.id=department.locId));

-- not working in chennai --
select * from customer where deptId<>all(
select id from department where exists
(select id from location where location='chennai' and location.id=department.locId));

-----------------------------------------------------------------------------------------------
use basic;

SELECT * FROM location l;

SELECT * FROM department d;

SELECT * FROM customer c;

select deptId,count(deptId) from customer group by deptId;

-- find department count each department --
select d.dept,count(c.deptId) from customer c right join department d on c.deptId=d.id group by c.deptId;

-- find location count each location --
select l.location,count(d.locId) from department d right join location l on d.locId=l.id group by d.locId;

-- find working in chennai only --
select * from customer where deptId in(
select id from department where locId=(
select id from location where location='chennai'));


-- find noty working in chennai only --
select * from customer where deptId <>all(
select id from department where locId=(
select id from location where location='chennai'))

