SELECT * 
FROM dept;

SELECT deptno FROM dept;

SELECT *
FROM emp;

SELECT 
		e.empno,
		e.ename,
		d.dname,
		d.loc
FROM 	emp e
INNER JOIN DEPT d ON e.DEPTNO = d.DEPTNO;

SELECT *
FROM EMP 
ORDER BY sal desc;
/*number(전체자릿수,소수점자릿수)*/
/* 테이블 조회하기*/
SELECT * FROM EMP;

SELECT * FROM BONUS;

SELECT * FROM DEPT;

SELECT * FROM SALGRADE;

SELECT 
		EMPNO,
		ENAME,
		SAL,
		DEPTNO
FROM EMP;

SELECT 
		EMPNO,
		ENAME,
		SAL 
FROM 	EMP	WHERE SAL >= 3000;

SELECT 
		EMPNO,
		ENAME,
		SAL
FROM 	EMP WHERE SAL >= 3000 AND SAL <= 5000;

SELECT 	EMPNO,
		ENAME,
		SAL
FROM	EMP WHERE ENAME LIKE '%L%' AND (SAL >= 3000 OR SAL <= 1500);

SELECT 	EMPNO,
		ENAME,
		SAL
FROM	EMP WHERE SAL >= 3000 OR SAL <= 1500 ORDER BY SAL DESC;
		
SELECT	ENAME,
		UPPER(ENAME),
		LOWER(ENAME)
FROM EMP WHERE ENAME LIKE '%L%'; 

SELECT 
		ENAME,
		LENGTH(ENAME)
FROM 	EMP;

/* 실습을 할때에도 바로 따라치지말고 예상결과를 머릿속에 떠올려 본 뒤에 쳐볼것*/
SELECT 
		JOB, 
		SUBSTR(JOB, 1, 2),
		SUBSTR(JOB, 3, 2),
		SUBSTR(JOB, 5)  
FROM	EMP;

SELECT EMPNO,
	   ENAME,
	   RPAD(SUBSTR(ENAME, 1, LENGTH(ENAME)-2), LENGTH(ENAME), '*')  AS MASKING_NAME
FROM EMP;

SELECT 
		NVL(comm,2),
		sal+NVL(comm,0) 
FROM emp;

SELECT 
		count(*)
FROM	EMP
WHERE 	job = 'MANAGER';
		




CREATE TABLE emp_detail
(
   tel varchar2(20),
   child number(2),
   age number(3),
   empno number(4)
      -- 제약조건
      CONSTRAINT emp_detail_EMP_EMPNO_fk -- 제약조건명
         REFERENCES EMP -- 참조테이블과 참조할 컬럼(컬럼을 명시하지않으면 자동으로 pk를 참조)
            ON DELETE cascade
)

SELECT * FROM emp;
SELECT * FROM EMP_DETAIL ed ;

INSERT INTO EMP_DETAIL(TEL, CHILD, AGE, EMPNO) VALUES('01079791212', 1, 32, 7654);