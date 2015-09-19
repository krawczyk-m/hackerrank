package implementation;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AngryProfessorTest {

  @Test
  public void angryProfessorTest() {
    int[] one = {-1};
    int K = 1;

    assertEquals(false, AngryProfessor.isLectureCancelled(one, K));

    one[0] = 1;
    assertEquals(true, AngryProfessor.isLectureCancelled(one, K));

    int[] multiple = {-1, 0, 3, 3};
    assertEquals(false, AngryProfessor.isLectureCancelled(multiple, K));

    K = 2;
    assertEquals(false, AngryProfessor.isLectureCancelled(multiple, K));

    K = 3;
    assertEquals(true, AngryProfessor.isLectureCancelled(multiple, K));
  }
}
