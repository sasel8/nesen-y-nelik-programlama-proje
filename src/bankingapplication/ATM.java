
package bankingapplication;

import java.util.Objects;




public class ATM {
    private int bakiye;
     private MUSTERI password;

    public ATM(int bakiye, MUSTERI password) {
        this.bakiye = bakiye;
        this.password = password;
    }

    public ATM() {
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public MUSTERI getPassword() {
        return password;
    }

    public void setPassword(MUSTERI password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.bakiye;
        hash = 89 * hash + Objects.hashCode(this.password);
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
        final ATM other = (ATM) obj;
        if (this.bakiye != other.bakiye) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }

    @Override
    public String toString() {
        return "ATM{" + "bakiye=" + bakiye + ", password=" + password + '}';
    }
     
    
      
      
      
     
}
