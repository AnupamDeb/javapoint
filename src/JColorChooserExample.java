import java.awt.event.*;  
import java.awt.*;  
import javax.swing.*;  
  
public class JColorChooserExample extends JFrame implements ActionListener{  
JButton b;  
Container c;  
  
JColorChooserExample(){  
    c=getContentPane();  
    c.setLayout(new FlowLayout());  
      
    b=new JButton("color");  
    b.addActionListener(this);  
      
    c.add(b);  
    
    setSize(400,400);  
    setVisible(true);  
    setDefaultCloseOperation(EXIT_ON_CLOSE);  
}  
  
public void actionPerformed(ActionEvent e) {  
Color initialColor=Color.blue;
Color color=JColorChooser.showDialog(this, "Select a color", initialColor);
c.setBackground(color);
}  
  
public static void main(String[] args) {  
    new JColorChooserExample();  
    
}  
}  