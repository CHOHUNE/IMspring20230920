/*
null허용 여부
유일한 값 여부
기본 값 지정
값 체크
*/
USE mydb1;

CREATE TABLE my_table13(
    col1 INT NULL,
    col2 INT NOT NULL
)

INSERT INTO my_table13 (col1, col2) VALUE (33,44);

INSERT INTO my_table13 (col2) VALUE (55);

INSERT INTO my_table13 (col1) VALUE (66);

SELECT * FROM my_table13;

CREATE TABLE my_table14(
    col1 INT,
    col2 INT UNIQUE
);
INSERT INTO my_table14(col1,col2)
VALUE ( 11,22);

INSERT INTO  my_table14(col1,col2)
VALUE (11,33);

INSERT INTO  my_table14(col1,col2)
VALUE (11,33);
# NOT OK cuase UNIQUE

SELECT * FROM my_table14;

CREATE TABLE my_table15(
    col1 INT,
    col2 INT NOT NULL,
    col3 INT UNIQUE ,
    col4 INT NOT NULL UNIQUE
)

INSERT INTO my_table15(col1,col2,col3,col4)
VALUE (11,22,33,44);

INSERT INTO my_table15(col1,col2,col3,col4)
VALUE (11,22,33,44);
/* NOT OK CAUSE  UNIQUE */

INSERT INTO my_table15(col1,col2,col3,col4)
VALUE(11,22,44,NULL);

INSERT INTO my_table15(col1,col2,col3,col4)
VALUE(11,22,44,55);

SELECT * FROM my_table15;

/* DEFAULT */

CREATE TABLE my_table17(
    col1 INT,
    col2 INT DEFAULT 100,
    col3 VARCHAR(10) DEFAULT  'empty',
    col4 DATETIME DEFAULT  NOW()
);

INSERT INTO my_table17(col1,col2,col3,col4)
VALUE (22,33,'son','2023-11-11 22:23:24');
INSERT INTO  my_table17 (col1)
VALUE(222);

CREATE TABLE my_table18(
    col1 INT,
    col2 INT DEFAULT 300,
    col3 INT NOT NULL DEFAULT 500
);

INSERT INTO my_table18(col1,col2,col3)
VALUE (3,NULL,NULL);
/* NOT OK CAUSE NULL */
INSERT INTO my_table18(col1,col2,col3)
VALUE(3,222)
/* OK CAUSE EMPTY */

INSERT INTO my_table18(col1)
VALUE (4);

CREATE TABLE my_table19(
    col1 INT NOT NULL UNIQUE DEFAULT 100
);

/* 테이블의 컬럼과  타입, 제약사항 확인 */
/* DESCRIBE - DESC */

DESCRIBE my_table18;
DESC my_table18;


DESC my_table15;


/* TABLE 생성 쿼리 확인 */

SHOW CREATE TABLE my_table15;


CREATE TABLE my_table20(
    col1 INT,
    col2 INT CHECK ( col2>200 ),
    col3 INT CHECK ( col3>1000 AND col3 <3000 )
);

DESC my_table20;

INSERT my_table20 ( col1,col2,col3)
VALUE( 10000,50,-10);
/*NOT OK CAUSE INT CHECK */
INSERT my_table20 ( col1,col2,col3)
    VALUE( 10000,50,1500)
/* OK */
