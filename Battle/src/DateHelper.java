import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class DateHelper {
    SimpleDateFormat currentDateFormat;
    Date startDate;
    Calendar calendar;

    public DateHelper() {
        currentDateFormat = new SimpleDateFormat("yyyy-MM-dd kk:mm");
        calendar = Calendar.getInstance();
        calendar.add(Calendar.YEAR, -1500);
        startDate = new Date(calendar.getTimeInMillis());
    }

    public String getFormattedStartDate() {
        return currentDateFormat.format(startDate.getTime());
    }

    public void skipTime() {
        calendar.add(Calendar.MILLISECOND, 900000);
    }

    public String getFormattedDiff() {
        long diff = calendar.getTimeInMillis() - startDate.getTime();
        return Long.toString(TimeUnit.MILLISECONDS.toMinutes(diff));
    }

    public String getFormattedCurrentDate() {
        return currentDateFormat.format(calendar.getTimeInMillis());
    }
}
