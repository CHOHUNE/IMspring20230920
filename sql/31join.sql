
USE w3schools;
/*서브 쿼리 */
SELECT DISTINCT CustomerID FROM orders ORDER BY 1;

SELECT CustomerName FROM customers WHERE CustomerID NOT IN (SELECT DISTINCT CustomerID FROM orders ORDER BY 1);
/* 주문한 적이 없는 고객들 */

SELECT * FROM customers c LEFT JOIN orders o ON c.CustomerID=o.CustomerID
Where  o.CustomerID is NULL ;
/* 주문한 적이 없는 고객들 2*/


SELECT e.LastName, e.FirstName
FROM employees e LEFT JOIN orders o
ON e.EmployeeID = o.EmployeeID
WHERE o.EmployeeID IS NULL;
/* 주문을 처리한 적이 없는 직원을 조회할 떄 */

SELECT DISTINCT EmployeeID FROM orders ORDER BY 1;
SELECT COUNT (*) FROm employees;

INSERT INTO employees (LastName,FirstName,BirthDate,Photo,Notes)
VALUE ( '손','흥민','2000-01-01','사진1','축수');