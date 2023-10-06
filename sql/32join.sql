USE w3schools;

SELECT e1.LastName, e1.BirthDate,e2.LastName,e2.BirthDate
FROM employees e1 JOIN employees e2
WHERE e1.BirthDate < e2.BirthDate
AND e2.LastName='Leverling';


/* 같은 table 끼리도 JOIN 이 가능하다.
    SELF- JOIN
*/

#  예제 : Ipoh Coffee 보다 비싼 상품명 조회

SELECT p1.ProductName,p1.Price,p2.ProductName,p2.Price
    FROM products p1 JOIN products p2
WHERE p1.Price > p2.Price
AND p2.ProductName='Ipoh Coffee'
ORDER BY p1.Price;

