
package cuenta;
public class Cuenta {
   private String nombre;
   private double saldo ;

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cuenta(String nombre, double saldo) {
        this.nombre = nombre;
        if (saldo>0){
            this.saldo = saldo;
        }
        
    }
    public void depositar (double montoDeposito){
        if (montoDeposito >0){
            saldo = saldo + montoDeposito;
        }
        
    }
   
   
}
