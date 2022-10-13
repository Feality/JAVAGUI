
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;
    


public class LoginPage extends JFrame implements ActionListener{

private JLabel enterName;
private JLabel enterPin;
private JLabel messageLabel = new JLabel();

private JTextField name;
private JTextField pin;

private JButton click;
private JButton resetButton = new JButton("reset");

private String storeName = " ";
private String storePin = " ";

HashMap<String,String> logininfo = new HashMap<String,String>();

LoginPage(HashMap<String,String> loginInfoOriginal){
        
        logininfo = loginInfoOriginal;
        
    
    
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(420,420);
        setLayout(null);
        setVisible(true);
        
        enterName = new JLabel("Enter Your Name");
        enterPin = new JLabel("Enter Your Pin");
        
        
        
        name = new JTextField();
        pin = new JTextField();
        enterName.setBounds(60, 30, 120, 30);
        name.setBounds(80, 60, 130, 30);
        enterPin.setBounds(60,90,120, 30);
        pin.setBounds(80,120,130,30);
       
        click = new JButton("Log in");
        click.setBounds(100, 190,100, 30);
        click.addActionListener(this);

        add(click);
        add(name);
        add(enterName);
        add(enterPin);
        add(pin);
        
        
}
public void actionPerformed(ActionEvent e){
    if (e.getSource() == click) {
     storeName = name.getText();
     JOptionPane.showMessageDialog(null, "Hello" + " " + storeName);
     System.exit(0);
}
}
}
