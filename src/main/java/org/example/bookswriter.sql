create table if not exists writers(
    id serial primary key ,
    FirstName varchar(255),
    LastName varchar(255),
    age int
    );

create table if not exists books(
    bookName varchar(255),
    year int,
    writerid integer references writers (id)
)