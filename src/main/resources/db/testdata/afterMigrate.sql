set foreign_key_checks = 0;

delete from client;
delete from product;
delete from shopping;

set foreign_key_checks = 1;

alter table client auto_increment = 1;
alter table product auto_increment = 1;
alter table shopping auto_increment = 1;


insert into client (id, email, name) values (1, 'talisson.cursos@gmail.com', 'Talisson');
insert into client (id, email, name) values (2, 'tales@gmail.com', 'Tales');
insert into client (id, email, name) values (3, 'rodrigues@hotmail.com', 'Rodrigues');

insert into product (id, name, price) values (1, 'Boné', 25);
insert into product (id, name, price) values (2, 'Bola', 120);
insert into product (id, name, price) values (3, 'Bermuda', 60);
insert into product (id, name, price) values (4, 'Camiseta', 80);
insert into product (id, name, price) values (5, 'Chuteira', 130);

insert into shopping (id, data, quantity, status, client_id, product_id) values (1, UTC_TIMESTAMP, 2,"OK",1,1);
insert into shopping (id, data, quantity, status, client_id, product_id) values (2, UTC_TIMESTAMP, 4,"OK",2,3);
insert into shopping (id, data, quantity, status, client_id, product_id) values (3, UTC_TIMESTAMP, 10,"OK",3,4);

