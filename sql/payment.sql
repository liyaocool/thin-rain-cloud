CREATE TABLE `payment`
(
    `id`     bigint(20) NOT NULL AUTO_INCREMENT COMMENT 'id',
    `serial` varchar(200) DEFAULT '' COMMENT '流水号',
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 1
  DEFAULT CHARSET = UTF8