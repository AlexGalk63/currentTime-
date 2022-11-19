import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        DateHelper helper = new DateHelper();
        System.out.printf("Start: %s%n", helper.getFormattedStartDate());
        helper.skipTime();
        System.out.printf("Current date: %s%n", helper.getFormattedCurrentDate());
        System.out.printf("Diff: %s%n", helper.getFormattedDiff());
        System.in.read();
    }
}