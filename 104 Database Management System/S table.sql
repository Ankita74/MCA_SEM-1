##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

create table s ( sno char(3) primary key , sname varchar(50) not null , s_status int not null , 
 s_city varchar(30) not null);
 
insert into s ( sno , sname , s_status , s_city) 
 values ("s1" , "smith" , 10 , "london"),
  ("s2" , "jones" , 20 , "paris"),
 ("s3" , "balcke" , 30 , "paris"),
 ("s4" , "jack" , 20 , "newyork"),
 ("s5", "jerry" , 50 , "london");
 
 select * from s;