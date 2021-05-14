 ##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101
 
 create table Dept(Dept_id int primary key ,
 Dept_name varchar(30) not null,
 Dept_location varchar(50) not null );
 drop table Dept;
  insert into Dept(Dept_id , Dept_name , Dept_location)
 values(111 ,"BCA" , "ahmedabad"),
	(222 ,"MCA" , "Gandhinagar"),
    (333 , "MBA" ,"Surat");
    
select * from Dept;    