CREATE TABLE `tbl_todo` (
  `tno` int NOT NULL AUTO_INCREMENT,
  `todo` varchar(100)  NOT NULL,
  `duedate` date DEFAULT (curdate()),
  `finished` tinyint NOT NULL DEFAULT '0',
  PRIMARY KEY (`tno`)
); 
INSERT INTO `project`.`tbl_todo`
(`todo`,`duedate`)
VALUES('JSP 공부','2023-05-05');


insert into tbl_todo values ();


