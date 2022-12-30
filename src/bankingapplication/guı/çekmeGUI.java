
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

public class çekmeGUI extends IslemlerGUI {
   
    private JLabel tutar;
    private JTextField text;
    private JButton cek;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;
    private JLabel para;
       
    

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

    

    public JLabel getTutar() {
        if(this.tutar==null){
               this.tutar=new JLabel("ÇEKİLECEK TUTARI GİRİNİZ");
               tutar.setBounds(150, 140, 300, 80);
               tutar.setFont(new Font("Arial",Font.BOLD,16));
               tutar.setForeground(Color.white);
              
    }
        return tutar;
    }
     public void setTutar(JLabel tutar) {
        this.tutar = tutar;
    }

    

    public JButton getCek() {
        if(this.cek==null){
               this.cek=new JButton("TAMAM");
               this.cek.setBounds(205, 235, 100, 20);
                cek.addActionListener(new ActionListener() {
                   @Override
                   public void actionPerformed(ActionEvent e) {
                       para.setText("PARAYI ALINIZ");
                   }
                  });
              }
               
    
       
        return cek;
    }

    public void setCek(JButton cek) {
        this.cek = cek;
    }

    public JTextField getText() {
        if(this.text==null){
               this.text=new JTextField();
               this.text.setBounds(190, 205, 130, 25);
    }
        return text;
    }
    public void setText(JTextField text) {
        this.text = text;
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

    public JLabel getPara() {
        if(this.para==null){
               this.para=new JLabel();
               para.setBounds(185, 265, 150, 20);
               para.setFont(new Font("Arial",Font.BOLD,20));
               para.setForeground(Color.white);
        }
        return para;
    }

    public void setPara(JLabel para) {
        this.para = para;
    }
    
    
    
    
    

 public void atm(){
        this.getPanel().add(this.getText());
        this.getPanel().add(this.getCek());
         this.getPanel().add(this.getTutar());
         this.getPanel().add(this.getPara());
         this.getPanel().add(this.getFotografEtiketi());
        this.getFrame().setContentPane(this.getPanel());
        this.getFrame().setVisible(true);
      
    }
    
}
