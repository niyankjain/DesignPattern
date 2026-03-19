package afactory;

import buttons.Button;
import buttons.LinuxButton;
import checkbox.Checkbox;
import checkbox.LinuxCheckbox;

public class LinuxFactory implements GUIFactory{

  private Button button;
  private Checkbox checkbox;
  public LinuxFactory() {
  }

  @Override
  public void createButton() {
    button = new LinuxButton();
    button.onClick();
  }

  @Override
  public void createCheckbox() {
    checkbox = new LinuxCheckbox();
    checkbox.onCheck();
  }
}
