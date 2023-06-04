create view empView as select id,name from employee;

select rowid,e.* from employee e;

select name,salary,(select max(salary) from employee) as max,
(select min(salary) from employee) as min from employee where deptId=4;

select name,deptId,salary,lag(salary,3) over(order by salary) as lag from employee;

select name,deptId,salary,lead(salary,2) over(order by salary) as lead from Employee;

select name,deptId,salary,dense_rank() over(order by salary desc) as dense_rank from Employee;

update Employee set salary=20000 where id=2;

select name,deptId,salary,rank() over(partition by deptId order by salary desc) as rank from Employee;
