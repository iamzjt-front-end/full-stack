package abstraction.hero;

import abstraction.ISkill;

public class Darius implements ISkill {
  public void q() {
    System.out.println("Darius Q");
  }

  public void w() {
    System.out.println("Darius W");
  }

  public void e() {
    System.out.println("Darius E");
  }

  public void r() {
    System.out.println("Darius R");
  }
}
