

/* 1: n

347p   1: 1 */

   CREATE TABLE my_table37_employee(
       id INT AUTO_INCREMENT PRIMARY KEY ,
       name VARCHAR(20),
       birth DATE
    );
CREATE TABLE my_table38_employee_info(
    id INT REFERENCES my_table37_employee(id),
    salary INT,
    address VARCHAR(20)
);


#  350p n:m 다대 다 두개의 테이블을 만들려면 참조용 테이블을 하나 더 만들어야 한다
/* 2개의 다대다 테이블을 만들고 싶다 -> 총 3개 생성 */
# 1:n 1:m 인 중간 테이블이 생성 되어야 한다
CREATE TABLE my_table39_person(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20)
);

CREATE TABLE my_table40_skill(
    id INT PRIMARY KEY AUTO_INCREMENT,
    skill_name VARCHAR(20)
);
CREATE TABLE my_table41_person_skill(
    person_id INT REFERENCES my_table39_person(id),
    skill_id INT REFERENCES my_table40_skill(id),
    PRIMARY KEY (person_id,skill_id)
);



