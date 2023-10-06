/* <    >    >=    <=    <> != */


SELECT * FROM products
WHERE Price != 10.00;
SELECT * FROM products
WHERE Price <> 10.00;
SELECT * FROM products
WHERE NOT Price = 10.00;

SELECT * FROM customers
WHERE CustomerID <3;

SELECT * FROM customers
WHERE CustomerID <'3';

SELECt * FROM customers
WHERE CustomerName='Alfreds Futterkiste';
#  < 를 쓸시 abc 순으로 뒤에 있는 사람

