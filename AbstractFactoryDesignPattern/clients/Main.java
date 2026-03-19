package clients;

import afactory.GUIFactory;
import afactory.LinuxFactory;
import afactory.MacFactory;
import afactory.WindowsFactory;

public class Main {
  public static void main(String[] args) {

    GUIFactory factory;
    String osName = System.getProperty("os.name").toLowerCase();
    if ("mac".contains(osName)) {
      factory = new MacFactory();
    } else if ("linux".contains(osName)) {
      factory = new LinuxFactory();
    } else {
      factory = new WindowsFactory();
    }
    factory.createButton();
    factory.createCheckbox();
  }
}
