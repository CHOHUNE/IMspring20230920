USE w3schools;

SELECT Price
FROM products
WHERE ProductName = 'ipoh coffee';

SELECT ProductName, Price
FROM products
WHERE Price > 46.00;

SELECT ProductName, Price
FROM products
WHERE Price > (SELECT Price FROM products WHERE ProductName = 'ipoh coffee');

SELECT BirthDate
FROM employees
WHERE LastName = 'Leverling';

SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate < '1963-08-30';

SELECT LastName, FirstName, BirthDate
FROM employees
WHERE BirthDate < (SELECT BirthDate
                   FROM employees
                   WHERE LastName = 'Leverling');

SELECT ShipperID
FROM orders
WHERE OrderDate = '1996-07-08';
/* 행 여러개 열1개 */
SELECT CustomerName
FROM customers
WHERE Country = 'mexico';


-- 행여러개 열여러개
SELECT CustomerID, CustomerName
FROM customers
WHERE Country = 'mexico';


-- 행1개 열1개 예제
-- 'Tofu' 상품을 공급하는 공급자명
SELECT SupplierID
FROM products
WHERE ProductName = 'tofu';

SELECT SupplierID, SupplierName
FROM suppliers
WHERE SupplierID = 6;

SELECT SupplierID, SupplierName
FROM suppliers
WHERE SupplierID = (SELECT SupplierID FROM products WHERE ProductName = 'tofu');

SELECT p.SupplierID, s.SupplierName
FROM suppliers s
         JOIN products p ON s.SupplierID = p.SupplierID
WHERE p.ProductName = 'tofu';

#  여러행 1개 열 일때

SELECT CustomerID
FROM customers
WHERE Country = 'mexico';
SELECT OrderDate
FROM orders
WHERE CustomerID IN (2, 3, 13, 58, 80);

SELECT OrderDate
FRom orders
WHERE CustomerID IN (SELECT CustomerID FROM customers WHERE Country = 'mexico');


#  1번 카테에 있는 상품이 주문된 주문번호 ( orderDetails, products )

SElECT ProductID
FROM products
WHERE CategoryID = '1';
SELECT *
FROM orderdetails
WHERE ProductID IN (SElECT ProductID
                    FROM products
                    WHERE CategoryID = '1');

/* 1 번 카테에 있는 상품이 주문된 날짜 */

SELECT OrderDate
From orders
WHERE OrderID IN (SELECT OrderID
                  FROM orderdetails
                  WHERE ProductID IN (SElECT ProductID
                                      FROM products
                                      WHERE CategoryID = '1'));

SELECT *
FROM orders o
         JOIN orderdetails od On o.OrderID = od.OrderID
         JOIN products p ON od.ProductID = p.ProductID
WHERE p.CategoryID = 1;

#  주문한 적 없는 고객들
#  여러 행 한개 테이블
SELECT CustomerID
FROM orders;

SELECT *
FROM customers
WHERE CustomerID NOT IN (SELECT CustomerID FROM orders);

INSERT INTO customers(CustomerName, Address, Country);


SELECT *
FROM customers
WHERE (City, Country) IN (SELECT city, Country FROM suppliers);

CREATE TABLE table_c
SELECT CustomerName, City, Country
FROM customers;

SELECT *
FROM table_c;
DESC table_c;

#  예 ) 1번 카테고리에 있는 상품들로 새 테이블을 만드는데
#  새로운 테이블은 productName,categoryName, price

SELECT *
FROM products;

CREATE TABLE new_table
SELECT ProductName, CategoryName, Price
FROM products
         JOIN categories on products.CategoryID = categories.CategoryID
WHERE categories.CategoryID = '1';

