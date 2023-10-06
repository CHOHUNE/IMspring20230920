/*
수형(정수,실수)


*/

CREATE TABLE my_table(
    col1 int
);

INSERT INTO  my_table (col1)
VALUE (2987843);

INSERT INTO  my_table(col1)
VALUE ('12300');
INSERT INTO my_table(col1)
VALUE('two');


CREATE TABLE my_table4(
    col1 DEC
)

/* my_table6 만들기
   age 컬럼 정수 타입
   score 컬럼 총길이 8 소숫점 이하 길이 2*/

CREATE TABLE my_table6
(
    age   INT,
    score DEC(7, 2)
);                      /* DECIMAL 길이 7 소수점 2 */

INSERT INTO my_table6(age, score)
VALUE


CREATE TABLE my_table7(
    col1 VARCHAR(1),
    col2 VARCHAR(2),
    col3 VARCHAR(500)
);
/* 1,2,500개의 문자열 */

INSERT INTO my_table7 (col1)
VALUE('a');
INSERT INTO my_table7 (col2)
VALUE('a');

SELECT * FROM my_table7;

/* my_table9 만들기
   name 문자열 최대길이 100
   주소 문자열 chleorlfdl 200
   전화번호 문자열 최대길이 100*/


CREATE TABLE my_talbe9(
    name VARCHAR(100),
    address VARCHAR(200),
    phoneNumber VARCHAR(100)
);

CREATE TABLE my_table10(
    col1 DATE
);
    INSERT INTO my_table10 (col1)
    VALUE ('2000-01-01');

INSERT INTO my_table10(col1)
VALUE (Now());


CREATE TABLE my_table11(
    col1 DATETIME
);


INSERT INTO my_table11 (col1)
VALUE ('2002-12-30 14:05:12');

INSERT INTO my_table11(col1)
VALUE(NOW());
SELECT * FROm my_table11;

SELECT NOW();
