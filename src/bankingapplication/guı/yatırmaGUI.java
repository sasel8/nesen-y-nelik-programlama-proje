
package bankingapplication.guı;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



public class yatırmaGUI extends IslemlerGUI {
    
    private JLabel text;
    private Image image;
    private ImageIcon imageIcon;
    private JLabel fotografEtiketi;

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

   

    public JLabel getText() {
        if(this.text==null){
            this.text=new JLabel("PARA YATIRILDI");
            text.setBounds(160, 210, 300, 80);
            text.setFont(new Font("Arial",Font.BOLD,22));
            text.setForeground(Color.white);
           
        }
        return text;
    }

    public void settext(JLabel text) {
        this.text = text;
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
        this.getPanel().add(this.getText());
        this.getPanel().add(this.getFotografEtiketi());
         this.getFrame().setContentPane(this.getPanel());
        this.getFrame().setVisible(true);
   
    }}
