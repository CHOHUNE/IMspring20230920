


#  비상관쿼리 : 외부쿼리의 컬럼이 내부 쿼리에 사용되지 않을 때
#  외부쿼리의 컬럼이 내부쿼리에 사용될 떄
#  각 공급자가 있는 나라의 고객 수는?

SELECT * FROM suppliers;

SELECT COUNT (*) FROM customers
WHERE Country= ( SELECT Country FROM suppliers WHERE SupplierID=1);

SELECT COUNT (*) FROM customers
WHERE Country= ( SELECT Country FROM suppliers WHERE SupplierID=2);

SELECT COUNT (*) FROM customers
WHERE Country= ( SELECT Country FROM suppliers WHERE SupplierID=3);

SELECT s.supplierID, ( SELECT COUNT(*) FROM customers WHERE customers.Country= s.Country) AS 'Number Of Customers'
FROM suppliers s;

/* 외부 테이블의 쿼리인 suppliers s 가 내부쿼리에 들어가서 총 29번 실행됨 */

#  각 직원보다 나이가 많은 직원의 수 column 생성 (lastName, NumberOfEmp)
SELECT * FROM employees;

SELECT
    LastName,
    (SELECT COUNT(*) FROM employees e2
                     WHERE e1.BirthDate > e2.BirthDate) NumberOfEmp
FROM employees e1;

