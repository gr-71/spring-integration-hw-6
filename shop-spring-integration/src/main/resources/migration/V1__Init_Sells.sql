create table sells ( id bigserial not null,
                    order_id bigserial,
                    username varchar(255),
                    product_title varchar(255),
                    amount numeric (8, 2),
                    sum numeric(16, 2),
                    primary key (id),
                    sells_fk_user foreign key (user_id) references users
);