
SELECT*FROM products;
SELECT*FROM products WHERE ProductID=1;

UPDATE products
SET ProductName= '차이즈',
    Unit ='10박스',
    Price=36.00
    WHERE ProductID=1;

UPDATE products
SET ProductName='WHERE절을 안써서 불완전 ';

# 예 ) 1번 고객의 이름 수정하기
# 예 ) 5번 직원의 notes 를 변경하기
# 예 ) 1번 공급자의 전화번호, 주소 변경 하기

UPDATE customers
SET CustomerName='수정'
    WHERE CustomerID=1;

UPDATE employees
SET Notes= '수정'
WHERE EmployeeID=1;

UPDATE suppliers
SET Phone='010-9999-9990',
    Address="ad";
WHERE SupplierID=1;

SElECT * FROM products
WHERE CategoryID=1;

UPDATE products SET Price=Price*2 WHERE CategoryID=1;

