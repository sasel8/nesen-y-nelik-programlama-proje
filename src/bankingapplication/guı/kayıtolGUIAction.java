
package bankingapplication.guı;
import  bankingapplication.DAO.mainDAO;
import  bankingapplication.DAO.müşteriDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class kayıtolGUIAction  implements ActionListener {
    

    private mainDAO maindao;
    private kayıtolGUI kayitol;
    private loginGUI logingui;
    private IslemlerGUI islem;

    public kayıtolGUIAction(kayıtolGUI kayitol) {
        this.kayitol = kayitol;
    }
    
   
    
    
    

    public kayıtolGUI getKayitol() {
        if(this.kayitol==null)
        {
            this.kayitol=new kayıtolGUI();
            this.kayitol.atm();
        }
        return kayitol;
    }

    public void setkayitol(kayıtolGUI kayitol) {
        this.kayitol = kayitol;
    }

    
    public mainDAO getMaindao() {
        if(this.maindao==null)
        {
            this.maindao=new müşteriDAO() {};
        }
        return maindao;
    }

    public void setmaindao(mainDAO maindao) {
        this.maindao = maindao;
    }

    public loginGUI getLogingui() {
        if(this.logingui==null)
        {
            this.logingui=new loginGUI();
            logingui.atm();
        }
        return logingui;
    }

    public void setloginGUI(loginGUI logingui) {
        this.logingui = logingui;
    }

    public IslemlerGUI getIslem() {
        if(this.islem==null)
        {
            this.islem=new IslemlerGUI();
            islem.atm();
        }
        return islem;
    }

    public void setIslem(IslemlerGUI islem) {
        this.islem = islem;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    
    
    

   
}

