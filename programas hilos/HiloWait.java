import java.util.logging.Level;
import java.util.logging.Logger;
public class HiloWait
{
   public static void main(String[] args)
   {
        // Objeto en comun, se encarga del wait y notify
        Saludo s = new Saludo();
       
        Personal Empleado1 = new Personal("Pepe", s, false);
        Personal Empleado2 = new Personal("José", s, false);
        Personal Empleado3 = new Personal("Pedro", s, false);
        Personal Jefe1 = new Personal("JEFE", s, true);

        Empleado1.start();           
        Empleado2.start();           
        Empleado3.start();           
        Jefe1.start();
    }
}
class Personal extends Thread{
    String nombre;
    Saludo saludo;
    boolean esJefe;
   
    public Personal(String nombre, Saludo salu, boolean esJefe){
        this.nombre = nombre;
        this.saludo = salu;
        this.esJefe = esJefe;
    }
   
    public void run(){
        System.out.println(nombre + " llegó.");
        try {
            Thread.sleep(1000);
            //Verifico si es personal que esta es jefe o no
            if(esJefe){
                saludo.saludoJefe(nombre);
            }else{
                saludo.saludoEmpleado(nombre);
            }
           
        } catch (InterruptedException ex) {
            Logger.getLogger(Personal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class Saludo {
   
    public Saludo(){       
    }
   
    /* Si no es jefe, el empleado va a quedar esperando a que llegue el jefe
    Se hace wait de el hilo que esta corriendo y se bloquea, hasta que
    se le avise que ya puede saludar*/
    public synchronized void saludoEmpleado(String nombre){
        try {
            wait();
            System.out.println("\n"+nombre.toUpperCase() + "-: Buenos días jefe.");
        } catch (InterruptedException ex) {
            Logger.getLogger(Saludo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    //Si es jefe, saluda y luego avisa a los empleados para que saluden
    // El notifyAll despierta a todos los hilos que esten bloqueados
    public synchronized void saludoJefe(String nombre){
        System.out.println("\n****** "+nombre + "-: Buenos días empleados. ******");
        notifyAll();
    }    
}
