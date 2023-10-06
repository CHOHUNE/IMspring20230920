/* INSERT INTO tableName ( cloumnName1, coulmnName2, ...  )
   VALUES (value1, value2, ... )
   */


INSERT INTO employees (EMPLOYEEID, LASTNAME, FIRSTNAME, BIRTHDATE, PHOTO, NOTES)
    VALUE (10, '손', '흥민', '2000-01-01', '사진10', 'epl 득점왕');

SELECT *
FROM employees
ORDER BY EmployeeID DESC;

INSERT INTO employees (EmployeeID, LastName, FirstName, BirthDate, Photo, Notes)
    VALUE (11, '이', '강인', '2000-02-02', '사진11', '드리블잘함');

INSERT INTO employees
/* 모든 column 요소에 추가시 column명 생략 가능 */
    VALUE (12, '김', '민재', '2000-03-03', '사진12', '수비 잘함');

INSERT INTO employees (EmployeeID,LastName,FirstName)
VALUE (13,'박','지성');

INSERT INTO employees(EmployeeID,FirstName,LastName)
VALUE(14,'차','범근');

INSERT INTO employees(EmployeeID,FirstName,LastName)
VALUE (16,'김');

SELECT * FROM employees ORDER BY EmployeeID DESC;

INSERT INTO employees (LastName) VALUE ('10000');

INSERT INTO employees (LastName) VALUE('2000-01-01');

SELECT * FROM employees ORDER BY EmployeeID DESC;

SELECT * FROM products;

INSERT INTO products(Price) VALUE ( '30.33');



SELECT * FROM products ORDER BY  ProductID DESC;
/* 80번 상품 입력 productId productName supplierId categoryId unit price
   productName supplierId categoryId unit price
   */

INSERT INTO  products(ProductID, ProductName, SupplierID, CategoryID, Unit, Price)
    VALUE (80, '두부',1,1,'1 모',30.33);

INSERT INTO  products
VALUE (83,'김치',2,2,'1 포기',50.55);

SELECT * FROM products ORDER BY ProductID DESC;








