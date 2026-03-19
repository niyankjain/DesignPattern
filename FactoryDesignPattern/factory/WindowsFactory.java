package factory;

import buttons.Button;
import buttons.WindowButton;

public class WindowsFactory implements GUIFactory {

  public WindowsFactory() {
  }

  @Override
  public void createButton() {
    Button button = new WindowButton();
    button.onClick();
  }
}
