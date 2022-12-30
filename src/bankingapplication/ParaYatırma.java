
package bankingapplication;

public class ParaYatırma implements bakiye{
    private int tutar;
    private int bakiye;
    
    
    public ParaYatırma(int tutar, int bakiye) {
        this.tutar = tutar;
        this.bakiye = bakiye;
    }

    public ParaYatırma() {
    }

    public int getTutar() {
        return tutar;
    }

    public void setTutar(int tutar) {
        this.tutar = tutar;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    @Override
    public String toString() {
        return "ParaYatırma{" + "tutar=" + tutar + ", bakiye=" + bakiye + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + this.tutar;
        hash = 89 * hash + this.bakiye;
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
        final ParaYatırma other = (ParaYatırma) obj;
        if (this.tutar != other.tutar) {
            return false;
        }
        return this.bakiye == other.bakiye;
    }

    @Override
    public double tutar() {
         return tutar+bakiye;    }
    
}
