/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.RoomAllocation;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author test
 */
public class RoomAllocaionDao {
    
    public static void save(RoomAllocation allocation) {
        String query = "INSERT INTO room_allocation (Room_ID, Admin_ID, Allocation_Date) VALUES (?, ?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);
            
            // Set the values in the PreparedStatement
            ps.setString(1, allocation.getRoom_ID());
            ps.setString(2, allocation.getAdmin_ID());
            ps.setDate(3, Date.valueOf(allocation.getAllocation_Date()));
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Room allocation details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public static ArrayList<RoomAllocation> getAllRecord() {
        ArrayList<RoomAllocation> arrayList = new ArrayList<>();
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM room_allocation");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RoomAllocation allocation = new RoomAllocation();
                allocation.setAllocation_ID(rs.getString("Allocation_ID"));
                allocation.setRoom_ID(rs.getString("Room_ID"));
                allocation.setAdmin_ID(rs.getString("Admin_ID"));
                allocation.setAllocation_Date(rs.getString("Allocation_Date"));
                arrayList.add(allocation);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
        return arrayList;
    }
    
}
