package afactory;

import buttons.Button;
import buttons.WindowButton;
import checkbox.Checkbox;
import checkbox.WindowCheckbox;

public class WindowsFactory implements GUIFactory{

  private Button button;
  private Checkbox checkbox;

  public WindowsFactory() {
  }

  @Override
  public void createButton() {
    button = new WindowButton();
    button.onClick();
  }

  @Override
  public void createCheckbox() {
    checkbox = new WindowCheckbox();
    checkbox.onCheck();
  }
}
