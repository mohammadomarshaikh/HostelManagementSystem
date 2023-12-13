/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import static dao.DbOperations.setDataOrDelete;
import javax.swing.JOptionPane;

public class tables {
    public static void main(String[] args) {
        try {
            // SQL statements for creating tables
            String createHostelTable = "CREATE TABLE Hostel (Hostel_ID INT PRIMARY KEY, Hostel_name VARCHAR(255), No_of_rooms INT, no_of_students INT)";
            String createAdministratorTable = "CREATE TABLE Administrator (Admin_ID INT PRIMARY KEY, Fname VARCHAR(255), Lname VARCHAR(255), Mob_no VARCHAR(20), Hostel_ID INT, FOREIGN KEY (Hostel_ID) REFERENCES Hostel(Hostel_ID))";
            String createRoomTable = "CREATE TABLE Room (Room_ID INT PRIMARY KEY, Hostel_ID INT, FOREIGN KEY (Hostel_ID) REFERENCES Hostel(Hostel_ID))";
            String createStudentTable = "CREATE TABLE Student (Student_ID INT PRIMARY KEY, Fname VARCHAR(255), Lname VARCHAR(255), Mob_no VARCHAR(20), Dept VARCHAR(255), Year_of_study INT, Hostel_ID INT, Room_ID INT, FOREIGN KEY (Hostel_ID) REFERENCES Hostel(Hostel_ID), FOREIGN KEY (Room_ID) REFERENCES Room(Room_ID))";
            String createVisitorTable = "CREATE TABLE Visitor (Visitor_ID INT PRIMARY KEY, In_time DATETIME, Out_time DATETIME, Date DATETIME, Visitor_name VARCHAR(255), Student_ID INT, FOREIGN KEY (Student_ID) REFERENCES Student(Student_ID))";
            String createFurnitureTable = "CREATE TABLE Furniture (Furniture_ID INT PRIMARY KEY, Furniture_type VARCHAR(255), Hostel_ID INT, Room_ID INT, FOREIGN KEY (Hostel_ID) REFERENCES Hostel(Hostel_ID), FOREIGN KEY (Room_ID) REFERENCES Room(Room_ID))";
            String createRoomAllocationTable = "CREATE TABLE Room_Allocation (Allocation_ID INT PRIMARY KEY, Room_ID INT, Admin_ID INT, Allocation_Date DATE, FOREIGN KEY (Room_ID) REFERENCES Room(Room_ID), FOREIGN KEY (Admin_ID) REFERENCES Administrator(Admin_ID))";

            // Execute the create table statements
            DbOperations.setDataOrDelete(createHostelTable, "Hostel Table Created Successfully");
            DbOperations.setDataOrDelete(createAdministratorTable, "Administrator Table Created Successfully");
            DbOperations.setDataOrDelete(createRoomTable, "Room Table Created Successfully");
            DbOperations.setDataOrDelete(createStudentTable, "Student Table Created Successfully");
            DbOperations.setDataOrDelete(createVisitorTable, "Visitor Table Created Successfully");
            DbOperations.setDataOrDelete(createFurnitureTable, "Furniture Table Created Successfully");
            DbOperations.setDataOrDelete(createRoomAllocationTable, "Room Allocation Table Created Successfully");

            // Insert data into tables
            insertHostelData();
            insertAdministratorData();
            insertRoomData();
            insertStudentData();
            insertVisitorData();
            insertFurnitureData();
            insertRoomAllocationData();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Insert data into Hostel table
    private static void insertHostelData() {
        String insertHostelData = "INSERT INTO Hostel (Hostel_ID, Hostel_name, No_of_rooms, no_of_students) VALUES " +
            "(1, 'Hostel A', 50, 200), " +
            "(2, 'Hostel B', 60, 250), " +
            "(3, 'Hostel C', 45, 180), " +
            "(4, 'Hostel D', 55, 220), " +
            "(5, 'Hostel E', 70, 280)";
        setDataOrDelete(insertHostelData, "Hostel Data Inserted Successfully");
    }

    // Insert data into Administrator table
    private static void insertAdministratorData() {
        String insertAdministratorData = "INSERT INTO Administrator (Admin_ID, Fname, Lname, Mob_no, Hostel_ID) VALUES " +
            "(1, 'John', 'Doe', '555-555-5555', 1), " +
            "(2, 'Jane', 'Smith', '555-555-5556', 2), " +
            "(3, 'Mark', 'Johnson', '555-555-5557', 3), " +
            "(4, 'Sarah', 'Wilson', '555-555-5558', 4), " +
            "(5, 'Michael', 'Brown', '555-555-5559', 5)";
        setDataOrDelete(insertAdministratorData, "Administrator Data Inserted Successfully");
    }



    // Insert data into Room table
    private static void insertRoomData() {
        String insertRoomData = "INSERT INTO Room (Room_ID, Hostel_ID) VALUES " +
            "(1, 1), " +
            "(2, 2), " +
            "(3, 3), " +
            "(4, 4), " +
            "(5, 5)";
        setDataOrDelete(insertRoomData, "Room Data Inserted Successfully");
    }
    
    
    // Insert data into Student table
    private static void insertStudentData() {
        String insertStudentData = "INSERT INTO Student (Student_ID, Fname, Lname, Mob_no, Dept, Year_of_study, Hostel_ID, Room_ID) VALUES " +
            "(1, 'Alice', 'Smith', '987-654-3210', 'Computer Science', 2, 1, 1), " +
            "(2, 'Bob', 'Johnson', '987-654-3211', 'Electrical Engineering', 3, 2, 2), " +
            "(3, 'Carol', 'Williams', '987-654-3212', 'Mechanical Engineering', 2, 3, 1), " +
            "(4, 'David', 'Brown', '987-654-3213', 'Civil Engineering', 4, 4, 3), " +
            "(5, 'Eve', 'Davis', '987-654-3214', 'Chemistry', 1, 5, 4)";
        setDataOrDelete(insertStudentData, "Student Data Inserted Successfully");
    }

    // Insert data into Visitor table
    private static void insertVisitorData() {
        String insertVisitorData = "INSERT INTO Visitor (Visitor_ID, In_time, Out_time, Date, Visitor_name, Student_ID) VALUES " +
            "(1, '2023-01-15 10:00:00', '2023-01-15 15:00:00', '2023-01-15', 'John Doe', 1), " +
            "(2, '2023-01-16 11:30:00', '2023-01-16 16:30:00', '2023-01-16', 'Jane Smith', 2), " +
            "(3, '2023-01-17 14:15:00', '2023-01-17 19:15:00', '2023-01-17', 'Mark Johnson', 3), " +
            "(4, '2023-01-18 13:45:00', '2023-01-18 18:45:00', '2023-01-18', 'Sarah Wilson', 4), " +
            "(5, '2023-01-19 12:30:00', '2023-01-19 17:30:00', '2023-01-19', 'Michael Brown', 5)";
        setDataOrDelete(insertVisitorData, "Visitor Data Inserted Successfully");
    }

    // Insert data into Furniture table
    private static void insertFurnitureData() {
        String insertFurnitureData = "INSERT INTO Furniture (Furniture_ID, Furniture_type, Hostel_ID, Room_ID) VALUES " +
            "(1, 'Desk', 1, 1), " +
            "(2, 'Chair', 2, 2), " +
            "(3, 'Bed', 3, 3), " +
            "(4, 'Wardrobe', 4, 4), " +
            "(5, 'Bookshelf', 5, 5)";
        setDataOrDelete(insertFurnitureData, "Furniture Data Inserted Successfully");
    }
    // Insert data into Room_Allocation table
    private static void insertRoomAllocationData() {
        String insertRoomAllocationData = "INSERT INTO Room_Allocation (Allocation_ID, Room_ID, Admin_ID, Allocation_Date) VALUES " +
            "(1, 1, 1, '2023-01-20'), " +
            "(2, 2, 2, '2023-01-21'), " +
            "(3, 3, 3, '2023-01-22'), " +
            "(4, 4, 4, '2023-01-23'), " +
            "(5, 5, 5, '2023-01-24')";
        setDataOrDelete(insertRoomAllocationData, "Room Allocation Data Inserted Successfully");
    }

}



