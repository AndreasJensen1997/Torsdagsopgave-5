package Task3;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(20, 40);
        Room room2 = new Room(30, 50);
        Room room3 = new Room(40, 60);

//        ArrayList<Room> rooms = new ArrayList<>();
//        rooms.add(room1);
//        rooms.add(room2);
//        rooms.add(room3);

        Building building1 = new Building( 4);

        building1.addRoom(room1);
        building1.addRoom(room2);
        building1.addRoom(room3);

        int totalLamps = building1.countLampsInBuilding();
        int totalWindows = building1.countWindowsInBuilding();

        System.out.println("The building has " + building1.countRooms() +  " rooms: ");
        System.out.println("The building has " + building1.countLampsInBuilding() +  " lamps: ");
        System.out.println("The building has " + building1.countWindowsInBuilding() +  " windows: ");
        System.out.println("The building has more floors than rooms: " + isNormal(building1));
    }

    public static boolean isNormal(Building building) {
        return (building.getNumberOfFloors() <= building.getRooms().size());
    }

}
