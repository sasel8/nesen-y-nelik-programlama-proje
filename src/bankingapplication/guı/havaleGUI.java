
package bankingapplication.guı;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class havaleGUI extends IslemlerGUI{
    private JTextField hesapNo;
    private JButton tamam;
    private JLabel hesap,fotografEtiketi;
    private Image image;
    private ImageIcon imageIcon;
     private JLabel metin;


    @Override
    public void setPanel(JPanel panel) {
        super.setPanel(panel); 
    }

    @Override
    public JPanel getPanel() {
        return super.getPanel(); 
    }

    @Override
    public void setFrame(JFrame frame) {
        super.setFrame(frame); 
    }

    @Override
    public JFrame getFrame() {
        return super.getFrame(); 
    }

    @Override
    public JLabel getMetin() {
        if(this.metin==null){
               this.metin=new JLabel();
               metin.setBounds(200, 280, 150, 20);
               metin.setFont(new Font("Arial",Font.BOLD,20));
                metin.setForeground(Color.white);
        }
        return metin;
    }

    public void setMetin(JLabel metin) {
        this.metin = metin;
    }

    

    public JTextField getHesapNo() {
        if(this.hesapNo==null){
               this.hesapNo=new JTextField();
               hesapNo.setBounds(200, 215, 100, 20);
              
           }
        return hesapNo;
    }

    public void setHesapNo(JTextField hesapNo) {
        this.hesapNo = hesapNo;
    }

    
    public JButton getTamam() {
        if(this.tamam==null){
               this.tamam=new JButton("GİRİŞ");
               tamam.setBounds(215, 245, 75, 20);
                  tamam.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       metin.setText("PARA YATIRILDI");
                       metin.setFont(new Font("Arial",Font.BOLD,18));
                       metin.setForeground(Color.white);
                       metin.setBounds(180, 270, 300, 20);
                   }
                  });
              }
        return tamam;
    
    }

    public void settamam(JButton tamam) {
        this.tamam = tamam;
    }

    public JLabel getHesap() {
        if(this.hesap==null){
               this.hesap=new JLabel("HESAP NO GİRİNİZ");
               this.hesap.setBounds(180, 180, 300, 30);
               hesap.setFont(new Font("Arial",Font.BOLD,16));
               hesap.setForeground(Color.white);
    }
        return hesap;
    }

    public void sethesap(JLabel hesap) {
        this.hesap = hesap;
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
        if(this.imageIcon==null)
        {
            this.imageIcon=new ImageIcon("C:\\Users\\asele\\OneDrive\\Belgeler\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\guı\\resım\\atm2.jpg");
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
    
      
    
    
    @Override
 public void atm(){
        this.getPanel().add(this.getTamam());
        this.getPanel().add(this.getHesap());
        this.getPanel().add(this.getHesapNo());
        this.getPanel().add(this.getMetin());
        this.getPanel().add(this.getFotografEtiketi());
        this.getFrame().setContentPane(this.getPanel());
        this.getFrame().setVisible(true);
 }

   
    
    

}
