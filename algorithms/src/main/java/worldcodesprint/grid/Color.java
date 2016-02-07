package worldcodesprint.grid;

import java.util.HashMap;
import java.util.Map;

public enum Color {
  GOOD {
    @Override
    public String toString() {
      return "G";
    }
  },
  BAD {
    @Override
    public String toString() {
      return "B";
    }
  },
  NONE;

  public final static Map<Character, Color> COLORMAP = new HashMap<>();
  static {
    COLORMAP.put('G', Color.GOOD);
    COLORMAP.put('B', Color.BAD);
  }
}
