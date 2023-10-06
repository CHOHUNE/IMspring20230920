
SELECT price FROM products WHERE ProductID=1;

SELECT ProductName+1,Price FROM products;
/* 연결 연산은 불가함 */
SELECT CONCAT(ProductName,1), Price FROM products;
/* 연결 연산은 CONCAT  */


SELECT LastName,BirthDate FROM employees WHERE EmployeeID=1;
SELECT LastName,BirthDate+1 FROM employees WHERE EmployeeID=1;
/* DATE FORMAT 에도 산술 연산이 가능 */
SELECT LastName,ADDDATE(BirthDate,INTERVAL  1 DAY) FROM employees WHERE EmployeeID=1;

SELECT * FROM employees;
SELECT EmployeeID, LastName,FirstName FROM employees;
SELECT EmployeeID, CONCAT(LastName,FirstName) FROM employees;
/* Last + First를 연결 연산 */
SELECT EmployeeID, CONCAT ( FirstName,' ',LastName) FROM employees;
SELECT EmployeeID, CONCAT(FirstName,' ',LastName),ADDDATE(BirthDate,INTERVAL  1 YEAR)FROM employees;

/* 주문수량 *2 결과 조회 order Details */
/* city, country 고객 테이블 조회 */

SELECT Quantity*2 FROM orderdetails;
SELECT CONCAT(city,' : ',Country) FROM customers

