# 첫 번째 정규화 1NF
/*
원자적 데이터를 가진 테이블 PK 컬럼 필수

책 369p
두 번째 정규화 2NF
1NF 이고, 부분적 함수 의존이 없어야 함

부분적 함수 의존
키가 아닌 컬럼의 값이 키 키럼 일부에 흡수되지 않아야 한다
키의 일부가 변경되면 키가 아닌 컬럼이 변경 되어야한다.

책 374p
세번째 정규화 3NF
이미 2NF 이고 ( 이미 자동 증가 인위적인 키컬럼이 있고 )
이행정 종속이 없어야 한다.
키가 아닌 컬럼이 키가 아닌 다른 컬럼에 의존
키가 아닌 컬럼이 변경 되면 다른 키가 아닌 컬럼이 변경되어야 할 때
*/

/*입사 지원자, 이름 , 최종학교, 학교 주소 */
USE mydb1;
CREATE TABLE my_table30_person
(
    id             INT PRIMARY KEY AUTO_INCREMENT,
    name           VARCHAR(10),
    school         VARCHAR(10),
    school_address VARCHAR(10)
);
INSERT INTO my_table30_person (name, school, school_address)
    VALUE ('흥민', '샤대', '관악'), ('강인', '고려대', '안암'), ('민재', '연세대', '신촌'), ('지성', '고려대', '안암');
SELECT *
FROM my_table30_person;

CREATE TABLE my_table31_person
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(10),
    school VARCHAR(10)
);

CREATE TABLE my_table32_school
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    school_name VARCHAR(10),
    address     VARCHAR(10)
);
/* 지역, 학교가 묶여서 3NF 에 충족하지 못해서 school을 따로 빼서 table을 두개 만들엇따 */

INSERT INTO my_table31_person (name, school)
VALUES ('흥민', '샤대'),
       ('강인', '고려대'),
       ('민재', '연세대'),
       ('지성', '고려대');

INSERT INTO my_table32_school (school_name, address)
VALUES ('서울대', '관악'),
       ('고려대', '안암'),
       ('연세대', '신촌');

CREATE TABLE my_table33_person
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(10),
    school_id INT
);
/* 한 테이블의 컬럼이 다른 테이블을 참조하게 되면
   pk를 사용해야 한다.
   */
CREATE TABLE my_table34_school
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    school_name VARCHAR(10),
    address     VARCHAR(10)
);

INSERT INTO my_table33_person (name, school_id)
VALUES ('흥민',1),('강인',2),('민재',1);

INSERT INTO my_table34_school(school_name,address)
VALUES ('서울대', '관악'),
       ('고려대', '안암'),
       ('연세대', '신촌');

SELECT * FROM my_table34_school;

INSERT INTO my_table33_person(name,school_id)
VALUES ('지성',4);


CREATE TABLE my_table35_person
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    name   VARCHAR(10),
    school_id INT REFERENCES my_table36_school(id)
);
/* 한 테이블의 컬럼이 다른 테이블을 참조하게 되면
   pk를 사용해야 한다.
   외래키 (foreign key) 제약사항
   */
CREATE TABLE my_table36_school
(
    id          INT PRIMARY KEY AUTO_INCREMENT,
    school_name VARCHAR(10),
    address     VARCHAR(10)
);
INSERT INTO my_table35_person (name, school_id)
VALUES ('흥민',1),('강인',2),('민재',1);

INSERT INTO my_table36_school(school_name,address)
VALUES ('서울대', '관악'),
       ('고려대', '안암'),
       ('연세대', '신촌');

DESC my_table35_person;
SHOW CREATE TABLE my_table35_person;
