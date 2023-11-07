package factory;

import factory.hero.Darius;
import factory.hero.Diana;
import factory.hero.Irelia;

public class HeroFactory {
  public static ISkill getHero(String name) throws Exception {
    ISkill iSkill;

    switch (name) {
      case "Diana" -> iSkill = new Diana();
      case "Irelia" -> iSkill = new Irelia();
      case "Darius" -> iSkill = new Darius();
      default -> throw new Exception("Hero not found");
    }

    return iSkill;
  }
}
