/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Furniture;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

public class FurnitureDao {
    public static void save(Furniture furniture) {
        String query = "INSERT INTO Furniture (Furniture_ID, Furniture_type, Hostel_ID, Room_ID) VALUES (?, ?, ?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);
            
            // Set the values in the PreparedStatement
            ps.setString(1, furniture.getFurniture_ID());
            ps.setString(2, furniture.getFurniture_type());
            ps.setString(3, furniture.getHostel_ID());
            ps.setString(4, furniture.getRoom_ID());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Furniture details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    
    public static ArrayList<Furniture> getAllRecords() {
        ArrayList<Furniture> arrayList = new ArrayList<>();
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Furniture");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Furniture furniture = new Furniture();
                furniture.setFurniture_ID(rs.getString("Furniture_ID"));
                furniture.setFurniture_type(rs.getString("Furniture_type"));
                furniture.setHostel_ID(rs.getString("Hostel_ID"));
                furniture.setRoom_ID(rs.getString("Room_ID"));
                arrayList.add(furniture);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
        return arrayList;
    }
}
