--16. SUBSTR 함수를 사용하여 사원들의 입사한 년도와 입사한 달만 출력하시오.
select 
hiredate
from emp;
--17. SUBSTR 함수를 사용하여 4월에 입사한 사원을 출력하시오.


--18. MOD 함수를 사용하여 사원번호가 짝수인 사람만 출력하시오.
select empno
from emp
where mod(empno, 2)=0;
--19. 입사일을 년도는 2자리(YY), 월은 숫자(MM)로 표시하고 요일은 약어 (DY)로 지정하여 출력하시오.
select *
from emp
where hiredate = to_date('81/02/21',YY/MM/DY);
--20. 올해 몇 칠이 지났는지 출력
--현재날짜에서 올해 1월 1일을 뺀 결과를 출력
--TO_DATE 함수를 사용하여 데이터 형을 일치 시키시오.
SELECT TO_CHAR(SYSDATE, 'YYYY/MM/DD')-to_char(to_date(sysd
FROM DUAL;
--21. 사원들의 상관 사번을 출력하되 상관이 없는 사원에 대해서는 NULL 값 대신 0으로 출력하시오.
select empno
from emp
;
--22. DECODE 함수로 직급에 따라 급여를 인상
--직급이 ‘ANALIST”인 사원은 200, ‘SALESMAN’인 사원은 180, ‘MANAGER’인 사원은 150, ‘CLERK”인 사원은 100을 인상하시오.
select ename, job, sal,
        decode(job,
                'ANALYST', sal*2,
                'SALESMAN', sal*1.8,
                'MANAGER', sal*1.5,
                'CLERK', sal*1
              ) as up,
              nvl( decode(job,
                'ANALYST', sal*2,
                'SALESMAN', sal*1.8,
                'MANAGER', sal*1.5,
                'CLERK', sal*1
              ), sal) as UPSAL
from emp
order by sal desc;
        
--23. 모든 사원의 급여 최고액, 최저액, 총액 및 평균 급여를 출력하시오. 평균에 대해서는 정수로 반올림하시오.
select deptno, 
        sum(sal) as "총 급여액", 
        trunc(avg(sal)) as "평균 급여액",
        max(sal) as "최고 급여액",
        min(sal) as "최소 급여액",
from emp
group by deptno
having sum(sal) 
order by deptno
;

--24. 각 담당 업무 유형별로 급여 최고액, 최저액, 총액 및 평균 액을 출력하시오. 평균에 대해서는 정수로 반올림 하시오.

--25. COUNT(*) 함수를 이용하여 담당업무가 동일한 사원 수를 출력하시오.

--26. 관리자 수를 출력하시오.














