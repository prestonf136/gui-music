//finally got a blank screen setup

/*
todo:
-play,pause,stop buttons
-API
-graphics
-animations
-bug testing
-polishing
*/

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.Dimension;

public class Main {
  public static void main(String[] args) {
    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int[] screen = {
      (int) screenSize.getWidth(),
      (int) screenSize.getHeight()
    };

    JFrame f = new JFrame();

    //JButton button =new JButton("Submit");
	//button.setBounds(100,100,140, 40);

    JLabel label = new JLabel();
	label.setText("welcome to gui-music a music app for the dev by the dev");
	label.setBounds(100,100,140,20);
    label.setHorizontalTextPosition(JLabel.CENTER);

    //f.add(button);
    f.add(label);

    f.setSize(screen[0],screen[1]);
    f.setLayout(null);
    f.setVisible(true);
  }
}