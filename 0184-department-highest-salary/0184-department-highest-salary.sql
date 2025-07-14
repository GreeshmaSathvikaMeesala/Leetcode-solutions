# Write your MySQL query statement below
select e.name as Employee,
    e.salary as Salary,
    d.name as Department
from Employee e
join Department d 
on e.departmentId=d.id 
where e.salary= (
    select max(salary) 
    from employee
    where departmentId=e.departmentId
);