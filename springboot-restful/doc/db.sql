create database springbootdb

drop table if exist `city`

use springbootdb

create table `city`(
    `id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '城市编号',
    `province_id` int(10) unsigned not null comment '省份编号',
    `city_name` varchar(25) default null comment '城市名称',
    `description` varchar(25) default null comment '描述',
    primary key (`id`)
)engine=myisam auto_increment=1 default charset=utf8;