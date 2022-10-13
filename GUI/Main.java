import java.util.HashMap;
public class Main {
    
    public static void main(String args[]) {
        GUI s = new GUI();
        s.setVisible(true);
        IDandPasswords idandPasswords = new IDandPasswords();
        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
        
    }
}
