

SELECT *
FROM employees
ORDER BY 4;
/*4인 이유는 column 4가 birthDate이기 때문!*/
SELECT  EmployeeID, LastName,BirthDate FROM employees ORDER BY  BirthDate;

 /* 고객을 국가명 오름차순으로 조회 */
 /* 가격이 비싼 상품이 먼저 조회 되도록 */
 /* 가장 어린 직원이 조회 되도록 */

 SELECT CustomerName,Country FROM customers ORDER BY Country ASC;
 SELECT ProductName,Price FROM products ORDER BY  Price DESC;
 SELECT EmployeeID, CONCAT(LastName, ' ', FirstName)FullName, BirthDate FROM employees ORDER BY BirthDate desc




