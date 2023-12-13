/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * author test
 */


public class AdminDao {
    public static void save(Admin admin) {
        String query = "INSERT INTO Administrator (Admin_ID, Fname, Lname, Mob_no, Hostel_ID) VALUES (?, ?, ?, ?, ?)";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);

            // Set the values in the PreparedStatement
            ps.setString(1, admin.getAdmin_ID());
            ps.setString(2, admin.getFname());
            ps.setString(3, admin.getLname());
            ps.setString(4, admin.getMob_no());
            ps.setString(5, admin.getHostel_ID());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Admin details inserted successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void update(Admin admin) {
        String query = "UPDATE Administrator SET Fname=?, Lname=?, Mob_no=?, Hostel_ID=? WHERE Admin_ID=?";
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement(query);

            // Set the updated values in the PreparedStatement
            ps.setString(1, admin.getFname());
            ps.setString(2, admin.getLname());
            ps.setString(3, admin.getMob_no());
            ps.setString(4, admin.getHostel_ID());
            ps.setString(5, admin.getAdmin_ID());

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Admin details updated successfully!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void delete(String adminID) {
        String query = "DELETE FROM Administrator WHERE Admin_ID = '" + adminID + "'";
        DbOperations.setDataOrDelete(query, "Admin Deleted Successfully");
    }

public static ArrayList<Admin> getAllRecords() {
    ArrayList<Admin> arrayList = new ArrayList<>();
    try {
        ResultSet rs = DbOperations.getData("SELECT * FROM Administrator");
        while (rs.next()) {
            Admin admin = new Admin();
            admin.setAdmin_ID(rs.getString("Admin_ID"));
            admin.setFname(rs.getString("Fname"));
            admin.setLname(rs.getString("Lname"));
            admin.setMob_no(rs.getString("Mob_no"));
            admin.setHostel_ID(rs.getString("Hostel_ID"));
            arrayList.add(admin);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }
    return arrayList;
}


    public static ArrayList<String[]> getAdminNamesAndMobileNumbers() {
        ArrayList<String[]> resultList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("SELECT CONCAT(Fname, ' ', Lname), Mob_no FROM Administrator ORDER BY Mob_no DESC");
            while (rs.next()) {
                String adminName = rs.getString(1);
                String mobileNumber = rs.getString(2);
                resultList.add(new String[]{adminName, mobileNumber});
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return resultList;
    }

    public static boolean login(String adminID, String mobNo) {
        boolean loginSuccessful = false;
        try {
            Connection con = ConnectionProvider.getCon();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM Administrator WHERE Admin_ID = ? AND Mob_no = ?");
            ps.setString(1, adminID);
            ps.setString(2, mobNo);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                loginSuccessful = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return loginSuccessful;
    }
}


