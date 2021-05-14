##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

create table sp(sno char(3) not null,
pno char(3) not null ,
qty int not null,
primary key(sno , pno),
Foreign key (sno) references s(sno),
Foreign key (pno) references p(pno));

insert into sp(sno , pno , qty)values("s1" , "p1" , 300);
 insert into sp(sno , pno , qty)values("s2" ,"p2" , 100);
 insert into sp(sno , pno , qty)values("s3" ,"p3" ,400);
  insert into sp(sno , pno , qty)values("s4" ,"p4" ,200);
   insert into sp(sno , pno , qty)values("s5" ,"p5" ,300);
 insert into sp(sno , pno , qty)values("s1" ,"p2" ,300);
 insert into sp(sno , pno , qty)values("s2" ,"p1" ,200);
 insert into sp(sno , pno , qty)values("s3" ,"p2" ,500);
insert into sp(sno , pno , qty)values("s4" ,"p3" ,300);
 insert into sp(sno , pno , qty)values("s5" ,"p4" ,250);
 
 select * from sp;
 drop table sp;

