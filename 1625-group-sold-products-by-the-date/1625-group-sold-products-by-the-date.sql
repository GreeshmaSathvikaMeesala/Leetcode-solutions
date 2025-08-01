# Write your MySQL query statement below
select sell_date, 
    count(distinct product) as num_sold,
    group_concat(distinct product order by product) as products
from Activities
Group by sell_date;