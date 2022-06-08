CREATE TABLE BOARD(
    NUM NUMBER(5) PRIMARY KEY, /*글번호*/
    PASS VARCHAR2(30), /*비밀번호*/
    NAME VARCHAR2(30), /*작성자*/
    EMAIL VARCHAR2(30), /*이메일*/
    TITLE VARCHAR2(50), /*제목*/
    CONTENT VARCHAR2(1000), /*내용*/
    READCOUNT NUMBER(4) DEFAULT 0, /*조회수*/
    WRITEDATE DATE DEFAULT SYSDATE /*작성일*/
);

DESC BOARD;

--1부터 1씩 자동으로 번호를 생성하는 시퀀스를 생성하는 SQL문
CREATE SEQUENCE BOARD_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '1234', '성윤정', 'pinksung@nate.com'
    , '첫방문', '반갑습니다.');
INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '1234', '성윤정', 'pinksung@nate.com'
    , '김밥', '맛있어요.');
INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '3333', '전수빈', 'raccon@nate.com'
    , '고등애', '일식입니다.');
INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '1111', '전원지', 'one@nate.com'
    , '갯골마을', '돼지삼겹살이 맛있습니다.');

SELECT * FROM BOARD;

SELECT * FROM BOARD ORDER BY NUM DESC;

COMMIT;