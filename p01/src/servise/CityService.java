package servise;

import model.Person;
import model.Room;

import java.util.Random;


public class CityService {
    private RoomService roomService = new RoomService();
    private Random random = new Random();

    public Room[][][] generateCity() {

        Room[][][] rooms = new Room[10][20][30];
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                for (int k = 0; k < rooms[i][j].length; k++) {
                    rooms[i][j][k] = roomService.generateRoom();

                }
            }
        }
        return rooms;
    }

    public void releaseEvent(Room room, int hours) {
        int delivery = random.nextInt(100);
        int goOut = random.nextInt(100);
        if (goOut< 60 && hours == 8) {
            goOut(room);
        }
        if (hours == 18){
            goin(room);
        }
        if (delivery < 3 && (hours > 9 && hours < 19)) {
            delivery(room);
        }

    }

    public void delivery(Room room) {
        if (room.getPersons().length > 0) {
            for (int i = 0; i < room.getPersons().length; i++) {
                if (room.getPersons()[i].isAtHome()) {
                    if (room.getPersons()[i].getAge() > 14) {
                        System.out.println("Посылка доставлена " + room.getPersons()[i].getName());
                        return;
                    }

                }
            }
        }
    }

    public void goOut(Room room) {
        if (room.getPersons().length > 0) {
            for (int i = 0; i < room.getPersons().length; i++) {
                if (room.getPersons()[i].isAtHome()) {
                    if (room.getPersons()[i].getAge() > 25) {
                        Person person = room.getPersons()[i];
                        person.setAtHome(false);
                        System.out.println(person.getName() + " ушёл на работу.");
                        return;
                    }
                }
            }

        }
    }

    public void goin(Room room) {
        if (room.getPersons().length > 0) {
            for (int i = 0; i < room.getPersons().length; i++) {
                if (!room.getPersons()[i].isAtHome()) {
                    if (room.getPersons()[i].getAge() > 25) {
                        Person person = room.getPersons()[i];
                        person.setAtHome(true);
                        System.out.println(person.getName() + " Пришёл с работы.");
                        return;
                    }
                }
            }
        }
    }
}


