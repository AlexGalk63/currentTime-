package basket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class DateHalper {
    SimpleDateFormat startDateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm");
    SimpleDateFormat battleTime = new SimpleDateFormat("mmmm");
    Date date = new Date();
    Date startDate;
    Calendar calendar;

    public DateHalper() {
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
        calendar.add(Calendar.MINUTE, 45);
    }


    public String getFormattedDiff() throws ParseException {
        Date date1 = startDateFormat.parse(getFormattedStartDate());
        Date date2 = calendar.getTime();

        return battleTime.format((date2 -date1);


    }

}













//        calendar.setTime(date);
//        calendar.add(Calendar.YEAR, -1500);
//        System.out.println(df.format(calendar.getTime()));







