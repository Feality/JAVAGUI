import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Objects;
import javax.swing.JLabel;
import java.util.HashMap;

public class GUI extends JFrame implements ActionListener {
    
   
    
    private JLabel welcome;
    private JButton click;
    
    HashMap<String,String> logininfo = new HashMap<String,String>();
    public GUI() {

        
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        click = new JButton("Log in to your bank account");
        click.setBounds(150, 270, 200, 50);
        click.addActionListener(this);
        add(click);
        
        welcome = new JLabel("Welcome to KBC please login!");
        welcome.setBounds(165, 150, 200, 100);
        add(welcome);


        setVisible(true);
    }
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
    }
    public void actionPerformed(ActionEvent e){
        
        if (e.getSource() == click){
            
            LoginPage myWindow = new LoginPage(HashMap<String,String> loginInfoOriginal);
            
        }
    }
}


    



