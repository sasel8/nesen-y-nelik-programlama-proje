
package bankingapplication;

import java.util.Objects;




public class MUSTERI {
    private Long id;
    private String nameSurname;
    private String password;
    private Long accountNumber;

    public MUSTERI( String id) { //single responsibilty principle(tek sorumluluk ilkesi) tek işi tek sorumlulukta yapma sanatıdır.
        
    }
    
   
    
    public MUSTERI(Long id, String nameSurname, String password,Long accountNumber) {
        this.nameSurname=nameSurname;
        this.id = id; 
        this.password = password;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
     public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
      public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }
    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "MUSTERI{" + "id=" + id + ", nameSurname=" + nameSurname + ", password=" + password + ", accountNumber=" + accountNumber + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nameSurname);
        hash = 79 * hash + Objects.hashCode(this.password);
        hash = 79 * hash + Objects.hashCode(this.accountNumber);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MUSTERI other = (MUSTERI) obj;
        if (!Objects.equals(this.nameSurname, other.nameSurname)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.accountNumber, other.accountNumber);
    }
    
}

