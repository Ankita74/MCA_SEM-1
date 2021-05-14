##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

create table Emp(Emp_id int  primary key,
 Emp_name varchar(35) not null , 
 Emp_dept_id int not null,
 Emp_boss_id int not null ,
 Emp_salary long not null , 
 Foreign key(Emp_dept_id) REFERENCES Dept(Dept_id));

insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values (101 ,"anu" , 111 , 101 , 150000);
 insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (102 , "mayu" , 111 , 101 , 100000);
  insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (103, "manish" , 111 , 101 , 170000);
insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values   (201 , "ankita" , 222 , 201 , 110000);
 insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (202, "mayuri" , 222 , 201 , 100000);
	 insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (203 , "manisha" , 222 , 201 , 120000);
 insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (301 , "kishan" , 333 , 301 , 135000);
 insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (302 ,"yug" , 333 , 301 , 100000);
 insert into Emp( Emp_id, Emp_name, Emp_dept_id ,Emp_boss_id ,Emp_salary)
 values  (303 , "rutu" , 333 , 301 , 150000);
       
        
select * from Emp;
