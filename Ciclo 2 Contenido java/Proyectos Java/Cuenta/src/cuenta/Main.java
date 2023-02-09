
package cuenta;
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta cuenta1 = new Cuenta("Caleb ",500.0 );
        System.out.println("El saldo inicial de la cuenta " + cuenta1.getSaldo());
        double montoDeposito=5.0;
        System.out.println("depositamos "+ montoDeposito);
        
        cuenta1.depositar(montoDeposito);
        System.out.println("Nuevo saldo de la cuenta es: "+ cuenta1.getSaldo());
    }
    
}
