
package bankingapplication.DAO;

//liskov substitution principle
//türetilen sınflar türeyen sınıfların tüm özelliklerini kullabilmelidir.
public abstract class mainDAO{
     public abstract void Save(String password,String no,String name);
     public abstract int getData(String password);
}
