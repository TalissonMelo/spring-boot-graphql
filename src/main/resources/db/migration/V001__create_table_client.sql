create table client (
    id    bigint auto_increment primary key,
    email varchar(255) null,
    name  varchar(255) null
)engine = InnoDB default charset=utf8;