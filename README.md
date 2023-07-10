# spring-sql-train

## Создание Таблиц

create table Example(
ex_id int primary key, 
ex_name varchar not null, 
ex_lastname varchar not null,
location varchar(30) );  

## Добавление данных

INSERT INTO Example (ex_id, ex_name, ex_lastname, location)
VALUES
(1, 'John', 'Smith', 'New York'),
(2, 'Mia', 'Clark','Florida'),
(3, 'Noah','Rodriguez','Chicago'),
(4, 'Ava','Gracia','Houston'),
(5,'James','Luther','Los Angeles');   

## Пример sql запроса в postgresql

SELECT ex_id, ex_name, ex_lastname, location
FROM Example
