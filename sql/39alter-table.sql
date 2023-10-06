USE w3schools

# ALTER TABLE : 테이블 수정
# 컬럼 추가, 변경, 삭제

# NOT NULL, UNIIQUE , PRIMARY KEY , DEFAULT , FOREIGN KEY
# 컬럼 추가

ALTER TABLE products ADD COLUMN col1 INT;
ALTER TABLE products ADD COLUMN col2 VARCHAR(10);
/*products 테이블에 다음과 같이 컬럼을 추가합니다:
col1: INT 데이터 타입
col2: VARCHAR(10) 데이터 타입
products 테이블에 col3 컬럼을 ProductName 컬럼 바로 다음에 추가합니다.
products 테이블에 col4 컬럼을 테이블의 첫 번째로 추가합니다.
products 테이블에 다음과 같이 col5 컬럼을 추가합니다:
INT 데이터 타입
NOT NULL 제약 조건
기본값(DEFAULT)은 1로 설정
employees 테이블의 EmployeeID를 참조(Foreign Key)합니다.
employees 테이블에 다음과 같이 salary 컬럼을 추가합니다:
DEC(10,2) 데이터 타입
NOT NULL 제약 조건
기본값(DEFAULT)은 0.00으로 설정
products 테이블에서 col1과 col2 컬럼을 삭제합니다.
products 테이블에서 col3와 col4 컬럼의 데이터 타입을 변경합니다:
col3의 데이터 타입을 INT로 변경
col4의 데이터 타입을 VARCHAR(10)에서 VARCHAR(20)으로 변경*/

ALTER TABLE products
ADD COLUMN  col1 INT;
ALTER TABLE products
ADD COLUMN  col2 VARCHAR(10);
#  타입명을 정해줘야 한다

ALTER TABLE products
ADD COLUMN col3 VARCHAR (10) AFTER ProductName;
#  순서도 정할 수 있다

ALTER TABLE products
ADD COLUMN col4 VARCHAR (10) FIRST ;

ALTER TABLE products
ADD COLUMN col5 INT NOT NULL DEFAULT 1 REFERENCES employees(EmployeeID);

#  직원 테이브렝 salary 컬럼 마지막에 추가
#  data type은 dec(10,2) null x default는 0.00

ALTER TABLE employees
ADD COLUMN salary DEC(10,2) NOT NULL DEFAULT 0.00 ;

ALTER TABLE products
DROP COLUMN col1;

ALTER TABLE products
DROP COLUMN col2;

# 컬럼 변경( type)

ALTER TABLE products
MODIFY COLUMN col3 INT;

ALTER TABLE products
MODIFY CoLUMN col4 INT;

ALTER TABLE products
    MODIFY CoLUMN col4 VARCHAR(10);

ALTER TABLE products
    MODIFY CoLUMN col4 VARCHAR(20);
# 늘어난 크기를 줄이는 건 위험하다.