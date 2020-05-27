CREATE TABLE IF NOT EXISTS users(
	user_id BIGINT AUTO_INCREMENT,
	username VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL,
	password VARCHAR(255) NOT NULL
);

CREATE TABLE IF NOT EXISTS roles(
	role_id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	name VARCHAR(20) NOT NULL
);

CREATE TABLE IF NOT EXISTS groups(
	group_id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	group_name VARCHAR(50),
	created_at TIMESTAMP,
	updated_at TIMESTAMP
);

CREATE TABLE IF NOT EXISTS weights(
	weight_id BIGINT AUTO_INCREMENT PRIMARY KEY NOT NULL,
	weight DOUBLE,
	body_fat DOUBLE,
	subcutaneous_fat DOUBLE,
	record_date DATE,
	user_id BIGINT,
	created_at TIMESTAMP,
	updated_at TIMESTAMP
);