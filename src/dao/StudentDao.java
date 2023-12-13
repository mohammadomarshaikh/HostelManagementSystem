/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Student;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;
import dao.DbOperations;

public class StudentDao {
    public static void save(Student student) {
        String query = "INSERT INTO Student (Student_ID, Fname, Lname, Mob_no, Dept, Year_of_study, Hostel_ID, Room_ID) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);
            
            // Set the values in the PreparedStatement
            ps.setString(1, student.getStudent_ID());
            ps.setString(2, student.getFname());
            ps.setString(3, student.getLname());
            ps.setString(4, student.getMob_no());
            ps.setString(5, student.getDept());
            ps.setString(6, student.getYear());
            ps.setString(7, student.getHostel_ID());
            ps.setString(8, student.getRoom_ID());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void update(Student student) {
        String query = "UPDATE Student SET Fname=?, Lname=?, Mob_no=?, Dept=?, Year_of_study=?, Hostel_ID=?, Room_ID=? WHERE Student_ID=?";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);

            // Set the updated values in the PreparedStatement
            ps.setString(1, student.getFname());
            ps.setString(2, student.getLname());
            ps.setString(3, student.getMob_no());
            ps.setString(4, student.getDept());
            ps.setString(5, student.getYear());
            ps.setString(6, student.getHostel_ID());
            ps.setString(7, student.getRoom_ID());
            ps.setString(8, student.getStudent_ID());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Student details updated successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
 
    
public static ArrayList<Student> getAllRecords() {
    ArrayList<Student> arrayList = new ArrayList<>();
    try {
        ResultSet rs = DbOperations.getData("SELECT * FROM Student");
        while (rs.next()) {
            Student student = new Student();
            student.setStudent_ID(rs.getString("Student_ID"));
            student.setFname(rs.getString("Fname"));
            student.setLname(rs.getString("Lname"));
            student.setMob_no(rs.getString("Mob_no"));
            student.setDept(rs.getString("Dept"));
            student.setYear(rs.getString("Year_of_study"));
            student.setHostel_ID(rs.getString("Hostel_ID"));
            student.setRoom_ID(rs.getString("Room_ID"));
            arrayList.add(student);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return arrayList;
}


public static void delete(String studentID) {
    String query = "DELETE FROM Student WHERE Student_ID = '" + studentID + "'";
    DbOperations.setDataOrDelete(query, "Student Deleted Successfully");
}



public static ArrayList<String> getStudentsWithVisitors() {
    ArrayList<String> studentIDs = new ArrayList<>();
    try {
        ResultSet rs = DbOperations.getData("SELECT DISTINCT student_id FROM visitor");
        while (rs.next()) {
            String studentID = rs.getString("student_id");
            studentIDs.add(studentID);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return studentIDs;
}


public static ArrayList<String[]> getStudentsAndVisitorDates() {
    ArrayList<String[]> studentVisitorData = new ArrayList<>();
    try {
        ResultSet rs = DbOperations.getData("SELECT CONCAT(s.fname, ' ', s.lname), v.date FROM student AS s JOIN visitor AS v ON s.student_id = v.student_id");
        while (rs.next()) {
            String studentName = rs.getString(1);
            String visitorDate = rs.getString(2);
            studentVisitorData.add(new String[]{studentName, visitorDate});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return studentVisitorData;
}


public static ArrayList<String[]> getStudentDetailsWithRoomsAndHostels() {
    ArrayList<String[]> studentDetails = new ArrayList<>();
    try {
        ResultSet rs = DbOperations.getData("SELECT s.fname, s.lname, r.room_id, h.hostel_name FROM student AS s JOIN room AS r ON s.room_id = r.room_id JOIN hostel AS h ON r.hostel_id = h.hostel_id");
        while (rs.next()) {
            String firstName = rs.getString(1);
            String lastName = rs.getString(2);
            String roomID = rs.getString(3);
            String hostelName = rs.getString(4);
            studentDetails.add(new String[]{firstName, lastName, roomID, hostelName});
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return studentDetails;
}



public static int countVisitorsForStudent(int studentID) {
    int visitorCount = 0;
    try {
        Connection con = ConnectionProvider.getCon();
        CallableStatement cstmt = con.prepareCall("{? = call CountVisitorsForStudent(?)}");
        cstmt.registerOutParameter(1, Types.INTEGER);
        cstmt.setInt(2, studentID);
        cstmt.execute();
        visitorCount = cstmt.getInt(1);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
    }
    return visitorCount;
}



public static String findHostelsWithFewerRooms(int threshold) {
    String result = "";
    try {
        Connection con = ConnectionProvider.getCon();
        CallableStatement cstmt = con.prepareCall("{? = call FindHostelsWithFewerRooms(?)}");
        cstmt.registerOutParameter(1, Types.VARCHAR);
        cstmt.setInt(2, threshold);
        cstmt.execute();
        result = cstmt.getString(1);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
    }
    return result;
}


public static String displayRoomDetailsInOrderOfAvailability() {
    String result = "";
    try {
        Connection con = ConnectionProvider.getCon();
        CallableStatement cstmt = con.prepareCall("{CALL DisplayRoomDetailsInOrderOfAvailability()}");
        ResultSet rs = cstmt.executeQuery();
        
        // Process the result and build the output
        StringBuilder output = new StringBuilder();
        while (rs.next()) {
            int roomID = rs.getInt("Room_ID");
            // You can include other room details as needed
            output.append("Room ID: ").append(roomID).append("\n");
        }
        result = output.toString();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
    }
    return result;
}



public static void updateHostelRooms(int hostelID, int newRoomCount) {
    try {
        Connection con = ConnectionProvider.getCon();
        CallableStatement cstmt = con.prepareCall("{CALL UpdateHostelRooms(?, ?)}");
        cstmt.setInt(1, hostelID);
        cstmt.setInt(2, newRoomCount);
        cstmt.executeUpdate();
        JOptionPane.showMessageDialog(null, "Hostel room count updated successfully!");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
    }
}





    
 
}

