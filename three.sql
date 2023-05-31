use basic;

select * from customer;

select * from department;

select * from location;

select name,salary from customer where salary>=30000;

select name,salary from customer where salary>=30000 and salary<=50000;

select name,salary from customer where salary between 30000 and 40000;

select name from customer where name like 'a%';

select name from customer where name like '%i';

select name from customer where name like '%t%';

select name from customer where name like '__a%';

select name from customer order by name;

select name from customer order by name desc;

select * from customer order by name,salary;

select * from location order by location;

select * from location order by(
case location
when 'chennai' then 1
when 'mumbai' then 2
when 'pune' then 3
else 100
end
);

select count(*) from customer; -- count() doesn't count the null value when single column ex:count(name)--

select deptId,count(deptId) from customer group by deptId;

select c.name,c.salary,d.dept from customer as c inner join department as d
on c.deptId=d.id;

select c.name,c.salary,d.dept,l.location from customer as c inner join department as d
on c.deptId=d.id inner join location as l
on d.locId=l.id;

select c.name,c.salary,d.dept,l.location from customer as c inner join department as d
on c.deptId=d.id inner join location as l
on d.locId=l.id
where location='chennai';

select c.name,c.salary,d.dept,l.location from customer as c inner join department as d
on c.deptId=d.id inner join location as l
on d.locId=l.id
where location='chennai'
order by salary;

select name from customer where deptId =(
select id from department where dept='ceo');

select name from customer where deptId in(
select id from department where dept='ceo' or dept='marketing');

select name from customer where deptId not in(
select id from department where dept='ceo' or dept='marketing');

select name,dept from customer as c inner join department as d
on c.deptId=d.id
where deptId in(
select id from department where dept='ceo' or dept='marketing');


-- customer working in chennai only --
select name from customer where deptId in(
select id from department where locId=(
select id from location where location='chennai'));


select id from location where location='chennai';

select id from department where locId=(select id from location where location='chennai');

select locId,count(locId) from department group by locId;


select location from location;

select locId,count(locId) from department group by locId;

select deptId,count(deptId) from customer group by deptId;

select count(*) from customer where deptId in(
select id from department where locId=(
select id from location where location='pune'));

select deptId,count(deptId) from customer group by deptId;

select d.dept,count(c.deptId) from customer as c inner join department as d
on c.deptId=d.id
group by c.deptId;
-- count of each state working customer total count --
select l.location,count(d.locId) from department as d inner join location as l
on d.locId=l.id inner join customer as c
on d.id=c.deptId
group by d.locId;
