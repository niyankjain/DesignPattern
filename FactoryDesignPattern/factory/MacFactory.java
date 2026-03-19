package factory;

import buttons.Button;
import buttons.MacButton;

public class MacFactory implements GUIFactory {

  public MacFactory() {
  }

  @Override
  public void createButton() {
    Button button = new MacButton();
    button.onClick();
  }
}
