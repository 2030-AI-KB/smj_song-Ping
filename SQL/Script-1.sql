SELECT * FROM emp;
SELECT * FROM EMP_DETAIL;
SELECT * FROM DEPT;

/*사원 상세 정보가 존재하는 사원의 사번, 이름, 직업, 전화번호, 자녀수, 나이,부서명을 출력하시오 */
/*from 뒤에 있는 테이블이 기준테이블*/
SELECT 
		e.empno,
		e.ename,
		e.job,
		ed.tel,
		ed.child,
		ed.age,
		d.dname
FROM EMP e 
INNER JOIN DEPT d ON e.DEPTNO = d.DEPTNO
INNER JOIN EMP_DETAIL ed ON e.EMPNO  = ed.EMPNO;

/*모든 사원의 사번, 이름, 직업, 전화번호, 자녀수, 나이, 부서명을 출력하시오*/
SELECT	e.empno,
		e.ename,
		e.job,
		e.DEPTNO,
		ed.tel,
		ed.age,
		d.dname
FROM EMP e  
LEFT JOIN DEPT d ON e.empno = d.DEPTNO  
LEFT JOIN EMP_DETAIL ed ON e.empno = ed.EMPNO ;

SELECT 
   e.EMPNO
   , e.ENAME
   , e.JOB
   , ed.TEL
   , ed.CHILD
   , ed.AGE
   , d.DNAME 
FROM EMP e
LEFT JOIN EMP_DETAIL ed ON e.EMPNO = ed.EMPNO
INNER JOIN DEPT d ON e.DEPTNO = d.DEPTNO;

/*자녀수가 0인 사원의 사원정보(emp,detail,dept)를 모두 출력하시오.*/
SELECT 
		e.EMPNO,
		e.ENAME,
		e.JOB,
		e.MGR,
		e.HIREDATE,
		e.SAL,
		e.COMM,
		e.DEPTNO,
		ed.TEL,
		ed.CHILD,
		ed.AGE,
		d.DNAME,
		d.LOC
FROM EMP e 
INNER JOIN EMP_DETAIL ed on e.EMPNO = ed.EMPNO
INNER JOIN DEPT d ON e.DEPTNO  = d.DEPTNO WHERE child = 0 ;

/*상세 정보가 없는 사원이 몇명인지 출력하시오*/
SELECT COUNT(*)
FROM EMP e
LEFT JOIN EMP_DETAIL ed ON e.EMPNO = ed.EMPNO 
WHERE ed.EMPNO  IS NULL;
/*상세 정보가 잇는 사원이 평균 급여를 출력하시오*/
SELECT AVG(NVL(e.SAL,0))
FROM EMP e 
INNER JOIN EMP_DETAIL ed ON e.EMPNO  = ed.EMPNO; 

/*'Dallas'에서 근무하고 있는 사원들의 총 자녀 수를 출력하시오.*/
SELECT SUM(NVL(ed.child,0))
FROM EMP e
INNER JOIN DEPT d ON e.DEPTNO = d.DEPTNO 
INNER JOIN EMP_DETAIL ed  ON e.EMPNO = ed.EMPNO
WHERE d.LOC  = 'DALLAS';

SELECT empno
	   ,ename
	   ,sal
	   ,(SELECT avg(sal) FROM EMP) AS avg
FROM EMP
WHERE sal > (SELECT avg(sal)FROM emp);

INSERT INTO EMP_DETAIL(child, age, EMPNO) values(2,43,7566);

SELECT * FROM EMP_DETAIL ed ;