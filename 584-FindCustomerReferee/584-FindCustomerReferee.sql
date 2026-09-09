-- Last updated: 9/9/2026, 4:21:31 PM
# Write your MySQL query statement below
select name from Customer 
where referee_id!=2 OR referee_id IS NULL;