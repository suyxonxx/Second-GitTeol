CREATE TABLE BOARD(
    NUM NUMBER(5) PRIMARY KEY, /*�۹�ȣ*/
    PASS VARCHAR2(30), /*��й�ȣ*/
    NAME VARCHAR2(30), /*�ۼ���*/
    EMAIL VARCHAR2(30), /*�̸���*/
    TITLE VARCHAR2(50), /*����*/
    CONTENT VARCHAR2(1000), /*����*/
    READCOUNT NUMBER(4) DEFAULT 0, /*��ȸ��*/
    WRITEDATE DATE DEFAULT SYSDATE /*�ۼ���*/
);

DESC BOARD;

--1���� 1�� �ڵ����� ��ȣ�� �����ϴ� �������� �����ϴ� SQL��
CREATE SEQUENCE BOARD_SEQ START WITH 1 INCREMENT BY 1;

INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '1234', '������', 'pinksung@nate.com'
    , 'ù�湮', '�ݰ����ϴ�.');
INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '1234', '������', 'pinksung@nate.com'
    , '���', '���־��.');
INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '3333', '������', 'raccon@nate.com'
    , '����', '�Ͻ��Դϴ�.');
INSERT INTO BOARD(NUM, PASS, NAME, EMAIL, TITLE, CONTENT)
VALUES(BOARD_SEQ.NEXTVAL, '1111', '������', 'one@nate.com'
    , '������', '���������� ���ֽ��ϴ�.');

SELECT * FROM BOARD;

SELECT * FROM BOARD ORDER BY NUM DESC;

COMMIT;