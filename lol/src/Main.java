import awkward.hero.Darius;
import awkward.hero.Diana;
import awkward.hero.Irelia;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter a Hero's Name");
    String heroName = Main.getPlayerInput();

    switch (heroName) {
      case "Diana" -> {
        Diana diana = new Diana();
        diana.r();
      }
      case "Irelia" -> {
        Irelia irelia = new Irelia();
        irelia.r();
      }
      case "Darius" -> {
        Darius darius = new Darius();
        darius.r();
      }
      default -> System.out.println("Hero not found");
    }
  }

  private static String getPlayerInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}