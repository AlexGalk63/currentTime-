import basket.DateHalper;
import model.Room;
import model.Squad;
import model.WarriorService;
import servise.CityService;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        DateHalper d = new DateHalper();
        d.getFormattedStartDate();
        d.skipTime();
        System.out.println();






    }
}








//        public static CityService roomService = new CityService();
//        public static CityService cityService = new CityService();
//        public Random random = new Random();


//        int hours = 0;
//        Room[][][] rooms = cityService.generateCity();
//        for (int i = 0; i < 300; i++) {
//            hours = checkTime(hours);
//            System.out.println("Текущее время " + hours);
//            for (int j = 0; j < rooms.length; j++) {
//                for (int k = 0; k < rooms[j].length; k++) {
//                    for (int l = 0; l < rooms[j][k].length; l++) {
//                        Room room = rooms[j][k][l];
//                        cityService.releaseEvent(room, hours);
//
//                    }
//
//                }
//            }
//
//        }
//    }
//
//
//
//
//
//    private static int checkTime(int hours) {
//        int currentHours = hours + 1;
//        if (hours > 23) {
//            return 0;
//        }
//        return currentHours;
//
//
//    }
//}

//    реализация мороженного
//        TerminalService terminalService = new TerminalService();
//        terminalService.mainTerminal();

//    задача с городом(реализация)





