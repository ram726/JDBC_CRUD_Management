# JDBC_CRUD_Management
* This Project Build with  JDBC API and MySql(version 5.1.7).
* DataBase JAR File Required for this  to run project is (mysql-connector-java-5.1.7-bin.jar).
***Please check database version and jar before running this project***


****About Project*****
This JDBC Project is help to perform Insert, Delete, Update and Select Data from MySql DataBase.

****Steps to Create This Project*****
1. Create lib Folder in Project and Copy DataBase JAR File and Configure It.
2. Select src folder and create a class having main method (Start.java). This is the main file to run, where user get options to choose DataBase Operation.
3. Select Src folder and cretae a package structure (com.student.manage).
4. Select manage sub package and create 3 files
  4.1 ConnectionProvider.java
  4.2 Student.java
  4.3 StudentDao.java
5. In "ConnectionProvider.java" write code to coonect Java application to DataBase.
6. Create table(student) in DataBase(studentmanagement) with four fields(sid,sname,phone,city).
7. In "Student.java", this is POJO Class where constructors, getter methods and setter methods are define.
8. In "StudentDao.java", Here i write Database Logic Code(Like- PreparedStatemet, Statement).
