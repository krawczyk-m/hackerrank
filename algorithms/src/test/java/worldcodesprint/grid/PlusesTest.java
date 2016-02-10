package worldcodesprint.grid;

import org.junit.Test;
import worldcodesprint.Supercomputer;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PlusesTest {

  @Test
  public void intersectTest() {
    Plus bigger = new Plus(2, 2, 2);

    Plus smaller1 = new Plus(5, 1, 1);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller1));

    Plus smaller2 = new Plus(0, 4, 1);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller2));

    Plus smaller3 = new Plus(0, 4, 2);
    assertTrue(Supercomputer.doPlusesIntersect(bigger, smaller3));
  }

  @Test
  public void anotherTest() {
    Plus bigger = new Plus(5, 5, 4);

    Plus smaller1 = new Plus(3, 3, 1);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller1));

    Plus smaller2 = new Plus(3, 3, 2);
    assertTrue(Supercomputer.doPlusesIntersect(bigger, smaller2));

    Plus smaller3 = new Plus(3, 7, 1);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller3));

    Plus smaller4 = new Plus(7, 7, 1);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller4));

    Plus smaller5 = new Plus(7, 3, 1);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller5));

    Plus smaller6 = new Plus(1, 1, 3);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller6));

    Plus smaller7 = new Plus(1, 1, 4);
    assertTrue(Supercomputer.doPlusesIntersect(bigger, smaller7));

    Plus smaller8 = new Plus(0, 0, 10);
    assertFalse(Supercomputer.doPlusesIntersect(bigger, smaller8));

    Plus another = new Plus(5, 10, 1);
    assertTrue(Supercomputer.doPlusesIntersect(bigger, another));
  }
}
