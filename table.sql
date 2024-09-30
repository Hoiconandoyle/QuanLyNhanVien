CREATE TABLE `employee`(
    `employee_id` VARCHAR(10) NOT NULL,
    `name` VARCHAR(100) NOT NULL,
    `sex` BOOLEAN NOT NULL,
    `email` VARCHAR(255) NOT NULL,
    `phone` VARCHAR(10) NOT NULL,
    `address` VARCHAR(255) NOT NULL,
    `department_id` VARCHAR(10) NOT NULL,
	PRIMARY KEY(`employee_id`)
);
CREATE TABLE `department`(
    `department_id` VARCHAR(10) NOT NULL,
    `department_name` VARCHAR(50) NOT NULL,
    PRIMARY KEY(`department_id`)
);
ALTER TABLE
    `employee` ADD CONSTRAINT `employee_department_id_foreign` FOREIGN KEY(`department_id`) REFERENCES `department`(`department_id`) ON DELETE CASCADE ON UPDATE CASCADE;
