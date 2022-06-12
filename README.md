环境：

1.IDEA

2.MySQL 5.7.19

3.Tomcat 8.5.7

4.Maven 3.6
5.spring
要求：

需要熟练掌握MySQL数据库，Spring，JavaWeb及MyBatis知识，简单的前端知识；
数据库
  CREATE TABLE user (
id  INT NOT NULL AUTO_INCREMENT COMMENT '编号',
username varchar(50) NOT NULL COMMENT '登录名',
password INT NOT NULL COMMENT '密码',
usertype varchar(50) NOT NULL COMMENT '用户类型',
KEY id (id)
) ENGINE=INNODB DEFAULT CHARSET=utf8
