CREATE TABLE `my_img` (
  `uuid` varchar(32) NOT NULL COMMENT '图片ID',
  `groups` varchar(32) DEFAULT NULL COMMENT '组',
  `url` varchar(255) DEFAULT NULL COMMENT '路径',
  `imgUrl` varchar(255) DEFAULT NULL COMMENT '图片路径',
  `extName` varchar(32) DEFAULT NULL COMMENT '类型',
  `oldName` varchar(255) DEFAULT NULL COMMENT '旧文件名称',
  PRIMARY KEY (`uuid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
