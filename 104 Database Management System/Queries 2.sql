##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

/*query1. show employee name,employe department name,boss name,boss depatment name.*/
select emp.Emp_name,dept.Dept_name,boss.Emp_name as BossName ,bdept.Dept_name as BossDeptName
from emp, emp as boss , dept, dept as bdept where emp.Emp_boss_id = boss.Emp_id 
and emp.Emp_dept_id = dept.Dept_id
and boss.Emp_dept_id = bdept.Dept_id;

/*query2. show employee name,employe depatment name,boss name,boss depatment name
 where employe salary greater then boss salary. */
 select emp.Emp_name,dept.Dept_name,boss.Emp_name as BossName,bdept.Dept_name as BossDeptName,emp.emp_salary, 
boss.emp_salary as BossSalary 
from emp, emp as boss , dept, dept as bdept where emp.Emp_boss_id = boss.Emp_id 
and emp.Emp_dept_id = dept.Dept_id
and boss.Emp_dept_id = bdept.Dept_id
and emp.emp_salary > boss.emp_salary;


 /*Query 3. show department name and that deparment maximum salary.*/
(select max(Emp_salary) as Salary,Dept_name as DeptName from emp,dept where emp.Emp_dept_id= dept.Dept_id
group by Dept_id);

/*Query 4. show employe department name,that department total employe count.*/
select count(Emp_id) as Employess,Dept_name as DeptName from emp,dept where emp.Emp_dept_id= dept.Dept_id
group by Dept_id;


