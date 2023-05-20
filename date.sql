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
