package warmup;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryFineTest {

  @Test
  public void testZero() {
    String expected = "10 10 2015";

    String actual = "1 10 2015";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "10 10 2015";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "10 9 2015";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "10 10 201";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));
  }

  @Test
  public void testSameDay() {
    String expected = "15 07 2015";

    String actual = "15 07 2015";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "15 06 2015";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "15 08 2015";
    assertEquals(LibraryFine.calculateLibraryFine(actual, expected), LibraryFine.calculateLibraryFine(actual, expected));

    actual = "15 07 2014";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "15 07 2016";
    assertEquals(LibraryFine.hackosYear, LibraryFine.calculateLibraryFine(actual, expected));
  }

  @Test
  public void testSameMonth() {
    String expected = "1 10 2015";

    String actual = "31 10 2015";
    assertEquals(30 * LibraryFine.hackosPerDay, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "31 10 2014";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "31 10 2016";
    assertEquals(LibraryFine.hackosYear, LibraryFine.calculateLibraryFine(actual, expected));
  }

  @Test
  public void testSameYear() {
    String expected = "15 6 2015";

    String actual = "22 12 2015";
    assertEquals(6 * LibraryFine.hackosPerMonth, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "22 4 2015";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "22 6 2015";
    assertEquals(7 * LibraryFine.hackosPerDay, LibraryFine.calculateLibraryFine(actual, expected));
  }

  @Test
  public void testDifferentYear() {
    String expected = "1 2 2015";

    String actual = "22 11 2016";
    assertEquals(LibraryFine.hackosYear, LibraryFine.calculateLibraryFine(actual, expected));

    actual = "31 12 2014";
    assertEquals(0, LibraryFine.calculateLibraryFine(actual, expected));
  }
}
