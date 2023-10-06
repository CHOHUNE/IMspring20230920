USE w3schools;
# 집계함수, 집합함수, 그룹함수
# MAX, MIN, COUNT , SUM , AVG

SELECT MAX(Price)
FROM products;

SELECT *
FROM products
ORDER BY Price DESC;


SELECT ProductName, MAX(Price)
FROM products;

SELECT *
FROM products
WHERE Price = (SELECT MAX(Price) FROM products);

SELECT MIN(Price)
FROM products;

SELECT *
FROM products
WHERE PRICE = (SELECT MIN(Price) FROM products);

#  가장 어린 직원명 조회 ,
SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate = (SELECT MAX(BirthDate) FROM employees);
SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate = (SELECT MIN(BirthDate) FROM employees);



SELECT BirthDate,LastName FROM employees WHERE BirthDate=(SELECT MIN(BirthDate) FROm employees);


# COUNT
SELECT *
FROM employees;
SELECT COUNT(EmployeeID)
FROM employees;

#  NULL 은 포함하지 않음
INSERT INTO employees(LastName)
    VALUE ('흥민');
SELECT *
FROM employees
ORDER BY 1 DESC;

SELECT MIN(BirthDate)
FROM employees;
SELECT MAX(BirthDate)
FROM employees;

INSERT INTO products(ProductName) VALUE ('커피');
SELECT *
FROM products
ORDER BY 1 DESC;
SELECT MIN(Price)
FROM products;
# 커피의 값인 NULL이 안구해짐 -> NULL을 0으로 환산해서 넣자

SELECT MIN(IFNULL(Price, 0))
FROM products;
SELECT *
FROM products
WHERE IFNULL(Price, 0) = (SELECT MIN(IFNULL(Price, 0)) FROM products);

SELECT SUM(od.Quantity)
FROM orders o
         JOIN orderdetails od ON o.OrderID = od.OrderID
WHERE o.OrderDate = '1996-07-04';

#  96년 7월 4일 매출액 구하기
SELECT SUM(p.Price * od.Quantity)
FROM products p
         JOIN orderdetails od ON od.ProductID = p.ProductID
         JOIN orders o ON o.OrderID = od.OrderID
WHERE o.OrderDate = '1996-07-04';




#  AVG 평균
SELECT AVG(Price) FROM products;
SELECT SUM(Price) FROM products;

SELECT COUNT(ProductID) FROM products;
SELECT COUNT(Price) FROM products;
# NULL은 카운트가 안됨







