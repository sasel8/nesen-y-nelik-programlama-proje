
package bankingapplication;

public class Havale implements bakiye {
    private int hesapNo;
    private int bakiye;
    private int tutar;

    public Havale(int hesapNo, int bakiye, int tutar) {
        this.hesapNo = hesapNo;
        this.bakiye = bakiye;
        this.tutar = tutar;
    }

    public Havale() {
    }

    public int getHesapNo() {
        return hesapNo;
    }

    public void setHesapNo(int hesapNo) {
        this.hesapNo = hesapNo;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    @Override
    public String toString() {
        return "Havale{" + "hesapNo=" + hesapNo + ", bakiye=" + bakiye + ", tutar=" + tutar + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.hesapNo;
        hash = 83 * hash + this.bakiye;
        hash = 83 * hash + this.tutar;
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
        final Havale other = (Havale) obj;
        if (this.hesapNo != other.hesapNo) {
            return false;
        }
        if (this.bakiye != other.bakiye) {
            return false;
        }
        return this.tutar == other.tutar;
    }

    @Override
    public double tutar() {
         return tutar-bakiye;
    }
    
    
    
}
        