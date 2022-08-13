# Project
To use this project you must have the following on Windows or Mac

NetBeans 12.5 installed 
MySQL Workbench 8.0 with developer packages selected at installation. 
Java Development Kit 17.0.1

1. Get the source code from GitHub
2. Run MySQL Workbench
3. Execute the database file (ResultSystemDB) located in the database folder of the downloaded file. 
4. Make sure that Workbench is connected to Localhost: 3306. 
5. Install the Java Development Kit 17 on your system. 
6. Run NetBeans 12.5 and import the StudentResultApp folder. 
7. You may get an issue stating that the MySQL connector is not found. If this is the case, the is a copy of the 
jar file that is required this solve this within the applcation folder. Change the source file path to /StudentResultApp/dist/lib/mysql-connector-java-8.0.30. 
8. In each of the source code files for the classes, you will have to update the variables realated to the database to match your MySQL username, password and 
connection path. 
You will find these under the comment 
/*
    Connections to database - Fill in on all classes. 
*/
9. You should now be able to click run in NetBeans and the applcation will start. There are login accounts already prepared in the database file but login 
credentials are as follows. 

Root user
-Email:root@root.ie
-Password:password
Administration User
-Email: john@test.ie
-Password: password
Teacher User
-Email: Tess@datester.ie
-Password: Password1

You may also execute the MockDate file found in the database folder. This will populate the tables will more data.
Each of these users can also be used to log into the system once the file has been executed. 
