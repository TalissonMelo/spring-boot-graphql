create table shopping
(
    id         bigint auto_increment primary key,
    data       datetime     null,
    quantity   int          null,
    status     varchar(255) null,
    client_id bigint       null,
    product_id bigint       null,
    constraint FK_SHOPPING_PRODUCT foreign key (product_id) references product (id),
    constraint FK_SHOPPING_CLIENT foreign key (client_id) references client (id)
)engine = InnoDB default charset=utf8;