CREATE TABLE USER (
  id bigint(20) NOT NULL AUTO_INCREMENT,
  first_name varchar(50) NOT NULL,
  last_name varchar(50) DEFAULT NULL,
  username varchar(100) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY UK_username (username)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
