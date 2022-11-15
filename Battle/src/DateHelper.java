import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateHalper {
    SimpleDateFormat startDateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm");
    SimpleDateFormat battleTime = new SimpleDateFormat("mmmm");
    Date date = new Date();
    Date startDate;
    Calendar calendar;

    public DateHalper(Date startDate, Calendar calendar) {
        calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -1500);
        startDate = calendar.getTime();
        calendar.setTime(startDate);

    }
    public String getFormattedStartDate() {
        return startDateFormat.format(calendar.getTime());
    }
    public void skipTime() {
        calendar.add(Calendar.MILLISECOND, 2700000);
    }


    public String getFormattedDiff(){
        Date date1 = startDate;
        Date date2 = calendar.getTime();

        return battleTime.format((date2 -date1);


    }
    public String currentDate(){
        for () {

        }
    }

}
