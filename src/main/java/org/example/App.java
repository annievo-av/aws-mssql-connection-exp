package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.*;

@SpringBootApplication
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
//    public static void main(String[] args) {
////        jdbc:sqlserver://[serverName[\instanceName][:portNumber]][;property=value[;property=value]]
//        String connectionUrl = "jdbc:sqlserver://localhost:1433;databaseName=master;integratedSecurity=true;";
////        String connectionUrl = "jdbc:sqlserver://rdsannie.cjzuieo6imxi.us-east-2.rds.amazonaws.com:1433;databaseName=;user=;password=;";
//
//        try {
//            System.out.print("Connecting to SQL Server ... ");
//            try (Connection connection = DriverManager.getConnection(connectionUrl)) {
//                System.out.println("Done.");
//
//                // Create a sample database
//                System.out.print("Dropping and creating database 'SampleDB' ... ");
//                String sql = "DROP DATABASE IF EXISTS [SampleDB]; CREATE DATABASE [SampleDB]";
//                try (Statement statement = connection.createStatement()) {
//                    statement.executeUpdate(sql);
//                    System.out.println("Done.");
//                }
//
//                // Create a Table and insert some sample data
//                System.out.print("Creating sample table with data, press ENTER to continue...");
//                System.in.read();
//                sql = new StringBuilder().append("USE SampleDB; ").append("CREATE TABLE Employees ( ")
//                        .append(" Id INT IDENTITY(1,1) NOT NULL PRIMARY KEY, ").append(" Name NVARCHAR(50), ")
//                        .append(" Location NVARCHAR(50) ").append("); ")
//                        .append("INSERT INTO Employees (Name, Location) VALUES ").append("(N'Jared', N'Australia'), ")
//                        .append("(N'Nikita', N'India'), ").append("(N'Tom', N'Germany'); ").toString();
//                try (Statement statement = connection.createStatement()) {
//                    statement.executeUpdate(sql);
//                    System.out.println("Done.");
//                }
//
//                // INSERT demo
//                System.out.print("Inserting a new row into table, press ENTER to continue...");
//                System.in.read();
//                sql = new StringBuilder().append("INSERT Employees (Name, Location) ").append("VALUES (?, ?);")
//                        .toString();
//                try (PreparedStatement statement = connection.prepareStatement(sql)) {
//                    statement.setString(1, "Jake");
//                    statement.setString(2, "United States");
//                    int rowsAffected = statement.executeUpdate();
//                    System.out.println(rowsAffected + " row(s) inserted");
//                }
//
//                // UPDATE demo
//                String userToUpdate = "Nikita";
//                System.out.print("Updating 'Location' for user '" + userToUpdate + "', press ENTER to continue...");
//                System.in.read();
//                sql = "UPDATE Employees SET Location = N'United States' WHERE Name = ?";
//                try (PreparedStatement statement = connection.prepareStatement(sql)) {
//                    statement.setString(1, userToUpdate);
//                    int rowsAffected = statement.executeUpdate();
//                    System.out.println(rowsAffected + " row(s) updated");
//                }
//
//                // DELETE demo
//                String userToDelete = "Jared";
//                System.out.print("Deleting user '" + userToDelete + "', press ENTER to continue...");
//                System.in.read();
//                sql = "DELETE FROM Employees WHERE Name = ?;";
//                try (PreparedStatement statement = connection.prepareStatement(sql)) {
//                    statement.setString(1, userToDelete);
//                    int rowsAffected = statement.executeUpdate();
//                    System.out.println(rowsAffected + " row(s) deleted");
//                }
//
//                // READ demo
//                System.out.print("Reading data from table, press ENTER to continue...");
//                System.in.read();
//                sql = "SELECT Id, Name, Location FROM Employees;";
//                try (Statement statement = connection.createStatement();
//                     ResultSet resultSet = statement.executeQuery(sql)) {
//                    while (resultSet.next()) {
//                        System.out.println(
//                                resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
//                    }
//                }
//                connection.close();
//                System.out.println("All done.");
//            }
//        } catch (Exception e) {
//            System.out.println();
//            e.printStackTrace();
//        }
//    }
