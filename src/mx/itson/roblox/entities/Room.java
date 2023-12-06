/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.roblox.entities;

/**
 *
 * @author laura
 */
public class Room {
    
    private int id;
    private String roomType;
    private int capacity;
    private boolean threeD;
    private boolean disponobility;
    

    public boolean isDisponobility() {
        return disponobility;
    }

    public void setDisponobility(boolean disponobility) {
        this.disponobility = disponobility;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public boolean isThreeD() {
        return threeD;
    }

    public void setThreeD(boolean threeD) {
        this.threeD = threeD;
    }
    
}
