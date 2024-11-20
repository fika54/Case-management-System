CREATE DATABASE CaseManagement;

USE CaseManagement;

CREATE TABLE users(
	UserId INT auto_increment PRIMARY KEY,
    UserName varchar(255),
    Email varchar(255) not null,
    Role varchar(50) not null
);

CREATE TABLE cases (
    id INT AUTO_INCREMENT PRIMARY KEY,
    case_name VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(50),
    UserId int,
    foreign key (UserId) references users(UserId),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
