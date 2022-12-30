
package bankingapplication.guı;

import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class kayıtolGUI {
    private JFrame frame;
    private JPanel panel;
    private JTextField numara,sifree,nameSurname;
    private JButton kayıtol;
    private JLabel no,sifre,name,fotografEtiketi;
    private Image image;
    private ImageIcon imageIcon;
    

    public JFrame getFrame() {
        if(this.frame==null){
               this.frame=new JFrame();
               frame.setSize(500,500);
               this.frame.setLayout(null);
            //  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
         }
        return frame;
    }

    public void setFrame(JFrame frame) {
        this.frame = frame;
    }

    public JPanel getPanel() {
        if(this.panel==null){
               this.panel=new JPanel();
               this.panel.setLayout(null);
               this.panel.setBounds(40,200,500,500);
         }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JTextField getNumara() {
        if(this.numara==null){
               this.numara=new JTextField();
               numara.setBounds(20, 208, 150, 20);
                numara.setForeground(Color.black);
        }
        return numara;
    }

    public void setnumara(JTextField numara) {
        this.numara = numara;
    }

    public JTextField getSifree() {
        if(this.sifree==null){
               this.sifree=new JTextField();
               sifree.setBounds(20, 258, 150, 20);
                sifree.setForeground(Color.black);
        }
        return sifree;
    }

    public void setsifree(JTextField sifree) {
        this.sifree = sifree;
    }

    public JButton getKayıtol() {
        if(this.kayıtol==null){
               this.kayıtol=new JButton("KAYIT");
               kayıtol.setBounds(20, 283, 150, 18);
                kayıtol.setForeground(Color.black);
        }
        return kayıtol;
    }

    public void setkayıtol(JButton kayıtol) {
        this.kayıtol = kayıtol;
    }

    public JLabel getNo() {
        if(this.no==null){
               this.no=new JLabel("HESAP NUMARANIZI GİRİNİZ");
               no.setBounds(20, 183, 220, 25);
               no.setForeground(Color.white);
        }
        return no;
    }

    public void setno(JLabel no) {
        this.no = no;
    }

    public JLabel getSifre() {
        if(this.sifre==null){
               this.sifre=new JLabel("ŞİFRE OLUŞTURUNUZ");
               sifre.setBounds(20, 233, 200, 25);
                sifre.setForeground(Color.white);
        }
        return sifre;
    }

    public void setsifre(JLabel sifre) {
        this.sifre = sifre;
    }

    public JLabel getName() {
        if(this.name==null){
               this.name=new JLabel("İSİM-SOYİSİM GİRİNİZ");
               name.setBounds(20, 138, 300, 20);
               name.setForeground(Color.white);
           }
        return name;
    }

    public void setName(JLabel name) {
        this.name = name;
    }
    
    public JTextField getNameSurname() {
         if(this.nameSurname==null){
            this.nameSurname=new JTextField();
            nameSurname.setBounds(20, 158, 150, 20);
     }
        return nameSurname;
    }

    public void setNameSurname(JTextField nameSurname) {
        this.nameSurname = nameSurname;
    }

    public Image getImage() {
        if(this.image==null)
        {
            this.image=getImageIcon().getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        }
        return image;
    }

    public void setımage(Image image) {
        this.image = image;
    }

    public ImageIcon getImageIcon() {
        if(this.imageIcon==null){
            this.imageIcon=new ImageIcon("\\C:\\Users\\asele\\OneDrive\\Belgeler\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\guı\\resım\\atm.png\\");
        }
        return imageIcon;
    }

    public void setımageIcon(ImageIcon imageIcon) {
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

    public void setfotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }

    

    
    
    public void atm(){
         this.getPanel().add(this.getNumara());
         this.getPanel().add(this.getSifre());
         this.getPanel().add(this.getKayıtol());
         this.getPanel().add(this.getNo());
         this.getPanel().add(this.getName());
         this.getPanel().add(this.getSifree());
         this.getPanel().add(this.getNameSurname());
         this.getPanel().add(this.getFotografEtiketi());
         this.getFrame().setContentPane(this.getPanel());
         this.getFrame().setVisible(true);
 }


    
}


