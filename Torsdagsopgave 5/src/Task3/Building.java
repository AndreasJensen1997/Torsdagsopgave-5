package Task3;

import java.util.ArrayList;

public class Building {

    private ArrayList<Room> rooms = new ArrayList<>();
    private int numberOfFloors;


    public Building(int numberOfFloors) {
//       this.rooms = rooms;
        this.numberOfFloors = numberOfFloors;
    }

    public int countLampsInBuilding() {
        int totalLamps = 0;

        for (Room room : getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;

    }

    public int countWindowsInBuilding() {
        int totalWindows = 0;

        for (Room room : getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;

    }

    public void addRoom(Room room) {
        rooms.add(room);
    }

    public int countRooms(){
        return getRooms().size();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
}