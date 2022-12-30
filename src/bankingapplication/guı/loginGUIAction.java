
package bankingapplication.guı;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  bankingapplication.DAO.müşteriDAO;

public class loginGUIAction  implements ActionListener{
    private IslemlerGUI islemler;
    private loginGUI logingui;
    private kayıtolGUI kayıt;
    private müşteriDAO müşteri;
    

   public loginGUIAction(loginGUI logingui) {
        this.logingui = logingui;
    }


    public IslemlerGUI getIslemler() {
        if(this.islemler==null)
        {
            islemler=new IslemlerGUI();
            islemler.atm();
        }
        return islemler;
    }

    public void setIslemler(IslemlerGUI islemler) {
        this.islemler = islemler;
    }


    public loginGUI getLogingui() {
        if(logingui==null){
            logingui=new loginGUI();
            logingui.atm();
        }
        return logingui;
    }

    public void setLogingui(loginGUI logingui) {
        this.logingui = logingui;
    }

    public kayıtolGUI getKayıt() {
        if(this.kayıt==null)
        {
            kayıt=new kayıtolGUI();
            kayıt.atm();
        }
        return kayıt;
    }

    public void setKayıtgui(kayıtolGUI kayıtgui) {
        this.kayıt = kayıtgui;
    }

    public müşteriDAO getMüşteri() {
        if(this.müşteri==null)
        {
            this.müşteri=new müşteriDAO();
        }
        return müşteri;
    }

    public void setmüşteri(müşteriDAO müşteri) {
        this.müşteri = müşteri;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==getLogingui().getHesap()){
           getKayıt().getFrame().setContentPane(getKayıt().getPanel());
           getKayıt().getFrame().setVisible(true);
       }
       else if(e.getSource()==getLogingui().getGiris())
       {
           
               getIslemler().getFrame().setContentPane(getIslemler().getPanel());
               getIslemler().getFrame().setVisible(true);
      
       }
    }

    public loginGUIAction(IslemlerGUI islemler) {
        this.islemler = islemler;
    }

    
    public loginGUIAction(kayıtolGUI kayıt) {
        this.kayıt = kayıt;
    }
    
    

 
      
       
    }


