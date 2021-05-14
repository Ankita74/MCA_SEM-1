##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

create table p (pno char(3) primary key , pname varchar(50) not null , color varchar(30) not null , 
 weight double not null , p_city varchar(30) not null);
 
insert into p (pno , pname , color , weight , p_city) 
  values ( "p1" , "nut" , "red" , 10.0 , "london"), 
	("p2" , "bolt" , "white" , 20.0 , "paris"), 
	("p3" , "screw" ,"green " , 12.0 , "newyork"),
    ("p4" ,"book" ,"black" , 25.0 , "london"),
    ("p5" , "pen" , "blue" ,22.0 , "paris");
    
select * from p;

