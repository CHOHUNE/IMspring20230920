/*  실제 테이블이 아니라 조회된 테이블이 변경되게 '별칭' 설정 하기 */

SELECT *
FROM employees;
SELECT EmployeeID, LastName
FROM employees;

/* AS : 컬럼명 ( 테이블명) 변경 */

SELECT EmployeeID AS id, LastName AS name
FROM employees;
SELECT EmployeeID, CONCAT(FirstName, ' ', LastName) AS fullName
FROM employees;
/* first + last 로 별칭을 full 로 조회함 */
/* 생략도 가능하다 */

SELECT EmployeeID, CONCAT(FirstName, ' ', LastName) fullName
FROM employees;
/* 별칭에 특수문자, 띄어쓰기를 넣으려면 backtick을 넣어 준다 */
SELECT EmployeeID, CONCAT(FirstName, '  ', LastName) `full name`
FRoM employees;

/* 공급자 이름 , 주소 (adress city contry )연결해서 한 coulmn으로 조회 하기 */
/* 전화번호 ( phone number)로 변경 */
/* 결과 테이블은 supplierName, adress , phone number 3개 컬럼으로 */

SELECT SupplierName, CONCAT(Address, ' : ', City, ' : ', Country), Phone `phone number`
FROM suppliers;


SELECT p.ProductName,c.CategoryName
FROM products p
         JOIN categories c ON p.CategoryID = c.CategoryID;
/*SELECT p.ProductName,c.CategoryName
FROM products AS p
         JOIN categories AS c ON p.CategoryID = c.CategoryID;
*//* 위 형태는 AS 가 생략된 형태이다 */