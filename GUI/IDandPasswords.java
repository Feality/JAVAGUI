import java.util.HashMap;

public class IDandPasswords {

    HashMap<String,String> logininfo = new HashMap<String,String>();
    
    IDandPasswords(){
        
        logininfo.put("Adrian","AUTO");
        logininfo.put("Patryk","A1B2");
        
    }
    
    public HashMap getLoginInfo(){
        return logininfo;
    }
}
