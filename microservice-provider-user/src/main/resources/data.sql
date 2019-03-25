drop table user;
# id, username, name, age, balance
create table `user`
(
 `id`       bigint auto_increment primary key,
 `username` varchar(20),
 `name`     varchar(20),
 `age`      integer ,
 `balance`  decimal(10, 2)
) auto_increment = 33;

select * from user;
select * from user where name = 'wtt';

insert into user values(66, 'wtt', 'name', 20, 1);
insert into user values(67, 'wtt', 'name', 20, 1);
insert into user values(68, 'wtt', 'name', 20, 1);
insert into user values(69, 'wtt', 'name', 20, 1);
insert into user values(70, 'wtt', 'name', 20, 1);
insert into user values(71, 'cll', 'name', 20, 1);
