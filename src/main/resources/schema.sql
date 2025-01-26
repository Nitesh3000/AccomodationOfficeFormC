CREATE DATABASE IF NOT EXISTS ashram_db;

USE ashram_db;

CREATE TABLE IF NOT EXISTS form_data (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    phone VARCHAR(20) NOT NULL,
    message TEXT NOT NULL,
    address VARCHAR(255),
    city VARCHAR(100),
    state VARCHAR(100),
    zip_code VARCHAR(20),
    country VARCHAR(100),
    visa_details TEXT,
    from_date DATE,
    to_date DATE
);
