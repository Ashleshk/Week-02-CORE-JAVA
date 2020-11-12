# Day-05
1. Prepared Statement

2. Stored procedure JDBC
```sql
create table product (Id integer not null unique, name varchar(50) not null, price decimal(10,2));
 
insert into product values(1,"Pencil", 15.15);
insert into product values(2,"Pen", 20.00);
insert into product values(3,"Color Box", 12.45);

DELIMITER $$
CREATE PROCEDURE PRODUCT_PROC2 (IN pid int, OUT pname varchar(50),INOUT pprice decimal(10,2))
BEGIN
declare tempPrice decimal(10,2);   
-- Select data
select name,price into pname,tempPrice from product where id = pid;   
-- Update new price
update product set price=pprice where  id = pid;
-- Return old price
set pprice= tempPrice;   
END$$
```

```sql
create table author (author_id integer primary key, authorName varchar(30), email varchar (25), gender varchar (6));

 

create table book (BookId integer not null unique, ISBN integer primary key, book_name varchar (30) not null, author integer, 
ed_num integer, price integer, pages integer, foreign key (author) references author (author_id) on delete cascade);

 

insert into author values (1, "Kraig Muller", "Wordnewton@gmail.com", "Male");
insert into author values (2, "Karrie Nicolette", "karrie23@gmail.com", "Female");

 

insert into book values (1, 001, "Glimpses of the past", 1, 1, 650, 396);
insert into book values (2, 002, "Beyond The Horizons of Venus", 1, 1, 650, 396);
insert into book values (3, 003, "Ultrasonic Aquaculture", 2, 1, 799, 500);
insert into book values (4, 004, "Cyrogenic Engines", 2, 1, 499, 330); 

 


delimiter //
create procedure update_price (IN temp_ISBN varchar(10), IN new_price integer)
begin
update book set price=new_price where ISBN=temp_ISBN;
end; //
DELIMITER ;
```


Create the JDBC
 (a) Create the new database
 (b) using the new database create a new table in mysql (  employee with tow departments values ' IT, 'HR')
 (c) insert minimum 5 values using the JDBC program
 (d) Update the 2 records of the table
 (e) delete the 3rd record from the table
 (f) find the sum of the total salary from the table of all employees
 (g) find the count of all employees of a particular dept 'IT' only


-----------------------------------------------------------------------------------------------
## static 
 * --shared value for all objects
 * static methods can only have stci variables  but in non-static methods we can have both
 * static methods can be called with class name as well as class obj
    * ex: 
     ```java
        s1.change();  // static method can be called as 
		Student.change();
     ```