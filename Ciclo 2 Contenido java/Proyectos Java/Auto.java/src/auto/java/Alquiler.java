package auto.java;

import java.time.LocalDate;

public class Alquiler {
    private Cliente Cliente; 
    private Auto Auto;
    private LocalDate Fecha;
    private int HorasAlquiler;
    
    public Alquiler(Cliente Cliente, Auto Auto, LocalDate Fecha, int HorasAlquiler) {
        this.Cliente = Cliente;
        this.Auto = Auto;
        this.Fecha = Fecha;
        this.HorasAlquiler = HorasAlquiler;
    }

    public Cliente getCliente() {
        return Cliente;
    }

    public void setCliente(Cliente Cliente) {
        this.Cliente = Cliente;
    }

    public Auto getAuto() {
       
        return Auto;
    }

    public void setAuto(Auto Auto) {
        this.Auto = Auto;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDate Fecha) {
        this.Fecha = Fecha;
    }

    public int getHorasAlquiler() {
        return HorasAlquiler;
    }

    public void setHorasAlquiler(int HorasAlquiler) {
        this.HorasAlquiler = HorasAlquiler;
    }
    int variable;
    int HorasAcumuladas;
    int ValorDescuento;
    public int ObtenerDescuento(Alquiler[]alquileres){  
        
        if (NecesitaMantenimiento()&& SePuedeRentar()){
            
            for (int i = 0; i<alquileres.length;i++){
                HorasAcumuladas = getHorasAlquiler() + getHorasAlquiler(); 
                
                if (Cliente.getCedula()== alquileres[i].getCedula()){
                       
                }
            }
               
        }
        if(HorasAcumuladas <20){
            variable = 0;
        }
            else if ((HorasAcumuladas >=20)&&(HorasAcumuladas<=50)){
                variable = 2;
            }
                else if (HorasAcumuladas>50){
                    variable = 5;
                }
        
        return variable ; 
        
    }
    double horas=5000;
    boolean horas1;
    double h1;
    public double CalcularCosto(boolean aplicaDescuento){
        
        if (HorasAcumuladas >0){
            horas1 =false;
        }
            else{
                horas1 = true;
            }
      
        horas = horas * HorasAlquiler;
        
        if (horas1 == true){
            h1 =(horas*2)/100;   // por si ocurre algo intenta cambiar el 2 por  la variable variable
            horas = horas-h1 ;
        }
    
        return horas;
    } 
    
    
    
    
    public static boolean PuedeAlquilar(Alquiler[]historial,Cliente cliente){
        
        boolean iterador = true;
        int contador= 0 ;
        
        String cedula;
//        for (int i = 0; i<historial.length;i++){   
              
//        }
        // se supone que es el que verifica si hay repetidos
        for (int i=0;i < historial.length-1;i++){
          for( int j = i+1; j<historial.length;j++){
              if (historial[i]== historial[j]){
                  contador = contador + 1;
              }
          }
        }
        if (contador >=3){
            iterador = false;
        }
            else{
                iterador = true;
            }
        
        return iterador;
        
    }
    private boolean SePuedeRentar() {
        
        return true;   
    }
    private boolean NecesitaMantenimiento() {
       
        return true;
       
    }
    private String getCedula() {
        
        return null;
        
    }
}       
