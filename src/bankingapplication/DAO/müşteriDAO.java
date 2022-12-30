
package bankingapplication.DAO;
        

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class müşteriDAO extends mainDAO{
    
    public müşteriDAO() {
    }
   

    @Override
    public void Save(String password,String no,String isim){
        String Filename="C:\\Users\\asele\\OneDrive\\Belgeler\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\guı\\file\\test";
        File f=new File(Filename);
        if(!f.exists())
        {
            try {
                f.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(müşteriDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Dosya olusturuldu"+Filename);
        }
        else
        {
            FileWriter fw;
            try {
                fw = new FileWriter(f,true);
                BufferedWriter buf=new BufferedWriter(fw);
                buf.write("'"+password+"'"+no+"'"+isim);
                buf.newLine();
                buf.close();
                System.out.println("Dosyaya yazıldı.");
            } catch (IOException ex) {
                Logger.getLogger(müşteriDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }

    @Override
    public int getData(String password) {
        
        try {
            FileReader fileReader=new FileReader("C:\\Users\\asele\\OneDrive\\Belgeler\\NetBeansProjects\\BankingApplication\\src\\bankingapplication\\guı\\file\\test");
            BufferedReader reader=new BufferedReader(fileReader);
            String line;
            while((line=reader.readLine())!=null)
            {
                String[] bilgiler=line.split("'");
                System.out.println(bilgiler[1]);
                String p=bilgiler[3];
                
                if(p.equals(password))
                {
                    return 1;
                }
            }
            reader.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(müşteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(müşteriDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
;
        
        return 0;
    }
    
}
