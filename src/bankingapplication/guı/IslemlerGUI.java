
package bankingapplication.guı;


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IslemlerGUI {
    private JFrame frame;
    private JPanel panel;
    private JButton parayatir;
    private JButton paracek;
    private JButton havale;
    private JLabel metin;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;
       
    
    public JFrame getFrame(){
           if(this.frame==null){
               this.frame=new JFrame();
               frame.setSize(500,500);
               this.frame.setLayout(null);
              frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

           }
           return frame;
       }
       
       public void setFrame(JFrame frame){
           this.frame=frame;
       }

    public JPanel getPanel() {
         if(this.panel==null){
               this.panel=new JPanel();
               this.panel.setLayout(null);
               panel.setBounds(40,200,500,500);
        
    }
         return panel;
    }
         
         public void setPanel(JPanel panel){
           this.panel=panel;
       }
         public JButton getParayatir() {
         if(this.parayatir==null){
               this.parayatir=new JButton("PARA YATIR");
               parayatir.setBounds(310, 225, 120, 25);
               this.parayatir.addActionListener(new IslemlerGUIAction(this));

    }
        return parayatir;
    }
       
    public void setParayatir(JButton parayatir) {
        this.parayatir = parayatir;
    }
    
    public JButton getParacek() {
         if(this.paracek==null){
               this.paracek=new JButton("PARA ÇEK");
               paracek.setBounds(190, 225, 100, 25);
                this.paracek.addActionListener(new IslemlerGUIAction(this));

        
    }
        return paracek;
    }

    public void setParacek(JButton paracek) {
        this.paracek = paracek;
    }
       
   
    public JButton getHavale() {
         if(this.havale==null){
               this.havale=new JButton("HAVALE");
               havale.setBounds(70, 225, 100, 25);
               this.havale.addActionListener(new IslemlerGUIAction(this));

    }
        return havale;
    }

    public void setHavale(JButton havale) {
        this.havale = havale;
    }

    public JLabel getMetin() {
        if(this.metin==null){
               this.metin=new JLabel("İŞLEM SECİNİZ");
               metin.setBounds(185, 170, 200, 50);
               metin.setFont(new Font("Arial",Font.BOLD,16));
               metin.setForeground(Color.white);
           }
        return metin;
    }

    public void setMetin(JLabel metin) {
        this.metin = metin;
    }
    
    public Image getImage() {
        if(this.image==null)
        {
            this.image=getImageIcon().getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        }
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }
    
     public ImageIcon getImageIcon() {
        if(this.imageIcon==null)
        {
            this.imageIcon=new ImageIcon("C:\\Users\\asele\\OneDrive\\Belgeler\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\guı\\resım\\atm2.jpg");
        }
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public JLabel getFotografEtiketi() {
        if(this.fotografEtiketi==null)
        {
            this.fotografEtiketi=new JLabel(new ImageIcon(getImage()));
            this.fotografEtiketi.setBounds(0,0,500,500);
        }
        return fotografEtiketi;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }
    
    
    
       
     public void atm(){
         //this.getPanel().add(this.getPanel());
        this.getPanel().add(this.getParayatir());
        this.getPanel().add(this.getParacek());
        this.getPanel().add(this.getHavale());
        this.getPanel().add(this.getMetin());
       this.getPanel().add(this.getFotografEtiketi());

        this.getFrame().setContentPane(this.getPanel());
        this.getFrame().setVisible(true);
     }

 
    
    

  
}
