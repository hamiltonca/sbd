
create table sdb.account (
    account_id serial primary key,
    username varchar(255) not null,
    password varchar(255),
    email varchar(255),
    created_at timestamp not null,
    last_login timestamp
)