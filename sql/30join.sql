/* INNER JOIN 교집합

   LEFT JOIN table1에 해당하는 교집합과 table1
   RIGHT JOIN table2에 해당하는 교집합 table2

   */

USE mydb1;

CREATE TABLE my_table42_a
(
    col1 VARCHAR(1)
);

CREATE TABLE my_table43_b
(
    col1 VARCHAR(1)
);

INSERT INTO my_table42_a (col1)
VALUES ('a'),
       ('b'),
       ('c');

insert into my_table43_b(COL1)
values ('b'),
       ('c'),
       ('d'),
       ('e');

SELECT * FROM my_table42_a a JOIN my_table43_b b ON a.col1=b.col1;
/* INNER JOIN */

SELECT * FROM my_table42_a a INNER JOIN my_table43_b b ON a.col1=b.col1;

SELECT * FROM my_table42_a a LEFT JOIN my_table43_b b ON a.col1=b.col1;
SELECT * FROM my_table42_a a LEFT OUTER  JOIN my_table43_b b ON a.col1=b.col1;


SELECT * FROM my_table42_a a RIGHT JOIN my_table43_b b ON a.col1=b.col1;
/* 우측 테이블에만 있는 d e 를 포함한 교집합 b c  */


CREATE TABLE my_table44_a(
    col1 VARCHAR(1),
    name VARCHAR(10),
    address VARCHAR(10)
);
CREATE TABLE my_table45_b(
    col1 VARCHAR(1),
    product VARCHAR(10),
    cuntry VARCHAR(10)
);

INSERT INTO my_table44_a ( col1, name , address)
VALUES ('a','흥','london'),('b','이','베룰린'),('c','민','뮌헨');

INSERT INTO my_table45_b (col1,product,cuntry)
VALUES('b','추','한'),('c','컴','미'),('c','햄','양국'),('d','전','호주');

SELECT * FROM my_table44_a a JOIN my_table45_b b ON a.col1 = b.col1;

SELECT * FROM my_table44_a a LEFT JOIN my_table45_b b ON a.col1= b.col1;
SELECT * FROM my_table44_a a RIGHT JOIN my_table45_b b ON a.col1= b.col1;
