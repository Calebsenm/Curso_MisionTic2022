package auto.java;

public class Auto {
    private String Placa;
    private int DiasDesdeUltimoMantenimiento;
    private boolean TieneSeguro;
    int coche ;
    //este es el constructor de la clase
    
    public Auto(String Placa, int DiasDesdeUltimoMantenimiento, boolean TieneSeguro) {
        this.Placa = Placa;
        this.DiasDesdeUltimoMantenimiento = DiasDesdeUltimoMantenimiento;
        this.TieneSeguro = TieneSeguro;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public int getDiasDesdeUltimoMantenimiento() {
        return DiasDesdeUltimoMantenimiento;
    }

    public void setDiasDesdeUltimoMantenimiento(int DiasDesdeUltimoMantenimiento) {
        this.DiasDesdeUltimoMantenimiento = DiasDesdeUltimoMantenimiento;
    }

    public boolean isTieneSeguro() {
        return TieneSeguro;
    }

    public void setTieneSeguro(boolean TieneSeguro) {
        this.TieneSeguro = TieneSeguro;
    }

    public int getCoche() {
        return coche;
    }

    public void setCoche(int coche) {
        this.coche = coche;
    }
    
    
    public boolean NecesitaMantenimiento(){
        
        return (DiasDesdeUltimoMantenimiento >20);
        
    }
    public  boolean SePuedeRentar(){
        return((TieneSeguro == true) &&(DiasDesdeUltimoMantenimiento <= 20));
        
       
    }
    
   
}
