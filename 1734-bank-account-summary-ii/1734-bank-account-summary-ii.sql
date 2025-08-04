# Write your MySQL query statement below
select u.name as Name,
    sum(t.amount) as Balance
from users u
inner join Transactions t
on u.account=t.account
group by t.account
having sum(t.amount)>10000;