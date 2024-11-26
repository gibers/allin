CREATE SEQUENCE users_id_seq
    START WITH 1
    INCREMENT BY 1;

CREATE SEQUENCE users_user_id_seq
    START WITH 1000
    INCREMENT BY 1;


CREATE TABLE users
(
    id       BIGINT NOT NULL DEFAULT NEXTVAL('users_id_seq'),
    user_id   BIGINT not null DEFAULT NEXTVAL('users_user_id_seq'),
    username VARCHAR(255),
    password VARCHAR(255),
    email    VARCHAR(255) unique ,
    role     VARCHAR(255),
    CONSTRAINT pk_users PRIMARY KEY (id)
);

