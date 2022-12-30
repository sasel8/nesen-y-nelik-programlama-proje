
package bankingapplication.guı;


public class yatırmaGUIAction {
    private IslemlerGUI islemler;
    private loginGUI logingui;

   

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

    

 
      

}
