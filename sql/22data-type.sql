/*
mariadb INt- java int
DEC - double
VARCHAR - String
DATE - timestamp( LocalDate)
DATETIME - timstamp(LocalDateTime)

*/

USE mydb1;
CREATE TABLE my_table12(
    int_col INT,
    dec_col DEC(10,2),
    str_col VARCHAR(10),
    date_col DATE,
    date_time_col DATETIME
);

INSERT INTO  my_table12(int_col,dec_col,str_col,date_col,date_time_col)
VALUE ();

SELECT *FROM my_table12;

