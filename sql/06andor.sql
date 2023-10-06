SELECT *
FROM customers;
SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'spain';
SELECT CustomerName, City, Country
FROM customers
WHERE City = 'Madrid';
SELECT CustomerName, City, Country
FROM customers
WHERE City = 'Madrid'
  AND Country = 'Spain';
SELECT CustomerName, City, Country
FROM customers
WHERE City = 'Madrid'
  AND Country != 'Spain';
SELECT CustomerName, City, Country
FROM customers
WHERE City != 'Madrid'
  AND Country = 'Spain';
SELECT CustomerName, City, Country
FROM customers
WHERE City != 'Madrid'
  AND Country != 'Spain';

SELECT CustomerName, City, Country
FROM customers
WHERE NOT (City = 'Madrid' AND Country = 'Spain');

SELECT CustomerName, City, Country
FROM customers
WHERE City != 'Madrid'
   OR Country != 'Spain';

SELECT CustomerName, City, Country
FROM customers
WHERE City = 'Madrid';
SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'Spain';
SELECT CustomerName, City, Country
FROM customers
WHERE City = 'Madrid'
   OR Country = 'Spain';
SELECT CustomerName, City, Country
FROM customers
WHERE Country = 'Spain'
   OR Country = 'UK';

SELECT *
FROM products
WHERE Price >= 10.00
  AND Price <= 20.00;
SELECT *
FROM customers
WHERE CustomerName >= 'c'
  AND CustomerName < 'd';
SELECT *
FROM employees
WHERE BirthDate >= '1958-01-01'
  AND BirthDate < '1959-01-01';

/* 스웨덴이나 이탈리아에 있는 공급자들 조회
   1963 8 월생 직원 조회
   가격이 100~200 포함 사이인 상품 조회
   1997 년에 주문한 주문 조회 */

SELECT *
FROM suppliers
WHERe Country = 'sweden'
   OR Country = 'italy';

SELECT *
FROM employees
WHERE BirthDate >= '1963-08-01'
  AND BirthDate <= '1963-08-01';
SELECT *
FROM products
WHERE Price >= 100.00
  AND Price <= 200.00;

SELECT *
FROM orders
WHERE OrderDate >= '1997-01-01'
  AND OrderDate <= '1997-12-31';

/* 괄호를 활용한 우선순위 부여하기 */
SELECT * FROM products WHERE (Price < 10 OR Price >=100) AND (CategoryID = 1);
