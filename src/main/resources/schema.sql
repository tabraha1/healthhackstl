CREATE TABLE DOCTOR(
    DOCTOR_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    LAST_NAME VARCHAR(16) NOT NULL,
    VISIT_INFO VARCHAR(200) NOT NULL,
    ADDRESS VARCHAR(64),
    STATE VARCHAR(12)
);

CREATE TABLE USERS(
    USER_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    FIRST_NAME VARCHAR(64),
    LAST_NAME VARCHAR(64),
    SEX VARCHAR(64),
    DOB DATE,
    HEIGHT INT NOT NULL,
    WEIGHT INT NOT NULL,
    PHONE_NUMBER VARCHAR(24)
);

CREATE TABLE DOCTOR_VISIT(
    VISIT_ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    DOCTOR_ID BIGINT NOT NULL,
    USER_ID BIGINT NOT NULL,
    VISIT_DATE DATE
);

ALTER TABLE DOCTOR_VISIT ADD FOREIGN KEY (DOCTOR_ID) REFERENCES DOCTOR(DOCTOR_ID);
ALTER TABLE DOCTOR_VISIT ADD FOREIGN KEY (USER_ID) REFERENCES USERS(USER_ID);
CREATE INDEX IDX_VISIT_DATE_ ON DOCTOR_VISIT(VISIT_DATE);