/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Visitor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class VisitorDao {
    public static void save(Visitor visitor) {
        String query = "INSERT INTO Visitor (Visitor_ID, In_time, Out_time, Date, Visitor_name, Student_ID) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);
            
            // Set the values in the PreparedStatement
            ps.setString(1, visitor.getVisitor_ID());
            ps.setString(2, visitor.getIn_time());
            ps.setString(3, visitor.getOut_time());
            ps.setString(4, visitor.getDate());
            ps.setString(5, visitor.getVisitor_name());
            ps.setString(6, visitor.getStudent_ID());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Visitor details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ArrayList<Visitor> getAllRecords() {
        ArrayList<Visitor> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Visitor");
            while (rs.next()) {
                Visitor visitor = new Visitor();
                visitor.setVisitor_ID(rs.getString("Visitor_ID"));
                visitor.setIn_time(rs.getString("In_time"));
                visitor.setOut_time(rs.getString("Out_time"));
                visitor.setDate(rs.getString("Date"));
                visitor.setVisitor_name(rs.getString("Visitor_name"));
                visitor.setStudent_ID(rs.getString("Student_ID"));
                arrayList.add(visitor);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void update(Visitor visitor) {
        String query = "UPDATE Visitor SET In_time=?, Out_time=?, Date=?, Visitor_name=?, Student_ID=? WHERE Visitor_ID=?";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);

            // Set the updated values in the PreparedStatement
            ps.setString(1, visitor.getIn_time());
            ps.setString(2, visitor.getOut_time());
            ps.setString(3, visitor.getDate());
            ps.setString(4, visitor.getVisitor_name());
            ps.setString(5, visitor.getStudent_ID());
            ps.setString(6, visitor.getVisitor_ID());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Visitor details updated successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void delete(String visitorID) {
        String query = "DELETE FROM Visitor WHERE Visitor_ID = '" + visitorID + "'";
        DbOperations.setDataOrDelete(query, "Visitor Deleted Successfully");
    }
}


