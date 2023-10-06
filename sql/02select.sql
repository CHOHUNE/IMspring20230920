/* SELECT  :  데이터 조회( 읽기, 검색, 가져오기 ) */
/*table 형식의 데이터를 보고 싶다면?*/
SELECT *
FROM w3schools.customers;
/* tuple 행 row 다 같은 말 */
SELECT *
FROM w3schools.employees;
/* tables를 schema 라고 한다  = w3schools
   우측 상단에 해당 스키마를 설정 해놓으면 스키마 명을 안쓰고
   데이터를 꺼낼 수 있다. */
SELECT *FROM employees;

/* 특정 column */
SElECT CustomerName -- column 명
FROM customers; -- table명
/* 두개의 column 조회하기 */
SELECT CustomerID, CustomerName FROM customers;
SELECT CustomerID, CustomerName,Country FROM customers;

/*전체 컬럼을 조회 하고 싶으면 위와 같이 * */
SELECT * FROM customers;

/* 직원의 lastName, firstName,birthDate 조회 하기  */
/* 상품의 이름 단위 가격
   공급자의 이름, 주소, 국가 country*/
SELECT LastName,FirstName,BirthDate FROM employees;
SELECT ProductName,Unit,Price FROM products;
SELECT SupplierID,Address,Country FROM suppliers;

/* 고객 테이블의 국가 컬럼 조회 */
SELECT Country FROM customers;
/* 중복된 데이터 제거 키워드 SELECT DISTINCT */
SELECT DISTINCT Country FROM customers;
/* 91개 -> 21개 row로 축약 */
SELECT City,Country FROM customers;
SELECT DISTINCT City, Country From customers;
/* 91개 -> 69개 테이블 형식 이기 때문에 city는 중복 제거가 되어도 Country는 중복되어져서 나옴 */

/* Count 는 행의 수 ( table, 행, row, record ) */
SELECT COUNT(Country) FROM customers;
SELECT COUNT(DISTINCT Country) FROM customers;

/* 전체 행의 수*/
SELECT COUNT (*) FROM customers;
SELECT COUNT (*) FROM suppliers;

SELECT COUNT (DISTINCT Country) from suppliers;
SELECT DISTINCT Country FROM suppliers;

SELECT COUNT(*) FROM orders;

SELECT COUNT (*) FROM categories;

SELECT COUNT (DISTINCT City) from customers;
SELECT DISTINCT City from customers;