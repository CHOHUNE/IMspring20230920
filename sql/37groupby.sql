# 그룹별로 집계 함수를 쓰고 싶을 때 쓰는 집
# GROUP BY

SELECT COUNT(CategoryID)
FROM products;

SELECT MAX(Price)
FROM products;
SELECT MAX(Price)
FROM products
GROUP BY CategoryID;

SELECT CategoryID, MAX(Price)
FROM products
GROUP BY CategoryID;

SELECT CategoryID, MIN(Price) minPrice, MAX(Price) maxPrice
FROM products
GROUP BY CategoryID
ORDER BY maxPrice DESC;


SELECT o.OrderDate, SUM(p.Price * od.Quantity) AS 매출액
FROM products p
         JOIN orderdetails od
              ON p.ProductID = od.ProductID
         JOIN orders o ON od.OrderID = o.OrderID
GROUP BY o.OrderDate
ORDER BY o.OrderDate;

# 직원별로 얼마씩 주문을 처리 했는지
#  employeeid , quantitiy, product, price

SELECT e.EmployeeID,e.LastName, SUM(p.Price * od.Quantity) AS 매출액
FROM products p
         JOIN orderdetails od ON p.ProductID = od.ProductID
         JOIN orders o ON o.OrderID = od.OrderID
         JOIN employees e ON o.EmployeeID = e.EmployeeID
GROUP BY e.EmployeeID
ORDER BY 매출액 DESC;

# 고객별 주문 금액

SELECT c.CustomerName, SUM(p.Price * od.Quantity) AS 매출액
FROM products p
         JOIN orderdetails od ON p.ProductID = od.ProductID
         JOIN orders o ON o.OrderID = od.OrderID
         JOIN customers c ON c.CustomerID = o.CustomerID
GROUP BY o.CustomerID
ORDER BY 매출액 DESC;

# 10만달러 이상 구매한 고객 조회하기 ( 위 구문을 서브쿼리로 )

SELECT * FROM
    (SELECT c.CustomerName, SUM(p.Price * od.Quantity) `총 주문금액`
     FROM customers c JOIN orders o ON c.CustomerID = o.CustomerID
                      JOIN orderdetails od ON o.OrderID = od.OrderID
                      JOIN products p ON od.ProductID = p.ProductID
     GROUP BY c.CustomerID) t1
WHERE t1.`총 주문금액` >= 100000;
;