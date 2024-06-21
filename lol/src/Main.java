// import awkward.hero.Darius;
// import awkward.hero.Diana;
// import awkward.hero.Irelia;

// import abstraction.ISkill;
// import abstraction.hero.Darius;
// import abstraction.hero.Diana;
// import abstraction.hero.Irelia;

import java.util.Scanner;
import factory.HeroFactory;
import factory.ISkill;

public class Main {
  // * v1
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

  // * v2
  // public static void main(String[] args) throws Exception {
  //   System.out.println("Enter a Hero's Name:");
  //   String name = Main.getPlayerInput();
  //   ISkill iSkill;
  //
  //   switch (name) {
  //     case "Diana" -> {
  //       iSkill = new Diana();
  //     }
  //     case "Irelia" -> {
  //       iSkill = new Irelia();
  //     }
  //     case "Darius" -> {
  //       iSkill = new Darius();
  //     }
  //     default -> {
  //       throw new Exception("Hero not found");
  //     }
  //   }
  //
  //   iSkill.r();
  //   // * 1. 单纯的 interface 可以统一方法的调用，但是它不能统一对象的实例化
  //   // * 2. 面向对象只做两件事：实例化对象  调用方法 (完成业务逻辑)
  //   // * 3. 只有一段代码中没有 new 的出现，才能保持代码的相对稳定，才能逐步实现 OCP
  //   // * 4. 上面这段话只是表象，实质是一段代码如果要保持稳定，就不应该出现对象的实例化。真正的原因是：new 的出现，会导致代码的耦合度增加
  //   // * 5. 对象实例化是不可消除的
  //   // * 6. 把对象实例化的过程，转移到其他的代码片段中。放到了一个工厂类中，这样就可以消除代码中的 new
  //   // * 7. 代码中总是会存在不稳定，隔离这些不稳定，保证其他代码是稳定的
  // }

  // * v3
  public static void main(String[] args) throws Exception {
    System.out.println("Enter a Hero's Name:");
    String name = Main.getPlayerInput();
    ISkill iSkill = HeroFactory.getHero(name);

    iSkill.r();
    // 抽象工厂
    // IHeroFactory heroFactory = new HeroFactory();
  }

  private static String getPlayerInput() {
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }
}
