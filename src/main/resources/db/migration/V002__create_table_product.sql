create table product(
    id    bigint auto_increment primary key,
    name  varchar(255) null,
    price double not null
)engine = InnoDB default charset=utf8;