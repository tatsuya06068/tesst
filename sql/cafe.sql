set names utf8;
set foreign_key_checks = 0;
drop database if exists cafe;

create database if not exists cafe;
use cafe;

/*ユーザー情報*/
drop table if exists use_info;

create table  user_info(
    userId int not null primary key auto_increment,
   userName varchar(10),
   password varchar(10)
);

/*商品情報*/
drop table if exists product_info;

  create table product_info(
     id  int not null primary key auto_increment,
    productName varchar (10) not null ,
    productDiscription varchar (50),
    categoryId int not null,
    image_file_path varchar (300)
);


/*予約情報*/
drop table if exists reservation_info;
create table reservation_info(
name varchar(10) not null,
email varchar(30)not null,
body varchar(50)not null,
reservation_date varchar(10) not null
);




INSERT into user_info(userName,password)
VALUES("master","123");

 INSERT into product_info(productName,productDiscription ,categoryId,  image_file_path)
VALUES("ショートケーキ","ケーキです",1,"./images/1563709318178.jpg"),
              ("ショートケーキ1","ケーキです",1,"./images/1563709322683.jpg"),
             ("ショートケーキ2","ケーキです",1,"./images/1563709337187.jpg"),
              ("ショートケーキ3","ケーキです",1,"./images/1563709318178.jpg"),
               ("ショートケーキ4","ケーキです",1,"./images/1563709322683.jpg"),
                 ("ショートケーキ5","ケーキです",1,"./images/1563709337187.jpg"),
               ("ショートケーキ6","ケーキです",1,"./images/1563709318178.jpg"),
                 ("ショートケーキ7","ケーキです",1,"./images/1563709322683.jpg"),
                  ("ショートケーキ8","ケーキです",1,"./images/1563709337187.jpg");

