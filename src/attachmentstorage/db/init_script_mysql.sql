-- ================================================
-- 附件存储管理初始化脚本 MySQL 版 (2010-01-01)
-- ================================================

-- 创建表: attachment_file
CREATE TABLE attachment_file (
    id varchar(36) NOT NULL ,
    entity_id varchar(50) NULL ,
    entity_class_name varchar(400) NULL ,
    attachment_name varchar(100) NULL ,
    virtual_path varchar(1000) NULL ,
    folder_rule varchar(100) NULL ,
    file_type varchar(20) NULL ,
    file_size int NULL ,
    file_status int NULL ,
    order_id varchar(40) NULL ,
    created_date datetime NULL ,
    storage_node_index int NULL
);

-- 设置查询索引: EntityId, EntityClassName
CREATE INDEX ix_attachment_file_entityId_entityClassName ON attachment_file (entity_id ASC, entity_class_name ASC);

-- 设置主键: Id
ALTER TABLE attachment_File ADD PRIMARY KEY (id);

-- 创建表: attachment_distributedfile
CREATE TABLE attachment_distributedfile (
    id varchar(36) NOT NULL ,
    virtual_path varchar(1000) NULL ,
    file_data blob NULL ,
    created_date datetime NULL
);

ALTER TABLE attachment_distributedfile ADD PRIMARY KEY (id);

-- 创建表: attachment_warn
CREATE TABLE attachment_warn (
    id varchar(36) NOT NULL ,
    warn_type varchar(20) NULL ,
    message varchar(200) NULL ,
    attachment_storage_id nvarchar(36) NULL ,
    virtual_path varchar(1000) NULL ,
    attachment_name varchar(100) NULL ,
    file_type varchar(20) NULL ,
    file_size int NULL ,
    created_date datetime NULL
);

-- 设置主键: Id
ALTER TABLE attachment_warn ADD CONSTRAINT pk_attachment_warn PRIMARY KEY CLUSTERED (id);
