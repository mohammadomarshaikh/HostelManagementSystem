/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class RoomDao {
    public static void save(Room room) {
        String query = "INSERT INTO Room (Room_ID, Hostel_ID) VALUES (?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);
            
            // Set the values in the PreparedStatement
            ps.setString(1, room.getRoom_ID());
            ps.setString(2, room.getHostel_ID());
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Room details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }
}
