##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

/*1 que. show all parts located at londan city.*/
select * from p where p_city ="london"; 

 /*2 que. show maximum weight part name*/
select pname from p where weight = (select max(weight) from p);

 /*3 que. show all parts name,part number for part color=red.*/
select  pname , pno from p where color="red";

 /*4 que. show suppler name,suppler city who supply part qty more than 200.*/
select sname , s_city  from s, sp where s.sno = sp.sno and sp.qty > 200; 

 /*5 que. show second hightst weight of part.*/
select max(weight) from p where weight < (SELECT max(weight) from p);

 /*6 que. show suppler no and qty for part supply for hights weight part.*/
select sp.sno, sp.qty from sp, p where sp.pno = p.pno and p.weight = (select max(weight) from p);

/*7 que. show suppler name and qty for part color is "red" supply.*/
Select s.sname, sp.qty from sp,p,s where p.color="red" and sp.pno = p.pno and sp.sno= s.sno;

/*8 que. show suppler name,pat city and qty for suppler status is less than 30 shipment supply.*/
select s.sname,p.p_city,sp.qty from sp,p,s where sp.pno=p.pno and sp.sno=s.sno and s.s_status<30;

/*9 que. show each supplers total qty supply.*/
select s.sname, sum(sp.qty) from sp,s where sp.sno = s.sno group by sp.sno;

/*10 que. show each parts total qty supply*/
select sp.pno, p.pname, sum(sp.qty) from sp,p where sp.pno = p.pno group by p.pno;

 /*11 que. show each part a name total qty supply.*/
select p.pname, sum(sp.qty) from sp,p where sp.pno = p.pno group by p.pname;

 /*12 que. show each suppers whose suppler number is less then 's4' give total qty supply by each suppler.*/
select s.sname, s.sno, sum(sp.qty) from sp,s where sp.sno = s.sno group by sp.sno having sp.sno < "s4";

 /*13 que. show each suppers whose suppler is 20 give total qty supply each suppler.*/
select s.sname, s.sno, sum(sp.qty) from sp,s where sp.sno = s.sno and s.s_status = 20 group by sp.sno ;

