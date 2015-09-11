package warmup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class LibraryFine {

    public static int hackosPerDay = 15;
    public static int hackosPerMonth = 500;
    public static int hackosYear = 10000;


    public static int calculateLibraryFine(String sActual, String sExpected) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd MM yyyy");
        Date dActual = null;
        Date dExpected = null;

        Calendar actual = Calendar.getInstance();
        Calendar expected = Calendar.getInstance();

        try {
            dActual = sdf.parse(sActual);
            dExpected = sdf.parse(sExpected);

            actual.setTime(dActual);
            expected.setTime(dExpected);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        if (actual.compareTo(expected) <= 0) {
            return 0;
        } else if (actual.get(Calendar.YEAR) != expected.get(Calendar.YEAR)) {
            return hackosYear;
        } else if (actual.get(Calendar.MONTH) != expected.get(Calendar.MONTH)) {
            return hackosPerMonth * (actual.get(Calendar.MONTH) - expected.get(Calendar.MONTH));
        } else {
            return hackosPerDay * (actual.get(Calendar.DAY_OF_MONTH) - expected.get(Calendar.DAY_OF_MONTH));
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sActual = in.nextLine();
        String sExpected = in.nextLine();

        System.out.println(calculateLibraryFine(sActual, sExpected));
    }
}
