use basic;

-- string function

select name,length(name) from employee;

select name,reverse(name) from employee;

select name,substr(name,2,3) from employee;

select name,instr(name,'i') from employee;

select name,replace(name,'i','*') from employee;

select name,translate(name,'thi',123) from employee;

select name,lpad(name,15,'*') from employee;

select name,rpad(name,15,'*') from employee;

select name,ltrim(name,'r') from employee;-- using oracle

select ltrim(' sss ') from dual;

select rtrim(' sss ') from dual;

select length(trim(' sss ')),length(ltrim(' sss ')),length(rtrim(' sss ')) from dual;

select name,upper(name) from employee;

select name,lower(name) from employee;

select name,initcap(name) from employee; -- using oracle


-- number function

select round(4.9),round(4.9786,2) from dual;

select trunc(4.9), trunc(4.9786,2) from dual; -- using oracle

select floor(4.9) from dual;

select ceil(4.1) from dual;

select mod(25,5) from dual;

select power(5,2) from dual;

select abs(-11) from dual;

select sqrt(25) from dual;

select sign(4767),sign(-4767) from dual;
