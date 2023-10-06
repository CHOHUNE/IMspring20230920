
USE w3schools;

SELECT *
FROM products p JOIN suppliers s
ON p.SupplierID = s.SupplierID;

SELECT *
FROM products p JOIN suppliers s USING (SupplierID);

/* JOIN할때 특정 column 이 같은 것을 묶는 상황이 많이 발생할 때 쓰는 용법들 */

SELECT * FROM products p NATURAL JOIN suppliers s;

/* natural JOIN 을 쓰면 두 table에 같은 column을 찾아준다 */



