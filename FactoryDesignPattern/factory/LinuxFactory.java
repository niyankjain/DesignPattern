package factory;

import button.Button;
import button.LinuxButton;

public class LinuxFactory implements GUIFactory {

  public LinuxFactory() {
  }

  @Override
  public void createButton() {
    Button button = new LinuxButton();
    button.onClick();
  }
}
