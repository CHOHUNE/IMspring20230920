SELECT *
FROM customers;

SELECT *
FROM customers
LIMIT 3;

SELECT *
FROM employees
ORDER BY BirthDate DESC
LIMIT 3;

SELECT * FROM products ORDER BY  Price DESC LIMIT 10;


SELECT ProductName,Price FROm products ORDER BY price ASC LIMIT 1;


 /*
 Limit n -> n개만 출력
 Limit n,m  -> n~ m개 출력

Limit 3은 Limit 0,3 과 같음
    */

/* 페이지 나누기 */
SELECT CustomerID,CustomerName FROM customers ORDER BY  CustomerID;
/* 91개 */
SELECT CustomerID,CustomerName FROM customers ORDER BY  CustomerID LIMIT 0,10;
SELECT CustomerID,CustomerName FROM customers ORDER BY  CustomerID LIMIT 10,10;
SELECT CustomerID,CustomerName FROM customers ORDER BY  CustomerID LIMIT 20,10;

/*공급자를 한페이지에 5개씩 공급자 번호 순으로 보여줄 때 3번째 페이지 조회 코드 /
 */

 SELECT * FROm suppliers ORDER BY PostalCode LIMIT 10,5;

/*
한 페이지가 n개의 레코드를 보여주면 m번째 페이지의 조회는 LIMIT (m-1)*n,n 그러나 연산자를 못넣음 (sql 내에선)
jdbc 에서 계산 후 넣어야 한다.
   */

