package bankingapplication.guı;

import java.awt.*;
import javax.swing.*;

public class loginGUI {

    private JFrame window;
    private JPanel panel;
    private JButton giris, hesap;
    private JPasswordField sifre;
    private JLabel labelsifre, fotografEtiketi;
    private Image image;
    private ImageIcon imageIcon;

    public loginGUI() {
    }

    public JLabel getLabelsifre() {
        if (this.labelsifre == null) {
            this.labelsifre = new JLabel("ŞİFRENİZİ GİRİNİZ");
            labelsifre.setBounds(40, 120, 300, 80);
            labelsifre.setFont(new Font("Arial", Font.BOLD, 16));
            labelsifre.setForeground(Color.white);
        }
        return labelsifre;
    }

    public void setLabelsifre(JLabel labelsifre) {
        this.labelsifre = labelsifre;
    }

    public JPasswordField getSifre() {
        if (this.sifre == null) {
            this.sifre = new JPasswordField();
            sifre.setBounds(40, 180, 150, 25);

        }
        return sifre;
    }

    public void setSifre(JPasswordField sifre) {
        this.sifre = sifre;
    }

    public JFrame getWindow() {
        if (this.window == null) {
            this.window = new JFrame();
            window.setSize(500, 500);
            this.window.setLayout(null);
            //  window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }

    public JPanel getPanel() {
        if (this.panel == null) {
            this.panel = new JPanel();
            this.panel.setLayout(null);
            this.panel.setBounds(40, 200, 500, 500);
        }
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JButton getGiris() {
        if (this.giris == null) {
            this.giris = new JButton("GİRİŞ");
            this.giris.setBounds(40, 220, 100, 30);
            this.giris.addActionListener(new loginGUIAction(this));
        }
        return giris;
    }

    public void setGiris(JButton giris) {
        this.giris = giris;
    }

    public JButton getHesap() {
        if (this.hesap == null) {
            this.hesap = new JButton("HESAP OLUŞTUR");
            this.hesap.setBounds(40, 260, 150, 30);
            this.hesap.addActionListener(new loginGUIAction(this));
        }
        return hesap;
    }

    public void setHesapolustur(JButton hesap) {
        this.hesap = hesap;
    }

    public Image getImage() {
        if (this.image == null) {
            this.image = getImageIcon().getImage().getScaledInstance(500, 500, Image.SCALE_SMOOTH);
        }
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public ImageIcon getImageIcon() {
        if (this.imageIcon == null) {
            this.imageIcon = new ImageIcon("C:\\Users\\asele\\OneDrive\\Belgeler\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\guı\\resım\\atm.png");
        }
        return imageIcon;
    }

    public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public JLabel getFotografEtiketi() {
        if (this.fotografEtiketi == null) {
            this.fotografEtiketi = new JLabel(new ImageIcon(getImage()));
            this.fotografEtiketi.setBounds(0, 0, 500, 500);
        }
        return fotografEtiketi;
    }

    public void setFotografEtiketi(JLabel fotografEtiketi) {
        this.fotografEtiketi = fotografEtiketi;
    }

    public void atm() {
        this.getPanel().add(this.getLabelsifre());
        this.getPanel().add(this.getGiris());
        this.getPanel().add(this.getSifre());
        this.getPanel().add(this.getHesap());
        this.getPanel().add(this.getFotografEtiketi());
        this.getWindow().setContentPane(this.getPanel());
        this.getWindow().setVisible(true);

    }

}
