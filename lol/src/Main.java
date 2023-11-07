import abstraction.ISkill;
// import awkward.hero.Darius;
// import awkward.hero.Diana;
// import awkward.hero.Irelia;
import abstraction.hero.Darius;
import abstraction.hero.Diana;
import abstraction.hero.Irelia;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  // public static void main(String[] args) {
  //   System.out.println("Enter a Hero's Name:");
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

  public static void main(String[] args) throws Exception {
    System.out.println("Enter a Hero's Name:");
    String name = Main.getPlayerInput();
    ISkill iSkill;

    switch (name) {
      case "Diana" -> {
        iSkill = new Diana();
      }
      case "Irelia" -> {
        iSkill = new Irelia();
      }
      case "Darius" -> {
        iSkill = new Darius();
      }
      default -> {
        throw new Exception("Hero not found");
      }
    }

    iSkill.r();
  }

  private static String getPlayerInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}