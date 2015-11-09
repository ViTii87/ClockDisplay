
/**
 * Write a description of class ClockDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClockDisplay
{
    // instance variables - replace the example below with your own
    private int horas;
    private int minutos;

    /**
     * Creamos un reloj con las horas y minutos inicializados a 0
     */
    public ClockDisplay()
    {
        horas = 0;
        minutos = 0;
    }

    /**
     * Creado metodo para fijar nuestro reloj con horas y minutos
     */
   public void setTime(int hora, int mins){
       horas = hora;
       minutos = mins;
    }
    
   /**
    * Creado metodo para aumentar minuto a minuto, si las horas fuesen 24 se pondrian a 0 y si los minutos llegaran a 59 pasan a ser 0 y se suma 1 hora
    */
   public void timeTick(){
       if(minutos == 59) {
           horas += 1;
           minutos = 0;
       }
       else {
           minutos += 1; 
       }    
       if(horas == 24) {
           horas = 0;
        }    
   }
   
   /**
    * Creado metodo para obtener el tiempo en el formato correcto
    */
   public String getTime(){
   String tiempo="";    
   return String.format("%02d", horas) + ":" + String.format("%02d", minutos);
   }
}
