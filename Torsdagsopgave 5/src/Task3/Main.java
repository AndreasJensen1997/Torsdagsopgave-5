package Task3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(20, 40);
        Room room2 = new Room(30, 50);
        Room room3 = new Room(40, 60);

        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);
        rooms.add(room3);

        Building building1 = new Building(rooms, 4);
        Building building2 = new Building(rooms, 2);

        int totalLamps = countLampsInBuilding(building2);
        int totalWindows = countWindowsInBuilding(building2);
        int totalRooms = countRoomsInBuilding(building2);

        System.out.println("The building has more floors than rooms: " + isNormal(building1));

    }
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;

        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        System.out.println("Total amount of lamps in the building: " + totalLamps);
        return totalLamps;

    }

    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;

        for (Room room : building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        System.out.println("Total amount of windows in the building: " + totalWindows);
        return totalWindows;

    }

    public static int countRoomsInBuilding(Building building) {
        int totalRooms = 0;

        for (Room room : building.getRooms()) {
            totalRooms++;
        }
        System.out.println("Total amount of rooms in building: " + totalRooms);

        return totalRooms;

    }

    public static boolean isNormal(Building building) {
        return (building.getNumberOfFloors() <= building.getRooms().size());
    }

}
