package worldcodesprint;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Powerplants {


  static List<Integer> getArrayList(int size) {
    Integer[] arr = new Integer[size];
    return Arrays.asList(arr).stream().map(r -> Integer.MAX_VALUE).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int cities = in.nextInt();

    List<Integer> distances = getArrayList(cities);

    int stations = in.nextInt();

    for (int i = 0; i < stations; ++i) {
      int station = in.nextInt();
      addStation(distances, station);
    }

    System.out.print(distances.stream().reduce(Integer::max).get());
  }

  private static void addStation(List<Integer> distances, int station) {
    distances.set(station, 0);

    int distance = 1;
    for (int i = station - 1; i >= 0; --i) {
      if (distances.get(i) <= distance) {
        break;
      } else {
        distances.set(i, distance);
        distance++;
      }
    }

    distance = 1;
    int size = distances.size();
    for (int i = station + 1; i < size; i++) {
      if (distances.get(i) <= distance) {
        break;
      } else {
        distances.set(i, distance);
        distance++;
      }
    }
  }
}
