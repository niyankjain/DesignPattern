package afactory;

import buttons.Button;
import buttons.MacButton;
import checkbox.Checkbox;
import checkbox.MacCheckbox;

public class MacFactory implements GUIFactory{

  private Button button;
  private Checkbox checkbox;

  public MacFactory() {
  }

  @Override
  public void createButton() {
    button = new MacButton();
    button.onClick();
  }

  @Override
  public void createCheckbox() {
    checkbox = new MacCheckbox();
    checkbox.onCheck();
  }
}
