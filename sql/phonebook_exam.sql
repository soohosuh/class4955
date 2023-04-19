-- 전화번호 저장 테이블

--1. phoneInfo_basic 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_basic;
drop table phoneInfo_basic;
create table phoneInfo_basic (
      idx number(6) constraint PK_phoneInfo_basic_idx primary key,--idx : 대리키, 일련번호
      fr_frame varchar2(20) not null,
      fr_phonenumber varchar2(20) not null,
      fr_email varchar2(20),
      fr_address varchar2(20),
      fr_regdate DATE default sysdate
);

-- 시퀀스sequence 생성
create sequence seq_pbasic_idx;


-- insert : create
desc phoneInfo_basic;
insert into phoneInfo_basic 
values (seq_pbasic_idx.nextval, '차은우', '010-1111-2222', 'cha@naver', '친구주소', default);
insert into phoneInfo_basic (idx, fr_name, fr_phonenumber)
values (seq_pbasic_idx.nextval, '문예원', '010-2222-3333');
-- select
select fr_name from phoneInfo_basic;
select * from phoneInfo_basic where idx=1;
select * from phoneInfo_basic where idx=2;
-- SCOTT 의 idx -> 2
update phoneInfo_basic


-- 2. phoneinfo_univ 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_univ;
create table phoneInfo_univ (
      idx number(6) constraint PK_phoneInfo_univ_idx primary key,
      fr_u_major varchar2(20) default 'N' not null,
      fr_u_year number(1) default 1 not null,
      fr_ref number(7) constraint FK_phoneInfo_univ_fr_ref references phoneInfo_basic(idx) not null
);

-- sequence 생성
create sequence seq_puniv_idx;

desc phoneInfo_univ;
insert into phoneInfo_univ (idx, fr_u_major, fr_u_year, fr_ref)
            values (seq_puniv_idx.nexval, '컴퓨터', 1, seq_pbasic_idx.nextval);
update phoneInfo_univ set idx=3 where idx=1;
delete from phoneInfo_univ where fr_u_year=1;


--3. phoneinfo_com 테이블의 SELECT, UPDATE, DELETE, INSERT 하는 SQL
select * from phoneInfo_com;
create table phoneInfo_com (
      idx number(6) constraint PK_phoneInfo_com_idx primary key,
      fr_c_company varchar2(20) default 'N' not null,
      fr_ref number(6) constraint FK_phoneInfo_com_fr_ref references phoneInfo_basic(idx) not null
);
-- sequence 생성
create sequence seq_pcom_idx;


desc phoneInfo_com;
insert into phoneInfo_com (idx, fr_c_company, fr_ref)
            values (1, '중앙도서관', 2);
update phoneInfo_com set idx=3 where idx=1;
delete from phoneInfo_com where fr_c_company='중앙도서관';

commit;













