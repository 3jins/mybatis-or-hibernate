CREATE DATABASE IF NOT EXISTS moh;

ALTER DATABASE moh
    DEFAULT CHARACTER SET utf8
    DEFAULT COLLATE utf8_general_ci;

USE moh;

DROP TABLE IF EXISTS friend;

CREATE TABLE friend (
    friend_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(127) NOT NULL,
    age INT NOT NULL,
    characteristic VARCHAR(255) DEFAULT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP() NOT NULL,
    updated_at DATETIME DEFAULT CURRENT_TIMESTAMP() NOT NULL
);
