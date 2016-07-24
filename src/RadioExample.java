import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;


public class RadioExample extends JFrame implements ActionListener {

	JRadioButton rb1,rb2;
	JButton b;
	public RadioExample()
	{
		rb1=new JRadioButton("male");
		rb1.setBounds(100,50,100,30);  
		rb2=new JRadioButton("female");
		rb2.setBounds(100,100,100,30);
		
		ButtonGroup bg=new ButtonGroup();  
		bg.add(rb1);bg.add(rb2); 
		
		b=new JButton("click");  
		b.setBounds(100,150,80,30);  
		
		
		b.addActionListener(this);  
		
		add(rb1);add(rb2);add(b);  
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);  
		setLayout(null);  
		setVisible(true); 
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(rb1.isSelected()){
			JOptionPane.showMessageDialog(this, "you r male ");
		}
		else if(rb2.isSelected()){
			JOptionPane.showMessageDialog(this, "you r female");
		}
		else {
			JOptionPane.showMessageDialog(this , "plz select any one ");
		}
		
	}
	public static void main(String[] args) {
		new RadioExample();
	}
}
