# Write your MySQL query statement below
select emp.name as employee 
from employee emp,employee mgr 
where emp.managerid=mgr.id and emp.salary>mgr.salary; 
