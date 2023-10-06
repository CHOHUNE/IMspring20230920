SELECT *
FROM customers
WHERE Country = 'UK'
   or Country = 'spain'
   OR Country = 'italy';


SELECT *
FROM customers
WHERE Country IN ('UK', 'spain', 'italy');
/* 카테고리 3,4에 속한 상품들
   1996 년 7월 4일, 5일에 주문한 주문들
   london 이나 madrid,sevilla 에 있는 고객들 */

SELECT *
FROM products
WHERE CategoryID IN (3, 4);
SELECT *
FROM orders
WHERE OrderDate IN ('1996-07-04', '1996-07-05');
SELECT *
FROM customers
WHERE Country IN ('london', 'madrid', 'sevilla');
