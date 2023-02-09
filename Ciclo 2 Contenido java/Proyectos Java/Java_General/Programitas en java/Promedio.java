public class Promedio{
 public static void main(String args[]){
   
   int mate = 2;
   int bio = 8;
   int quimica = 7;
   int promedio = 0;
   
   promedio = (mate + bio + quimica + promedio)/3;
   
   if(promedio >=6){
     System.out.println("El alumno aprobó " + promedio);
   } else{
     System.out.println("El alumno reprobó " + promedio);
   }
   
 }
}