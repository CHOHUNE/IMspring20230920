/*normalization : 정규화  책 209 p
  원자적 데이터: atomic data
  */

/* 예 ) 이름,최종학력,특기 */
CREATE TABLE my_table21_person
(
    name    VARCHAR(100) NOT NULL,
    schools VARCHAR(100),
    skill   VARCHAR(1000)
);

INSERT INTO my_table21_person(name, schools, skill)
    VALUE ('손', '대학', '축구,노래')


/* 각 행은 유잃무이한 식별자인 기본 키를 가지고 있어야 한다. */
CREATE TABLE mytabke24_person
(
    ssn    VARCHAR(10) NOT NULL UNIQUE,
    name   VARCHAR(10) NOT NULL,
    school VARCHAR(10)
);

/* 기본 키 조건 책 216p
   NULL 이 될수 없고
   레코드가 삽입될 때 값이 있어야 함
   기본키의 값은 변경이 불가
   간결해야함
   */

CREATE TABLE my_table25_person
(
    id     INT         NOT NULL UNIQUE AUTO_INCREMENT,
    /* AUTO INCREMENT 1부터 점점 증가되는 값 ( 저절로 ) */
    ssn    VARCHAR(10) NOT NULL UNIQUE,
    name   VARCHAR(10) NOT NULL,
    school VARCHAR(10),
    skill  VARCHAR(10)
);
DROP TABLE my_table25_person;
INSERT INTO my_table25_person(ssn, name, school, skill)
    VALUE ('080101', '흥민', '대학', '축구');
INSERT INTO my_table25_person(ssn, name, school, skill)
    VALUE ('080101', '흥민', '대학', '축구');

SELECT * FROM my_table25_person;


CREATE TABLE my_table26_person
(
    id     INT PRIMARY KEY AUTO_INCREMENT,
    ssn    VARCHAR(10) NOT NULL UNIQUE,
    name   VARCHAR(10) NOT NULL,
    school VARCHAR(10),
    skill  VARCHAR(10)
);
/* PRIMARY KEY : NOT NULL UNIQUE
  정규화를 위해 독자적인 고유 값을 부여하려
   인위적인 키를 만들 때 주로 쓰인다. */

   DESC my_table25_person;
   DESC my_table26_person;

