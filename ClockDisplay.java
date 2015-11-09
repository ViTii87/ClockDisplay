
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

   public void setTime(int hora, int mins){
       horas = hora;
       minutos = mins;
    }
}
