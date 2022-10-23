CREATE DATABASE `bondar_sql`;
USE `bondar_sql`;

CREATE TABLE `user` (
    `id` SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(50) NOT NULL,
    `last_name` VARCHAR(50) NOT NULL,
    `age` TINYINT UNSIGNED NOT NULL,
    `gender` enum('male','female') NOT NULL,
    PRIMARY KEY (`id`),
    KEY `i_age` (`age`),
    KEY `i_gender` (`gender`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO `user` (`id`, `first_name`, `last_name`, `gender`, `age`) 
VALUES (1, 'Robert', 'Pattinson', 'male', 18),
(2, 'Isabella', 'Kravitz', 'female', 34), 
(3, 'Collin', 'Farrell', 'male', 11), 
(4, 'Matthew', 'McConaughey', 'male', 52), 
(5, 'Jessica', 'Chastain', 'female', 43), 
(6, 'Anne', 'Hathaway', 'female', 39), 
(7, 'Leonardo', 'DiCaprio', 'male', 12),
(8, 'Cillian', 'Murphy', 'male', 44),
(9, 'Tom', 'Hardy', 'male', 45), 
(10, 'Elliot', 'Page', 'female', 14);

#SELECT * FROM `user` WHERE `age` >= 18 ORDER BY `age`;
#SELECT * FROM `user` WHERE `age` >= 18 AND `age` <= 60 AND `gender` = 'male' ORDER BY `age`;
#SELECT * FROM `user` WHERE `gender` = 'female' AND LOCATE('a', `first_name`) > 0;