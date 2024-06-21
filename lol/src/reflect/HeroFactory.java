package reflect;

public class HeroFactory {
  public static ISkill getHero(String name) throws Exception {
    // 反射
    // 元类
    // 类 是对象的抽象，元类是对类的描述
    // 要输入完整的路径：reflect.hero.Diana
    Class <?> cla = Class.forName(name);
    Object obj = cla.getDeclaredConstructor().newInstance();

    return (ISkill)obj;
  }
}
