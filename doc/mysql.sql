-- 用户表
DROP TABLE IF EXISTS sys_user;
CREATE TABLE sys_user (
  id varchar(64) NOT NULL COMMENT '用户id',
  username varchar(50) NOT NULL COMMENT '账户名称',
  salt varchar(20) DEFAULT NULL COMMENT '加密盐值',
  password varchar(200) NOT NULL COMMENT '用户密码密文',
  phone varchar(20) DEFAULT NULL COMMENT '手机号码',
  dept_id varchar(64) DEFAULT NULL COMMENT '部门id',
  real_name varchar(60) DEFAULT NULL COMMENT '真实名称',
  nick_name varchar(60) DEFAULT NULL COMMENT '昵称',
  email varchar(50) DEFAULT NULL COMMENT '邮箱(唯一)',
  status tinyint(4) COMMENT '账户状态(1.正常 2.锁定 )',
  sex tinyint(4) COMMENT '性别(1.男 2.女)',
  deleted tinyint(4)  COMMENT '是否删除(1未删除；0已删除)',
  create_id varchar(64) DEFAULT NULL COMMENT '创建人',
  update_id varchar(64) DEFAULT NULL COMMENT '更新人',
  create_where tinyint(4) COMMENT '创建来源(1.web 2.android 3.ios )',
  create_time datetime DEFAULT NULL COMMENT '创建时间',
  update_time datetime DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='系统用户';

INSERT INTO sys_user(id, username, salt, password, phone, dept_id, real_name, nick_name, email, status, sex, deleted, create_id, update_id, create_where, create_time, update_time) VALUES ('1', 'admin', '324ce32d86224b00a02b', '2102b59a75ab87616b62d0b9432569d0', '13888888888', '1', '爷青回', 'Prescott.Wen', 'xxxxxx@163.com', 1, 2, 1, '1', '1', 3, '2019-09-22 19:38:05', '2021-07-18 09:15:22');


-- auto-generated definition
create table sougu_zhaomu_driver
(
    id                int(11) unsigned auto_increment comment 'ID'
        primary key,
    user_code         varchar(64)             not null comment '账户编号',
    password          varchar(64)  default '' null comment '用户密码密文',
    phone             varchar(20)  default '' null comment '手机号码',
    real_name         varchar(30)  default '' null comment '真实名称',
    nick_name         varchar(30)  default '' null comment '昵称',
    email             varchar(50)  default '' null comment '邮箱(唯一)',
    sex               int(1)       default 0  null comment '性别(0.未知 1.男 2.女)',
    identity_card_a   varchar(200) default '' null comment '身份证a面',
    identity_card_b   varchar(200) default '' null comment '身份证b面',
    driving_lic_a     varchar(200) default '' null comment '驾照a面',
    driving_lic_b     varchar(200) default '' null comment '驾照b面',
    invitation_info   varchar(200) default '' null comment '邀请信息',
    invitation_method varchar(200) default '' null comment '邀请方式',
    team_id           varchar(64)  default '' null comment '车队ID',
    status            int(1)       default 0  null comment '账户状态(0.未知 1.正常 2.锁定 )',
    deleted           int(1)       default 1  null comment '是否删除(1未删除；0已删除)',
    from_where        int(1)       default 0  null comment '创建来源(0.unknow 1.web 2.android 3.ios )',
    create_id         varchar(64)  default '' null comment '创建人',
    update_id         varchar(64)  default '' null comment '更新人',
    create_time       datetime                null comment '创建时间',
    update_time       datetime                null comment '更新时间'
)
    comment '搜谷招募司机';