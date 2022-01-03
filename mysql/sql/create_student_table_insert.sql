/*create database  studentdb; mysql -uroot -p studentdb < create_table_users.sql*/
use studentdb;
create table student (snum int(11),sname varchar(10), major varchar(10),level varchar(10), age int (11));
desc student;
create table faculty  (fid int(11),fname varchar(10), deptid int (11));
desc faculty;
select * from student;
update student set snum=103 where sname='BHABYA';

alter table student add primary key(snum);
desc student;



insert into faculty values(1002,'sunil', 42);
insert into faculty values(1003,'sukruth', 43);
insert into faculty values(1004,'NARSHIMA', 44);
insert into faculty values(1005,'afroz', 41);
insert into faculty values(1006,'john', 42);
insert into faculty values(1007,'ahmed', 45);
insert into faculty values(1008,'Sunitha', 46);
insert into faculty values(1009,'Srivinay' ,42);


