CREATE TABLE board(
    num NUMBER(5) PRIMARY KEY, /*�۹�ȣ*/
    pass VARCHAR2(30), /*��й�ȣ*/
    name VARCHAR2(30), /*�ۼ���*/
    email VARCHAR2(30), /*�̸���*/
    title VARCHAR2(50), /*����*/
    content VARCHAR2(1000), /*����*/
    readcount NUMBER(4) DEFAULT 0, /*��ȸ��*/
    writedate DATE DEFAULT SYSDATE /*�ۼ���*/
);

DESC board;

--1���� 1�� �ڵ����� ��ȣ�� �����ϴ� �������� �����ϴ� SQL��
CREATE SEQUENCE board_seq START WITH 1 INCREMENT BY 1;

INSERT INTO board(num, pass, name, email, title, content)
VALUES(board_seq.NEXTVAL, '1234', '������', 'pinksung@nate.com'
    , 'ù�湮', '�ݰ����ϴ�.');
INSERT INTO board(num, pass, name, email, title, content)
VALUES(board_seq.NEXTVAL, '1234', '������', 'pinksung@nate.com'
    , '���', '���־��.');
INSERT INTO board(num, pass, name, email, title, content)
VALUES(board_seq.NEXTVAL, '3333', '������', 'raccon@nate.com'
    , '����', '�Ͻ��Դϴ�.');
INSERT INTO board(num, pass, name, email, title, content)
VALUES(board_seq.NEXTVAL, '1111', '������', 'one@nate.com'
    , '������', '���������� ���ֽ��ϴ�.');

SELECT * FROM board;

COMMIT;