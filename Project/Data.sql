create table employee(
emp_no varchar2(20) not null,
emp_name varchar2(20)not null,
emp_ssn varchar2(20) not null,
emp_digits varchar2 (20) not null,
CONSTRAINT EMPLOYEE_PK   PRIMARY KEY(EMP_NO));

insert into employee values('1', '������','931220-2853026','010-2486-8453');
insert into employee values('2', '������','930112-2485645','010-1685-8453');
insert into employee values('3', 'Ȳ����','920113-1154865','010-2544-8423');
insert into employee values('4', '������','950124-2158645','010-5474-2753');
insert into employee values('5', '��ٸ�','940115-2148654','010-1234-2853');
insert into employee values('6', '�ڿ���','880114-2486954','010-3542-3753');
insert into employee values('7', '������','980122-2486545','010-7855-1253');
insert into employee values('8', '��ȿ��','950112-2468721','010-4528-8427');
insert into employee values('9', '���¿�','940113-1876548','010-5378-8243');
insert into employee values('10', '����','930103-1578954','010-1385-8753');
insert into employee values('11', '�ڼ���','920102-1486546','010-1325-1253');
insert into employee values('12', '�ڼ���','911007-1158496','010-5846-1235');
insert into employee values('13', '�̽ø�','951108-1489875','010-4358-7865');
insert into employee values('14', '�쵵��','940415-2459542','010-4355-8789');
insert into employee values('15', '����ö','930115-2468453','010-4385-4385');
insert into employee values('16', '������','920615-2456789','010-1358-4355');
insert into employee values('17', '������','920515-2354567','010-1325-1352');
insert into employee values('18', '�赿��','910115-1456876','010-1325-8575');
insert into employee values('19', '�����','960415-2459454','010-1352-7858');
insert into employee values('20', '�����','960315-2456789','010-8575-8786');
insert into employee values('21', '��빮','970515-2456812','010-5488-2684');
insert into employee values('22', '����','880615-1485412','010-8555-9575');
insert into employee values('23', '���ǻ�','890715-1459789','010-5852-8134');
insert into employee values('24', '������','990915-2456478','010-5685-5745');
insert into employee values('25', '���߿�','910815-1748481','010-1328-4586');
insert into employee values('26', '������','970519-2156810','010-9926-1661');
insert into employee values('27', '������','940721-1481212','010-6670-5464');
insert into employee values('28', '��ΰ�','890312-1434489','010-3386-2520');
insert into employee values('29', '������','970517-2089658','010-1227-9984');
insert into employee values('30', '�̾Ƹ�','9141124-2550321','010-3469-4586');


CREATE TABLE MART(
MART_NO                  VARCHAR2(20)    NOT NULL,
MART_NAME                VARCHAR2(20)    NOT NULL,
constraint MART_PK         PRIMARY KEY(MART_NO),
constraint MART_UK        unique(MART_NAME));  

insert into mart values('1','�̸�Ʈ ������');
insert into mart values('2','�̸�Ʈ ����');
insert into mart values('3','�̸�Ʈ ������');
insert into mart values('4','�̸�Ʈ ������');
insert into mart values('5','�̸�Ʈ �踲��');



create table POSITION(
POSITION_NO              VARCHAR2(20)       NOT NULL,
POSITION_NAME            VARCHAR2(20)    NOT NULL,
constraint POSITION_PK       PRIMARY KEY(POSITION_NO),
constraint POSITION_UK       UNIQUE(POSITION_NAME));

insert into position values('1','�Ŵ���');
insert into position values('2','�İ߻��');

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