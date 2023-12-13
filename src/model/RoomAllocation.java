/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author test
 */
public class RoomAllocation {
    private String Allocation_ID;
    private String Room_ID;
    private String Admin_ID;
    private String Allocation_Date;

    public String getAllocation_ID() {
        return Allocation_ID;
    }

    public void setAllocation_ID(String Allocation_ID) {
        this.Allocation_ID = Allocation_ID;
    }


    public String getRoom_ID() {
        return Room_ID;
    }

    public void setRoom_ID(String Room_ID) {
        this.Room_ID = Room_ID;
    }

    public String getAdmin_ID() {
        return Admin_ID;
    }

    public void setAdmin_ID(String Admin_ID) {
        this.Admin_ID = Admin_ID;
    }

    public String getAllocation_Date() {
        return Allocation_Date;
    }

    public void setAllocation_Date(String Allocation_Date) {
        this.Allocation_Date = Allocation_Date;
    }
    
    
}
