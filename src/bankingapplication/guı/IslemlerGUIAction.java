
package bankingapplication.guı;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class IslemlerGUIAction implements ActionListener{

     private havaleGUI havale;
     private çekmeGUI çekme;
     private yatırmaGUI yatırma;
     private IslemlerGUI islemler;

    public havaleGUI getHavale() {
        if(havale==null){
            havale=new havaleGUI();
            havale.atm();
        }
        return havale;
    }

    public void setHavale(havaleGUI havale) {
        this.havale = havale;
    }

    public çekmeGUI getÇekme() {
        if(çekme==null){
            çekme=new çekmeGUI();
            çekme.atm();
        }
        return çekme;
    }

    public void setÇekme(çekmeGUI çekme) {
        this.çekme = çekme;
    }

    public yatırmaGUI getYatırma() {
        if(yatırma==null){
            yatırma=new yatırmaGUI();
            yatırma.atm();
        }
        return yatırma;
    }

    public void setYatırma(yatırmaGUI yatırma) {
        this.yatırma = yatırma;
    }

    public IslemlerGUI getIslemler() {
        if(islemler==null){
            islemler=new IslemlerGUI();
            islemler.atm();
        }
        return islemler;
    }

    public void setIslemler(IslemlerGUI islemler) {
        this.islemler = islemler;
    }

    public IslemlerGUIAction(çekmeGUI çekme) {
        this.çekme = çekme;
    }

    public IslemlerGUIAction(yatırmaGUI yatırma) {
        this.yatırma = yatırma;
    }

    public IslemlerGUIAction(havaleGUI havale) {
        this.havale = havale;
    }
    

    public IslemlerGUIAction(IslemlerGUI islemler) {
        this.islemler = islemler;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==getIslemler().getParacek()){
            getÇekme().getFrame().setContentPane(getÇekme().getPanel());
            getÇekme().getFrame().setVisible(true);
    }
        else if(e.getSource()==getIslemler().getHavale()){
            getHavale().getFrame().setContentPane(getHavale().getPanel());
            getHavale().getFrame().setVisible(true);
        }
        else if(e.getSource()==getIslemler().getParayatir()){
            getYatırma().getFrame().setContentPane(getYatırma().getPanel());
            getYatırma().getFrame().setVisible(true);
        }
        
    
            
      
    }

  
    
 
      

    
}
