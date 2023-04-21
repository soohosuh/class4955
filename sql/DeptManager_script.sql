
-- 1. DEPT MANAGER
select * from dept;

-- 2. search
select * from dept where deptno=10;
-- select * from dept where deptno=
select * from dept where dname='ACCOUNTING';
-- select * from dept where dname=?

--3. insert
insert into dept values (50, 'TEST', 'SEOUL');
-- insert into dept values (?, ?, ?)
rollback;

-- 4. : 수정 Update
update dept set dname = 'AAA', loc = 'BBB' where deptno = 60;
--update dept set dname=?, loc=? where deptno=?;

-- 5. : delete
delete from dept where deptno = 60;
--delete from dept where deptno=?;
