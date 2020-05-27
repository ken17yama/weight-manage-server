INSERT INTO users (username, email, password) VALUES('やまだ けんと', 'kento@yamada', '$2a$10$qi3w.mxGwE8I4SxJz2V0q.SR51miCbAkFaeRuMszUrl84DTcKOgIq');
INSERT INTO users (username, email, password) VALUES('やまざき いづみ', 'izumi@yamazaki', '$2a$10$QZLsVTyYd2r/nYY9yEi7jOGRooD1Pee6E0BDkea7Cx7n7F69Btwpa');
INSERT INTO users (username, email, password) VALUES('やまだ ちくわ', 'chikuwa@yamada', '$2a$10$qi3w.mxGwE8I4SxJz2V0q.SR51miCbAkFaeRuMszUrl84DTcKOgIq');

INSERT INTO roles (name) VALUES('ROLE_USER');
INSERT INTO roles (name) VALUES('ROLE_MODERATOR');
INSERT INTO roles (name) VALUES('ROLE_ADMIN');


INSERT INTO groups (group_name, created_at, updated_at) VALUES('やまだの冷蔵庫', '2020-04-30 01:23:45', '2020-04-30 01:23:45');
INSERT INTO groups (group_name, created_at, updated_at) VALUES('近藤の冷蔵庫', '2020-04-30 01:23:45', '2020-04-30 01:23:45');


INSERT INTO weights (weight, body_fat, subcutaneous_fat, record_date, user_id, created_at, updated_at) VALUES(59.4, 20.5, 18.8, '2020-05-19', 1, '2020-04-30 01:23:45', '2020-04-30 01:23:45');
INSERT INTO weights (weight, body_fat, subcutaneous_fat, record_date, user_id, created_at, updated_at) VALUES(56.2, 27.5, 26.0, '2020-05-19', 2, '2020-04-30 01:23:45', '2020-04-30 01:23:45');
INSERT INTO weights (weight, body_fat, subcutaneous_fat, record_date, user_id, created_at, updated_at) VALUES(58.5, 21.2, 19.6, '2020-05-20', 1, '2020-04-30 01:23:45', '2020-04-30 01:23:45');
INSERT INTO weights (weight, body_fat, subcutaneous_fat, record_date, user_id, created_at, updated_at) VALUES(55.6, 28.0, 26.6, '2020-05-20', 2, '2020-04-30 01:23:45', '2020-04-30 01:23:45');
INSERT INTO weights (weight, body_fat, subcutaneous_fat, record_date, user_id, created_at, updated_at) VALUES(59.2, 20.5, 18.0, '2020-05-21', 1, '2020-04-30 01:23:45', '2020-04-30 01:23:45');
INSERT INTO weights (weight, body_fat, subcutaneous_fat, record_date, user_id, created_at, updated_at) VALUES(56.3, 27.8, 26.3, '2020-05-21', 2, '2020-04-30 01:23:45', '2020-04-30 01:23:45');