create table employee(
emp_no varchar2(20) not null,
emp_name varchar2(20)not null,
emp_ssn varchar2(20) not null,
emp_digits varchar2 (20) not null,
CONSTRAINT EMPLOYEE_PK   PRIMARY KEY(EMP_NO));

insert into employee values('1', '공예지','931220-2853026','010-2486-8453');
insert into employee values('2', '안지윤','930112-2485645','010-1685-8453');
insert into employee values('3', '황지성','920113-1154865','010-2544-8423');
insert into employee values('4', '선인정','950124-2158645','010-5474-2753');
insert into employee values('5', '백근만','940115-2148654','010-1234-2853');
insert into employee values('6', '박예은','880114-2486954','010-3542-3753');
insert into employee values('7', '윤은상','980122-2486545','010-7855-1253');
insert into employee values('8', '서효원','950112-2468721','010-4528-8427');
insert into employee values('9', '김태오','940113-1876548','010-5378-8243');
insert into employee values('10', '김용우','930103-1578954','010-1385-8753');
insert into employee values('11', '박성수','920102-1486546','010-1325-1253');
insert into employee values('12', '박선후','911007-1158496','010-5846-1235');
insert into employee values('13', '이시면','951108-1489875','010-4358-7865');
insert into employee values('14', '우도희','940415-2459542','010-4355-8789');
insert into employee values('15', '김준철','930115-2468453','010-4385-4385');
insert into employee values('16', '강성관','920615-2456789','010-1358-4355');
insert into employee values('17', '송은지','920515-2354567','010-1325-1352');
insert into employee values('18', '김동원','910115-1456876','010-1325-8575');
insert into employee values('19', '김미희','960415-2459454','010-1352-7858');
insert into employee values('20', '김수진','960315-2456789','010-8575-8786');
insert into employee values('21', '김용문','970515-2456812','010-5488-2684');
insert into employee values('22', '김용우','880615-1485412','010-8555-9575');
insert into employee values('23', '김의산','890715-1459789','010-5852-8134');
insert into employee values('24', '김정필','990915-2456478','010-5685-5745');
insert into employee values('25', '김중영','910815-1748481','010-1328-4586');
insert into employee values('26', '백은미','970519-2156810','010-9926-1661');
insert into employee values('27', '이재은','940721-1481212','010-6670-5464');
insert into employee values('28', '김민경','890312-1434489','010-3386-2520');
insert into employee values('29', '안준혁','970517-2089658','010-1227-9984');
insert into employee values('30', '이아름','9141124-2550321','010-3469-4586');


CREATE TABLE MART(
MART_NO                  VARCHAR2(20)    NOT NULL,
MART_NAME                VARCHAR2(20)    NOT NULL,
constraint MART_PK         PRIMARY KEY(MART_NO),
constraint MART_UK        unique(MART_NAME));  

insert into mart values('1','이마트 광주점');
insert into mart values('2','이마트 상무점');
insert into mart values('3','이마트 광산점');
insert into mart values('4','이마트 봉선점');
insert into mart values('5','이마트 계림점');



create table POSITION(
POSITION_NO              VARCHAR2(20)       NOT NULL,
POSITION_NAME            VARCHAR2(20)    NOT NULL,
constraint POSITION_PK       PRIMARY KEY(POSITION_NO),
constraint POSITION_UK       UNIQUE(POSITION_NAME));

insert into position values('1','매니저');
insert into position values('2','파견사원');

CREATE TABLE DISPATCH(
emp_no                  VARCHAR2(20)        not null,
MART_NO                 VARCHAR2(20)       NOT NULL,      
POSITION_no             VARCHAR2(20)    NOT NULL,


constraint DISPATCH_EMPLOYEE_FK           FOREIGN KEY(EMP_NO)
references EMPLOYEE(EMP_NO),

constraint DISPATCH_MART_FK        FOREIGN KEY(MART_NO)
references MART(MART_NO),

constraint DISPATCH_POSITION_FK        FOREIGN KEY(POSITION_NO)
references POSITION(POSITION_NO)

);


select * from EMPLOYEE;
select * from mart;
select * from position;
select * from dispatch;
select * from product;