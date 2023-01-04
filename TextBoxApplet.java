import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.Applet;  

public class TextBoxApplet extends Applet {

  private TextField textField;
  private Button button;

  public void init() {
   
    textField = new TextField(20);
    button = new Button("Click me!");

   
    button.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        String text = textField.getText();
       
        String[] lines = text.split("\n");
        
        int fontSize = 20;
       
        int x = 20;
        int y = 20;
       
        for (String line : lines) {
          drawString(line, x, y, fontSize);
          y += fontSize;
          fontSize -= 2;
        }
      }
    });

   
    add(textField);
    add(button);
  }


  public void drawString(String str, int x, int y, int fontSize) {
    
    Graphics g = getGraphics();
   
    g.setFont(new Font("SansSerif", Font.PLAIN, fontSize));
   
    g.drawString(str, x, y);
  }
}