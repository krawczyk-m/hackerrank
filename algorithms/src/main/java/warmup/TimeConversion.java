package warmup;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TimeConversion {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String date = in.next();

    SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ssaa");

    SimpleDateFormat sdf24 = new SimpleDateFormat("HH:mm:ss");

    try {
      System.out.println(sdf24.format(sdf.parse(date)));
    } catch (ParseException e) {
      e.printStackTrace();
    }
  }
}
