

/*
PRIMARY KEY ( 주키, 기본키 , pk )
*/
USE mydb1;
CREATE TABLE my_table27(
    id INT PRIMARY KEY ,
    name VARCHAR(20)
);

CREATE TABLE my_table28(
    id INT,
    name VARCHAR(10),
    PRIMARY KEY (id)
);

CREATE TABLE  my_table29(
    name VARCHAR(10),
    birth DATE,
    PRIMARY KEY (name,birth)
);

CREATE TABLE my_table30(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10)
);

INSERT INTO my_table30(name)
VALUE ('son');

SELECT * FROM my_table30;
DELETE FROM my_table30 WHERE id='4';
/* 4번을 지워서 다음 번에 4번이 채워지는 게 아님 */