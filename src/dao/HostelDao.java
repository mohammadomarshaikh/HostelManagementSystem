/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Hostel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class HostelDao {
    public static void save(Hostel hostel) {
        String query = "INSERT INTO Hostel (Hostel_ID, Hostel_name, No_of_rooms, No_of_students) VALUES (?, ?, ?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);
            
            // Set the values in the PreparedStatement
            ps.setString(1, hostel.getHostel_ID());
            ps.setString(2, hostel.getHostel_name());
            ps.setString(3, hostel.getNo_of_rooms());
            ps.setString(4, hostel.getNo_of_students());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hostel details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ArrayList<Hostel> getAllRecords() {
        ArrayList<Hostel> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT * FROM Hostel");
            while (rs.next()) {
                Hostel hostel = new Hostel();
                hostel.setHostel_ID(rs.getString("Hostel_ID"));
                hostel.setHostel_name(rs.getString("Hostel_name"));
                hostel.setNo_of_rooms(rs.getString("No_of_rooms"));
                hostel.setNo_of_students(rs.getString("No_of_students"));
                arrayList.add(hostel);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    
    public static void update(Hostel hostel) {
        String query = "UPDATE Hostel SET Hostel_name=?, No_of_rooms=?, No_of_students=? WHERE Hostel_ID=?";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);

            // Set the updated values in the PreparedStatement
            ps.setString(1, hostel.getHostel_name());
            ps.setString(2, hostel.getNo_of_rooms());
            ps.setString(3, hostel.getNo_of_students());
            ps.setString(4, hostel.getHostel_ID());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Hostel details updated successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static void delete(String hostelID) {
        String query = "DELETE FROM Hostel WHERE Hostel_ID = '" + hostelID + "'";
        DbOperations.setDataOrDelete(query, "Hostel Deleted Successfully");
    }
    
    public static ArrayList<String[]> getHostelsWithMoreThan50Rooms() {
        ArrayList<String[]> resultList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT Hostel_name, COUNT(*) FROM Hostel WHERE No_of_rooms > 50 GROUP BY Hostel_name");
            while (rs.next()) {
                String hostelName = rs.getString(1);
                String roomCount = rs.getString(2);
                resultList.add(new String[]{hostelName, roomCount});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return resultList;
    }
}


