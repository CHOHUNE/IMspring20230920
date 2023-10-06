
-- DELETE FROM tableName WHERE 조건
-- !! WHERE 절 꼭 작성 ( 작성하지 않으면 전체 삭제 )

SELECT * FROM employees WHERE LastName='손';

DELETE FROM employees WHERE LastName='손';

SELECT * FROM employees WHERE FirstName='김';
DELETE FROM employees WHERE FirstName='김';

SELECT * FROM employees;
DELETE FROM employees;
/* 전체 삭제 */

/* 직원 테이블에 오늘 입력한 레코드들 지우기 */
/* 상품 테이블에 오늘 입력한 레코드들 지우기 */

SELECT * FROM employees WHERE EmployeeID > 9;
DELETE FROM employees WHERE EmployeeID >9;

SELECT * FROM products WHERE ProductID > 77;
DELETE FROM products WHERE ProductID > 77;