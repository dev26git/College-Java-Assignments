# Assignment 9
WAP demonstrating the Database Connectivity (MySQL/Oracle) in Java.  

I created a table named product in the sql database on my local system.
I used Java Database Connectivity (JDBC) to access, update and delete entries in the table.

1. A model represents a table of the database.
2. Repos contain Database connectivity class named DBUtil. Queries for each model as strings and corresponding methods to execute those queries.
3. Client represents the front-end.
4. Service is a layer between client and database that is used to perform specific operations like getting the total price of a given number of products.