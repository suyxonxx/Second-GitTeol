show databases;

create database naverCrolling character set utf8 collate utf8_general_ci;

use naverCrolling;

create table elements(
	no integer auto_increment,
    title varchar(64) not null,
    content longtext not null,
    primary key(no)
);
drop table elements;
/*테이블 구조 확인*/
desc elements;

/*데이터 검색*/
select * from elements; /*실행 단축키 : ctrl + enter (입력 데이터 조회.)*/
select title from elements; /*elements table에서 title만 보여달라는 의미*/
select * from elements where no = '1'; /*elements table에서 no가 3번인 element만 보여달라.*/
select count(*) from elements; /*counting*/
select * from elements limit 6, 5;

/*데이터 입력*/
insert into elements(no, title, content)
values(1, '', '');

/*데이터 삭제*/
delete from elements;

/*데이터 수정*/
update elements set title = '', content = '' where no = 1;

commit;