
USE w3schools;

CREATE TABLE bank(
  name VARCHAR(10) PRIMARY KEY,
  money INT NOT NULL DEFAULT 0
);

INSERT INTO bank (name, money)
VALUES ('son',10000),('kim',1000);

UPDATE bank
SET money= money-1000
WHERE name='son';

UPDATE bank
SET name=money+1000
WHERE name='kim';
#  위와 같이 UPDATE 두개를 통틀은 업무단위를 'transaction'이라고 한다
SELECT * FROM bank;

ROLLBACK;

COMMIT;

# COMMIT : 반영  ROLLBACK : 되돌리기
#  ROLLBACK 실행 하다가 특정 지점으로 다시 돌아가 실행해야겠다



