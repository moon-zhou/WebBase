-- 创建用户表
create TABLE t_user(
    id BIGINT not null PRIMARY KEY comment '主键id',
  name VARCHAR(80) not null comment '用户名',
    uid VARCHAR(40) comment '用户id',
    nickname VARCHAR(80) comment '用户昵称',
  password VARCHAR(40) not null comment '用户密码',
    sex tinyint not null comment '用户性别',
  email VARCHAR(64) comment '用户邮箱',
    mobile VARCHAR(20) comment '用户移动电话',
    create_time datetime not NULL DEFAULT CURRENT_TIMESTAMP comment '数据创建时间',
    update_time datetime not NULL comment '更新时间'
) comment '用户信息表';


--  创建角色表
create TABLE t_role(
    id BIGINT not null PRIMARY KEY comment '主键id,角色id',
    p_id BIGINT COMMENT '父角色id',
    role_name VARCHAR(64) COMMENT '角色名称',
    role_desc VARCHAR(200) COMMENT '角色描述',
    create_time datetime not NULL DEFAULT CURRENT_TIMESTAMP comment '数据创建时间',
    update_time datetime not NULL comment '更新时间'
) comment '角色表';


-- 创建权限表
create TABLE t_right(
    id BIGINT not null PRIMARY KEY comment '主键id,角色id',
    p_id BIGINT COMMENT '父权限id',
    right_name VARCHAR(64) COMMENT '权限名称',
    right_code VARCHAR(100) COMMENT '权限编码',
    right_desc VARCHAR(200) COMMENT '权限描述',
    create_time datetime not NULL DEFAULT CURRENT_TIMESTAMP comment '数据创建时间',
    update_time datetime not NULL comment '更新时间'
) COMMENT '权限表';