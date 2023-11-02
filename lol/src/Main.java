import abstraction.ISkill;
// import awkward.hero.Darius;
// import awkward.hero.Diana;
// import awkward.hero.Irelia;
import abstraction.hero.Darius;
import abstraction.hero.Diana;
import abstraction.hero.Irelia;

import java.util.Scanner;

public class Main {
  // public static void main(String[] args) {
  //   System.out.println("Enter a Hero's Name");
  //   String heroName = Main.getPlayerInput();
  //
  //   switch (heroName) {
  //     case "Diana" -> {
  //       Diana diana = new Diana();
  //       diana.r();
  //     }
  //     case "Irelia" -> {
  //       Irelia irelia = new Irelia();
  //       irelia.r();
  //     }
  //     case "Darius" -> {
  //       Darius darius = new Darius();
  //       darius.r();
  //     }
  //     default -> System.out.println("Hero not found");
  //   }
  // }

  public static void main(String[] args) {
    String name = Main.getPlayerInput();
    ISkill iSkill;

    switch (name) {
      case "Diana" -> {
        iSkill = new Diana();
        iSkill.r();
      }
      case "Irelia" -> {
        iSkill = new Irelia();
        iSkill.r();
      }
      case "Darius" -> {
        iSkill = new Darius();
        iSkill.r();
      }
      default -> System.out.println("Hero not found");
    }
  }

  private static String getPlayerInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}