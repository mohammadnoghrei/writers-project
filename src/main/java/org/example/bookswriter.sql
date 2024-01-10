create table if not exists writers(
    id serial primary key ,
    FirstName varchar(255),
    LastName varchar(255),
    age int
    );

create table if not exists books(
    book_id serial primary key ,
    bookName varchar(255),
    year DATE,
    writerid integer references writers (id)
)