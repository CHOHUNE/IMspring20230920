
SELECT * FROM customers ORDER BY 1 DESC;

INSERT INTO customers ( CustomerName)
VALUE ('흥민');

INSERT INTO customers(CustomerName,ContactName)
VALUE ( '강인' , '');
/* 빈 string 과 null을 달리 취급 한다 */
INSERT INTO customers(CustomerName,ContactName)
VALUE ('민재',null);

SELECT ProductID,ProductName,Price FROM products ORDER BY  1 DESC;
INSERT INTO products (ProductName,Price)
VALUE ( '피자',0.00);
INSERT INTO products (ProductName,Price)
VALUE('햄버거',null);
/* 0과 null은 다르다 */

SELECT *FROM products
WHERE Price=0.00
ORDER BY 1 DESC;

SELECT * FROM products
WHERE Price !=0.00
ORDER BY 1 DESC;
/* null 값을 가지고 있는 햄버거는 =0 일때 !=0 일때 둘 다 나오지 않고
   결과는 항상 false 이다.
   */
SELECT * FROM products
WHERE NOT Price IS NULL;

SELECT * FROM products
WHERE NOT Price IS NOT NULL;

SELECT ProductName, Price * 100
FROM products;
/* 산술연산시 null 피연산자이면 결과 항상 null */

SELECT ProductName,Price
FROM products
ORDER BY  ProductID DESC;

SELECT ProductName, IFNULL ( Price,0.00)
FROM products
ORDER BY ProductID DESC;
/* 찾으려는 값이 null 일 경우 0.00으로 대체해서 검색 한다. */

SELECT * FROM customers ORDER BY 1 DESC;

/* contactName이 null인 고객들 조회
   adress 가 null인 고객들 조회
   고객들 조회 ( customerName, country 컬럼만 ) , 단 country가 null이면 없음 표시 */

SELECT * FROM customers WHERE ContactName IS NULL;
SELECT * FROM customers WHERE Address IS NULL;
SELECT CustomerName,Country , IFNULL(Country,'없음') Country
FROM customers;

