create database network;

use network;

# 项目信息表
CREATE TABLE `t_project` (
    `project_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '项目id',
    `project_type` int(4) NOT NULL COMMENT '模拟类型0:稳态模拟，1:...',
    `comment` VARCHAR(200) DEFAULT NULL COMMENT '项目描述',
    `update_by` VARCHAR(20) DEFAULT NULL COMMENT '修改人',
    `create_time` DATETIME DEFAULT NULL,
    `update_time` DATETIME DEFAULT NULL,
    PRIMARY KEY (`project_id`)
);

# 节点数据表
CREATE TABLE `t_node` (
    `node_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '节点id',
    `project_id` int(11) DEFAULT NULL COMMENT '节点所属项目id',
    `pressure` double DEFAULT NULL COMMENT '节点压力，MPa',
    `pressure_state` int(4) DEFAULT NULL COMMENT '节点压力是否已知0:未知，1:已知',
    `flow` double DEFAULT NULL COMMENT '节点载荷, Sm^3/d',
    `flow_state` int(4) DEFAULT NULL COMMENT '节点载荷是否已知0:未知，1:已知',
    `elevation` double DEFAULT NULL COMMENT '节点海拔，m',
    PRIMARY KEY (`node_id`)
);

# 管道数据表
CREATE TABLE `t_pipe` (
    `pipe_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '管段id',
    `project_id` int(11) DEFAULT NULL COMMENT '管段所属项目id',
    `start_node` int(11) DEFAULT NULL COMMENT '管段起始节点id',
    `end_node` int(11) DEFAULT NULL COMMENT '管段终止节点id',
    `diameter` double DEFAULT NULL COMMENT '管段内径，m',
    `roughness` double DEFAULT NULL COMMENT '粗糙度，m',
    `length` double DEFAULT NULL COMMENT '长度，m',
    PRIMARY KEY (`pipe_id`)
);

CREATE TABLE `t_gas` (
    `gas_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '气体id',
    `project_id` int(11) DEFAULT NULL COMMENT '气体所属项目id',
    `relative_density` double DEFAULT NULL COMMENT '相对密度',
    PRIMARY KEY (`gas_id`)
);
