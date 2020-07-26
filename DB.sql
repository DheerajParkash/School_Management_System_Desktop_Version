DROP DATABASE IF EXISTS School_Managment_System;
CREATE DATABASE School_Managment_System;

USE School_Managment_System;

DROP TABLE IF EXISTS login;
CREATE TABLE login(
    first_name  VARCHAR(20) NOT NULL,
    last_name   VARCHAR(20) NOT NULL,
    username    VARCHAR(25) PRIMARY KEY,
    password    VARCHAR(16) NOT NULL,
    birth_date  DATE        NOT NULL,
    address     VARCHAR(70) NOT NULL
); 

DROP TABLE IF EXISTS parent;
CREATE TABLE parent(
    p_id       INT AUTO_INCREMENT,
    name       VARCHAR(30) NOT NULL,
    cnic       VARCHAR(20) NOT NULL,
    contact    VARCHAR(20),
    email      VARCHAR(30),
    address    VARCHAR(50),
    PRIMARY KEY(p_id)
); 

DROP TABLE IF EXISTS students;
CREATE TABLE students(
    s_id        INT  AUTO_INCREMENT,
    first_name  VARCHAR(20) NOT NULL,
    last_name   VARCHAR(20) NOT NULL,
    p_id        INT NOT NULL,
    gender      VARCHAR(10) NOT NULL,
    birth_date  DATE NOT NULL,
    last_school VARCHAR(50) NOT NULL,
    class_Addm  VARCHAR(15) not NULL,
    CONSTRAINT  studentID_pk PRIMARY KEY(s_id),
    CONSTRAINT  pID_fk FOREIGN KEY(p_id) REFERENCES parent(p_id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS employees;
CREATE TABLE employees(
    id                INT NOT NULL AUTO_INCREMENT,
    first_name        VARCHAR(25) NOT NULL,
    last_name         VARCHAR(25) NOT NULL,
    gender            VARCHAR(10) NOT NULL,
    joining_date      DATE NOT NULL,
    designation       VARCHAR(25) NOT NULL,
    cnic              VARCHAR(20) NOT NULL,
    salary            VARCHAR(15) NOT NULL,
    contact           VARCHAR(15) NOT NULL,
    email             VARCHAR(25) NOT NULL,
    address           VARCHAR(50) NOT NULL,
    CONSTRAINT id_pk PRIMARY KEY(id)   
);

DROP TABLE IF exists studentClass;
CREATE TABLE studentClass(
    c_id    VARCHAR(15) NOT NULL,
    s_id    INT NOT NULL,
    t_year  VARCHAR(15) NOT NULL,
    primary Key(c_id,s_id,t_year),
    CONSTRAINT s_id_Fk FOREIGN KEY(s_id) REFERENCES students(s_id)
    ON UPDATE CASCADE ON DELETE CASCADE
); 

DROP TABLE IF EXISTS fees;
CREATE TABLE fees(
    fees_id INT NOT NULL AUTO_INCREMENT,
    st_id    INT NOT NULL,
    c_id    VARCHAR(15) NOT NULL,
    month   VARCHAR(15) NOT NULL,
    amount  VARCHAR(15) NOT NULL,
    status  VARCHAR(10) NOT NULL DEFAULT 'unpaid',
    PRIMARY KEY(fees_id,st_id),
    CONSTRAINT st_id_Fk FOREIGN KEY(st_id) REFERENCES students(s_id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS salary;
CREATE TABLE salary(
    reciept_id      INT NOT NULL AUTO_INCREMENT,
    employee_id     INT NOT NULL,
    salary          VARCHAR(15) NOT NULL,
    month_year      VARCHAR(15) NOT NULL,
    status          VARCHAR(15) NOT NULL DEFAULT 'unpaid',
    CONSTRAINT  reciept_id_pk PRIMARY KEY(reciept_id),
    CONSTRAINT  eID_fk   FOREIGN KEY(employee_id) REFERENCES employees(id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS subjects;
CREATE TABLE subjects(
    subject VARCHAR(30) NOT NULL,
    t_id        INT NOT NULL,
    total_marks INT NOT NULL DEFAULT 100,
    class_id    VARCHAR(15) NOT NULL,
    term_year   VARCHAR(15) NOT NULL,
    PRIMARY KEY(subject,class_id,term_year),
    FOREIGN KEY(class_id) references studentclass(c_id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS results;
CREATE TABLE results(
    s_id           INT NOT NULL,
    class_id       VARCHAR(15),
    subject_name   VARCHAR(30) NOT NULL,
    total_marks    INT  NOT NULL DEFAULT 100,
    obtained_marks INT NOT NULL,
    grade          VARCHAR(5) NOT NULL,
    session_       VARCHAR(15) NOT NULL,
    term_year      VARCHAR(15),
    PRIMARY KEY(s_id,class_id,subject_name,session_,term_year),
    FOREIGN KEY(s_id,class_id,term_year) REFERENCES studentclass(s_id,c_id,t_year)
    ON UPDATE CASCADE ON DELETE CASCADE
);

DROP TABLE IF EXISTS final;
CREATE TABLE final(
    id INT NOT NULL,
    c_id VARCHAR(15) NOT NULL,
    session_ VARCHAR(15) NOT NULL,
    t_marks INT NOT NULL,
    o_marks INT NOT NULL,
    percentage INT NOT NULL,
    grade VARCHAR(5),
    t_year  VARCHAR(15),
    PRIMARY KEY(id,c_id,t_year),
    FOREIGN KEY(id,c_id,t_year) REFERENCES results(s_id,class_id,term_year) 
    ON UPDATE CASCADE ON DELETE CASCADE
);


DROP PROCEDURE IF EXISTS student_enrollment;
DELIMITER $$
CREATE PROCEDURE student_enrollment(IN f_name VARCHAR(20),IN l_name VARCHAR(20),IN s_gender VARCHAR(10),
                IN s_dob DATE,IN s_l_school VARCHAR(50),IN class_addm VARCHAR(15),IN p_name VARCHAR(30),
                IN p_cnic VARCHAR(20),IN t_year VARCHAR(15),IN p_contact VARCHAR(20),IN p_email VARCHAR(30),IN p_address VARCHAR(50),
                OUT st_id INT,OUT pt_id INT)
BEGIN
    INSERT INTO parent(name,cnic,contact,email,address) VALUES(p_name,p_cnic,p_contact,p_email,p_address);
    SELECT p_id INTO pt_id FROM parent ORDER BY p_id DESC LIMIT 1;
    INSERT INTO students(first_name,last_name,p_id,gender,birth_date,last_school,class_Addm)
                 VALUES(f_name,l_name,pt_id,s_gender,s_dob,s_l_school,class_addm);
    SELECT s_id INTO st_id FROM students ORDER BY s_id DESC LIMIT 1;   
    CALL s_class(class_addm,st_id,t_year);
    CALL fees_alct(st_id,class_addm,t_year);          
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS s_class;
DELIMITER $$
CREATE PROCEDURE s_class(IN class_id VARCHAR(15),IN student_id INT,IN term_year VARCHAR(15))
BEGIN
        INSERT INTO studentclass VALUES(class_id,student_id,term_year);
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS fees_alct;
DELIMITER $$
CREATE PROCEDURE fees_alct(IN s_id INT,IN sc_id VARCHAR(15),IN term_year VARCHAR(15))
BEGIN
DECLARE p_amount VARCHAR(15);
DECLARE p_month VARCHAR(10) ;
SET p_month=DATE_FORMAT(current_date(), "%M-%Y");
CASE sc_id
    WHEN 'KG'    THEN SET p_amount='RS: 500';
	WHEN 'One'   THEN SET p_amount='RS: 500';
	WHEN 'Two'   THEN SET p_amount='RS: 500';
    WHEN 'Three' THEN SET p_amount='RS: 700';
	WHEN 'Four'  THEN SET p_amount='RS: 700';
	WHEN 'Five'  THEN SET p_amount='RS: 700';
    WHEN 'Six'   THEN SET p_amount='RS: 900';
    WHEN 'Seven' THEN SET p_amount='RS: 900';
    ELSE SET p_amount='1000';
END CASE;
INSERT INTO fees(st_id,c_id,month,amount) VALUES(s_id,sc_id,p_month,p_amount);
END$$
DELIMITER ;


DROP PROCEDURE IF EXISTS employee_insert;
DELIMITER $$
CREATE PROCEDURE employee_insert(IN f_name VARCHAR(25),IN l_name VARCHAR(25),IN e_gender VARCHAR(10),IN j_date VARCHAR(15),IN e_designation VARCHAR(25),
                IN e_cnic VARCHAR(20),IN e_salary VARCHAR(15),IN e_contact VARCHAR(15),IN e_email VARCHAR(25),IN e_address VARCHAR(50),OUT e_id INT)
BEGIN
    DECLARE e_month VARCHAR(15) ;
    SET e_month=DATE_FORMAT(current_date(), "%M-%Y");
    INSERT INTO employees(first_name,last_name,gender,joining_date,designation,cnic,salary,contact,email,address) 
        VALUES(f_name,l_name,e_gender,j_date,e_designation,e_cnic,e_salary,e_contact,e_email,e_address);
    SELECT id INTO e_id FROM employees ORDER BY id DESC LIMIT 1;
    INSERT INTO salary(employee_id,salary,month_year) VALUES(e_id,e_salary,e_month);
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS s_details;
DELIMITER $$
CREATE PROCEDURE s_details(IN class_id VARCHAR(15),IN _year VARCHAR(15),IN session_ VARCHAR(15)) 
BEGIN
SELECT s1.s_id,s2.first_name,s2.last_name from studentclass s1 INNER JOIN students s2 on s1.s_id=s2.s_id
        WHERE s1.c_id=class_id AND s1.t_year=_year AND s1.s_id NOT IN(select s_id from results r
                         where r.class_id=class_id AND r.term_year=_year AND r.session_=session_ ) ;
END$$
DELIMITER ;


DROP PROCEDURE IF EXISTS result_insertion;
DELIMITER $$
CREATE PROCEDURE result_insertion(IN s_id INT,IN c_id VARCHAR(15),IN _year VARCHAR(15),IN session_ VARCHAR(15),
IN sub VARCHAR(30),IN ob_marks INT) 
BEGIN  
    DECLARE grd VARCHAR(5);
    DECLARE t_m INT DEFAULT 0;
    SELECT total_marks INTO t_m from subjects where subject=sub AND class_id=c_id AND term_year=_year;
    CASE 
        WHEN ob_marks >=90 THEN SET grd='A+';
        WHEN ob_marks >=80 THEN SET grd='A';
        WHEN ob_marks >=70 THEN SET grd='B';
        WHEN ob_marks >=60 THEN SET grd='C';
        WHEN ob_marks >=33 THEN SET grd='D';
        ELSE SET grd='F';
    END CASE;
    IF ob_marks>0 AND t_m > 0 THEN 
        INSERT INTO results VALUES(s_id,c_id,sub,t_m,ob_marks,grd,session_,_year);
    END IF;
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS session_result;
DELIMITER $$
CREATE PROCEDURE session_result(IN id INT,IN c_id VARCHAR(15),IN sson VARCHAR(15),IN year_ VARCHAR(15))
BEGIN
    SELECT subject_name,total_marks,obtained_marks,grade,concat(first_name,' ',last_name)AS s_name,p.name AS p_name
            from results r INNER JOIN students USING(s_id) INNER JOIN parent p USING(p_id)
                WHERE r.s_id=id AND r.class_id=c_id AND r.term_year=year_;
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS class_details;
DELIMITER $$
CREATE PROCEDURE class_details(IN id VARCHAR(15),IN year_ VARCHAR(15))
BEGIN
    SELECT s.s_id,CONCAT(s.first_name,' ',s.last_name) AS s_name,gender,birth_date FROM students s INNER JOIN studentclass sc USING(s_id) WHERE sc.c_id=id AND sc.t_year=year_;
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS fees_allocate;
DELIMITER $$
CREATE PROCEDURE fees_allocate(IN year_ VARCHAR(15))
BEGIN
    DECLARE p_month VARCHAR(10) ;
    SET p_month=DATE_FORMAT(current_date(), "%M-%Y");
    INSERT INTO fees(st_id,c_id,month,amount)  SELECT st_id,sc.c_id,p_month,f_amount(sc.c_id) From fees f 
                                            INNER JOIN studentclass sc ON f.st_id=sc.s_id 
                                            WHERE sc.t_year=year_ AND f.month=DATE_FORMAT(ADDDATE(current_date(),INTERVAL -1 MONTH), "%M-%Y");
END$$
DELIMITER ;

DROP FUNCTION IF EXISTS f_amount;
DELIMITER $$
CREATE FUNCTION f_amount(c_id VARCHAR(15))
RETURNS VARCHAR(15)
DETERMINISTIC
BEGIN
    DECLARE p_amount VARCHAR(15);
    CASE c_id
        WHEN 'KG'    THEN SET p_amount='RS: 500';
        WHEN 'One'   THEN SET p_amount='RS: 500';
        WHEN 'Two'   THEN SET p_amount='RS: 500';
        WHEN 'Three' THEN SET p_amount='RS: 700';
        WHEN 'Four'  THEN SET p_amount='RS: 700';
        WHEN 'Five'  THEN SET p_amount='RS: 700';
        WHEN 'Six'   THEN SET p_amount='RS: 900';
        WHEN 'Seven' THEN SET p_amount='RS: 900';
        ELSE SET p_amount='1000';
    END case; 
    RETURN(p_amount);
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS salary_allocate;
DELIMITER $$
CREATE PROCEDURE salary_allocate()
BEGIN
    DECLARE p_month VARCHAR(10) ;
    SET p_month=DATE_FORMAT(current_date(), "%M-%Y");
    INSERT INTO salary(employee_id,salary,month_year)  SELECT s.employee_id,s.salary,p_month From salary s 
                 INNER JOIN employees e ON s.employee_id=e.id
                 WHERE  s.month_year=DATE_FORMAT(ADDDATE(current_date(),INTERVAL -1 MONTH), "%M-%Y");
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS final_result;
DELIMITER $$
CREATE PROCEDURE final_result(IN id INT,IN c_id VARCHAR(15),IN sson VARCHAR(15),IN year VARCHAR(15))
BEGIN
    DECLARE status VARCHAR(5);
    DECLARE percentage INT DEFAULT 0;
    DECLARE stts VARCHAR(5) DEFAULT 'A';
    DECLARE tm INT DEFAULT 0;
    DECLARE om INT DEFAULT 1;
    select SUM(total_marks) INTO tm from results r  where r.s_id=id AND r.class_id=c_id AND r.session_=sson AND r.term_year=year;
    select SUM(obtained_marks) INTO om from results r  where r.s_id=id AND r.class_id=c_id AND r.session_=sson AND r.term_year=year;
    select grade into stts from results r where r.s_id=id AND grade='F' AND r.class_id=c_id AND r.session_=sson AND r.term_year=year;
    SET percentage=(om*100)/tm;
    CASE 
        WHEN percentage >=90 AND stts !='F' THEN SET status='A+';
        WHEN percentage >=80 AND stts !='F' THEN SET status='A';
        WHEN percentage >=70 AND stts !='F' THEN SET status='B';
        WHEN percentage >=60 AND stts !='F' THEN SET status='C';
        WHEN percentage >=33 AND stts !='F' THEN SET status='D';
        ELSE SET status='F';
    END CASE;
    INSERT INTO final VALUES(id,c_id,sson,tm,om,percentage,status,year);
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS promote_student;
DELIMITER $$
CREATE PROCEDURE promote_student(IN y_from VARCHAR(15),IN y_to VARCHAR(15))
BEGIN
    INSERT INTO studentclass(c_id,s_id,t_year)  SELECT class_promote(sc.c_id,sc.s_id,sc.t_year),sc.s_id,y_to 
                From studentclass sc INNER JOIN final f ON sc.s_id=f.id
                where sc.t_year=y_from and sc.c_id!='PassOut';
END$$
DELIMITER ;
                         
DROP FUNCTION IF EXISTS class_promote;
DELIMITER $$
CREATE FUNCTION class_promote(cl_id VARCHAR(15),_id INT,_year VARCHAR(15))
RETURNS VARCHAR(15)
DETERMINISTIC
BEGIN
    DECLARE new_class VARCHAR(15);
    DECLARE grd VARCHAR(5);
    select f.grade into grd  from final f where f.id=_id AND f.c_id=cl_id AND f.t_year=_year;
    if grd='F' then
        RETURN(cl_id);
    END IF;
    CASE cl_id
        WHEN 'KG'    THEN SET new_class='One';
        WHEN 'One'   THEN SET new_class='Two';
        WHEN 'Two'   THEN SET new_class='Three';
        WHEN 'Three' THEN SET new_class='Four';
        WHEN 'Four'  THEN SET new_class='Five';
        WHEN 'Five'  THEN SET new_class='Six';
        WHEN 'Six'   THEN SET new_class='Seven';
        WHEN 'Seven' THEN SET new_class='Eight';
        ELSE SET new_class='PassOut';
    END case; 
    RETURN(new_class);
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS student_update;
DELIMITER $$
CREATE PROCEDURE student_update(IN f_name VARCHAR(20),IN l_name VARCHAR(20),IN s_gender VARCHAR(10),
                IN s_dob DATE,IN s_l_school VARCHAR(50),IN class_addm VARCHAR(15),IN p_name VARCHAR(30),
                IN p_cnic VARCHAR(20),IN t_year VARCHAR(15),IN p_contact VARCHAR(20),IN p_email VARCHAR(30),IN p_address VARCHAR(50),
                IN st_id INT,IN pt_id INT)
BEGIN
    UPDATE parent
        SET name=p_name,cnic=p_cnic,contact=p_contact,email=p_email,address=p_address WHERE p_id=pt_id;
    
    UPDATE students
    SET first_name=f_name,last_name=l_name,p_id=pt_id,gender=s_gender,birth_date=s_dob,last_school=s_l_school,class_Addm=class_addm
    WHERE s_id=st_id;
    
    UPDATE studentclass
        SET  c_id=class_addm,t_year=t_year WHERE s_id=st_id AND (c_id=class_addm OR t_year=t_year);
        
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS employee_update;
DELIMITER $$
CREATE PROCEDURE employee_update(IN f_name VARCHAR(25),IN l_name VARCHAR(25),IN e_gender VARCHAR(10),IN j_date VARCHAR(15),IN e_designation VARCHAR(25),
                IN e_cnic VARCHAR(20),IN e_salary VARCHAR(15),IN e_contact VARCHAR(15),IN e_email VARCHAR(25),IN e_address VARCHAR(50),IN e_id INT)
BEGIN
    DECLARE e_month VARCHAR(15) ;
    SET e_month=DATE_FORMAT(current_date(), "%M-%Y");
    
    UPDATE employees
    SET first_name=f_name,last_name=l_name,gender=e_gender,joining_date=j_date,designation=e_designation,cnic=e_cnic,salary=e_salary,contact=e_contact,email=e_email,address=e_address
    WHERE id=e_id;
    
    UPDATE salary
    SET salary=e_salary WHERE employee_id=e_id AND month_year=e_month;
END$$
DELIMITER ;

DROP PROCEDURE IF EXISTS generate_Certificate;
DELIMITER $$
CREATE PROCEDURE generate_Certificate(IN id INT,IN class VARCHAR(15),IN year VARCHAR(15))
BEGIN
    SELECT f.id,f.c_id,f.t_marks,f.o_marks,f.percentage,f.grade,f.t_year,CONCAT(s.first_name,' ',s.last_name) AS s_name,
            s.gender,s.birth_date,s.last_school,p.address,p.name,p.contact
        FROM final AS f INNER JOIN students AS s ON f.id=s.s_id
        INNER JOIN parent AS p ON s.p_id=p.p_id
        WHERE f.id=id AND f.c_id=class AND f.t_year=year;
END$$
DELIMITER ;

INSERT INTO login values('Dheeraj','Parkash','Dheeraj','12345','2000-01-01','sukkur iba');
INSERT INTO login values('Laksh','Kumar','Laksh','12345','2000-01-01','sukkur iba');
INSERT INTO login values('Adarsh','Chimnani','Adarsh','12345','2000-01-01','sukkur iba');

CALL student_enrollment('Dheeraj','Parkash','Male','2000-01-01','Fresh','KG','Surya Parkash','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Laksh','Kumar','Male','2000-01-01','Fresh','KG','NAND LAL','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Kashmore',@s_id,@p_id);
CALL student_enrollment('Adarsh','chimnani','Male','2000-01-01','Fresh','KG','Umesh kumar','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Ali','Raza','Male','2000-01-01','Excellence','One','Abdul','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Afaque','Ali','Male','2000-01-01','Modern','One','Imtiaz ahmed','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Amjad','khan','Male','2000-01-01','Shaheen','Two','Imtiaz ALi','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Khan','Muhammad','Male','2000-01-01','Excellence','Two','Abdul Rasool','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Babar','Ali','Male','2000-01-01','Modern','Three','Ashfaque Ahmed','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Rehan','Khan','Male','2000-01-01','Shaheen','Four','Abdul Alem Khan','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Amjad',' Ahmed','Male','2000-01-01','Excellence','Five','Gulam rassol','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Mansor','Ahmed','Male','2000-01-01','Modern','Six','Abdulah','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Abid','Ali','Male','2000-01-01','Shaheen','Seven','Mansoor Ahmed','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);
CALL student_enrollment('Gulam ','Rassol','Male','2000-01-01','Excellence','Eight','Abid Ali','12345-1234567-1','2020/2021','03311122211',
'abc@gmail','Sukkur',@s_id,@p_id);

CALL employee_insert('Dheeraj','Parkash','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);
CALL employee_insert('Laksh','Kumar','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);
CALL employee_insert('Adarsh','Kumar','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);
CALL employee_insert('Zeshan','Ahmed','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);
CALL employee_insert('Nadir','Ali','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);
CALL employee_insert('Noman','Ahmed','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);
CALL employee_insert('Faizan','Ali','Male','2020-07-01','Teacher','12345-1234567-1','10000','03332121352','abc@gmail.com','Sukkur',@e_id);

INSERT INTO subjects Values('English','1',100,'KG','2020/2021');
INSERT INTO subjects Values('Math','2',100,'KG','2020/2021');
INSERT INTO subjects Values('Sindhi','3',100,'KG','2020/2021');
INSERT INTO subjects Values('English','1',100,'One','2020/2021');
INSERT INTO subjects Values('Math','2',100,'One','2020/2021');
INSERT INTO subjects Values('sindhi','3',100,'One','2020/2021');
INSERT INTO subjects Values('Urdu','4',100,'One','2020/2021');
INSERT INTO subjects Values('English','5',100,'Two','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Two','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Two','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Two','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Two','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Two','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Two','2020/2021');
INSERT INTO subjects Values('English','5',100,'Three','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Three','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Three','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Three','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Three','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Three','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Three','2020/2021');
INSERT INTO subjects Values('English','5',100,'Four','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Four','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Four','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Four','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Four','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Four','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Four','2020/2021');
INSERT INTO subjects Values('English','5',100,'Five','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Five','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Five','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Five','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Five','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Five','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Five','2020/2021');
INSERT INTO subjects Values('English','5',100,'Six','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Six','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Six','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Six','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Six','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Six','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Six','2020/2021');
INSERT INTO subjects Values('English','5',100,'Seven','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Seven','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Seven','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Seven','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Seven','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Seven','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Seven','2020/2021');
INSERT INTO subjects Values('English','5',100,'Eight','2020/2021');
INSERT INTO subjects Values('Math','2',100,'Eight','2020/2021');
INSERT INTO subjects Values('Sindhi','3',75,'Eight','2020/2021');
INSERT INTO subjects Values('Urdu','4',75,'Eight','2020/2021');
INSERT INTO subjects Values('Science','5',100,'Eight','2020/2021');
INSERT INTO subjects Values('P.Studies','6',75,'Eight','2020/2021');
INSERT INTO subjects Values('Isl/Ikh','7',75,'Eight','2020/2021');

CALL result_insertion(1,'KG','2020/2021','Mid term-I','English',80);
CALL result_insertion(1,'KG','2020/2021','Mid term-I','Math',90);
CALL result_insertion(1,'KG','2020/2021','Mid term-I','Sindhi',75);

CALL result_insertion(2,'KG','2020/2021','Mid term-I','English',75);
CALL result_insertion(2,'KG','2020/2021','Mid term-I','Math',95);
CALL result_insertion(2,'KG','2020/2021','Mid term-I','Sindhi',80);

CALL result_insertion(3,'KG','2020/2021','Mid term-I','English',95);
CALL result_insertion(3,'KG','2020/2021','Mid term-I','Math',75);
CALL result_insertion(3,'KG','2020/2021','Mid term-I','Sindhi',70);

CALL result_insertion(1,'KG','2020/2021','Mid term-II','English',80);
CALL result_insertion(1,'KG','2020/2021','Mid term-II','Math',90);
CALL result_insertion(1,'KG','2020/2021','Mid term-II','Sindhi',75);

CALL result_insertion(2,'KG','2020/2021','Mid term-II','English',75);
CALL result_insertion(2,'KG','2020/2021','Mid term-II','Math',95);
CALL result_insertion(2,'KG','2020/2021','Mid term-II','Sindhi',80);

CALL result_insertion(3,'KG','2020/2021','Mid term-II','English',95);
CALL result_insertion(3,'KG','2020/2021','Mid term-II','Math',75);
CALL result_insertion(3,'KG','2020/2021','Mid term-II','Sindhi',70);

CALL result_insertion(1,'KG','2020/2021','Final','English',75);
CALL result_insertion(1,'KG','2020/2021','Final','Math',92);
CALL result_insertion(1,'KG','2020/2021','Final','Sindhi',86);

CALL result_insertion(2,'KG','2020/2021','Final','English',83);
CALL result_insertion(2,'KG','2020/2021','Final','Math',76);
CALL result_insertion(2,'KG','2020/2021','Final','Sindhi',94);

CALL result_insertion(3,'KG','2020/2021','Final','English',96);
CALL result_insertion(3,'KG','2020/2021','Final','Math',89);
CALL result_insertion(3,'KG','2020/2021','Final','Sindhi',85);

CALL final_result(1,'KG','Final','2020/2021');
CALL final_result(2,'KG','Final','2020/2021');
CALL final_result(3,'KG','Final','2020/2021');
