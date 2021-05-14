##Name:-GOJIYA ANKITA KESURBHAI
##Enrollment NO:-12008101

select * from account;
create table account (acc_no int ,
					 amount decimal(10 , 2));
                     

insert into account (acc_no , amount) 
			values( 24925 , 500000),
					(25462, 600000),
                    (26985 , 450000);

/* create trigger that make sum of amount inserted in table*/
create trigger int_sum before insert on account for each row set @sum=@sum+new.amount;
set @sum=0;
select @sum as 'total amount';
drop trigger ins_transaction;
drop trigger demo.int_sum;

/*create trigger that make sum of amount inserted in table to credit and debit according to amount + or -*/
create trigger ins_transaction before insert on account for each row precedes int_sum set
@deposite = @deposite +if(new.amount > 0 , new.amount , 0) ,
@withdrawal = @withdrawal +if(new.amount <0 , -new.amount , 0);
set @deposite =0;
set @withdrawal = 0;
set @sum=0;
insert into account (acc_no , amount) 
			values( 27965 , 40000),
					(28462, -2000),
                    (26925 , 50000);
select @deposite AS 'total amount';
select @withdrawals as 'total withdrawal';
select @deposite as 'total deposite ' , @withdrawal as 'total withdrawl' ,@sum as 'total amount';