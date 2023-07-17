SELECT * FROM employee e;

SELECT * FROM branch b;

select e.name,b.branch from employee as e right join branch as b on e.branchId=b.branchId;

select job,count(job) as c from employee group by job having c>=2;

select branch from branch where branchId=1;

select name from employee where branchId in(select branchId from branch where branch='trichy');
