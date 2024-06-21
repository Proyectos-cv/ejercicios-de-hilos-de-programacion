public class CompletoHilos implements Runnable
{
  String nomhilo;
  public static Thread hilo;

  public CompletoHilos(String hilonom)
  {
    nomhilo=hilonom;
    //Instanciar el hilo creado.
    hilo=new Thread(this,nomhilo);
    
    System.out.println("Nuevo hilo: " + hilo);
    hilo.start();
  }

  public void run()
  {
    try
    {
       for(int i=5;i>0;i--)
       {
          System.out.println(nomhilo + ":  " +i);
          Thread.sleep(1000);
       }
    }
    catch(InterruptedException exc)
    {
      System.out.println("Interrupcion del hilo "+nomhilo); 
    }  
    System.out.println("Salida del hilo: "+nomhilo);
  }  

  
public static void main(String a[])
{
   //Crear 3 hilos
   CompletoHilos obj1=new CompletoHilos("Hilo 1");   
   CompletoHilos obj2=new CompletoHilos("Hilo 2");   
   CompletoHilos obj3=new CompletoHilos("Hilo 3");
   
   //Metodo isAlive() 
   //La sintaxis es:  Objeto.hilo.isAlive();
   System.out.println("El hilo 1 esta vivo: " + obj1.hilo.isAlive());   
   System.out.println("El hilo 2 esta vivo: " + obj2.hilo.isAlive());   
   System.out.println("El hilo 3 esta vivo: " + obj3.hilo.isAlive());   

   try
   {
     Thread.sleep(1000);
     obj1.hilo.suspend();
     System.out.println("Hilo 1 suspendido");
     Thread.sleep(1000);
     obj1.hilo.resume(); 
     System.out.println("Reanudacion del hilo 1");
    
     Thread.sleep(1000);
     obj2.hilo.suspend();
     System.out.println("Hilo 2 suspendido");
     Thread.sleep(1000);
     obj2.hilo.resume(); 
     System.out.println("Reanudacion del hilo 2");
    
     Thread.sleep(1000);
     obj3.hilo.suspend();
     System.out.println("Hilo 3 suspendido");
     Thread.sleep(1000);
     obj3.hilo.resume(); 
     System.out.println("Reanudacion del hilo 3");
   }
   catch(InterruptedException ex)
   {
      System.out.println("Interrupcion del hilo principal");
   } 


   try
   {
     System.out.println("Espera la finalizacion de los hilos");
     obj1.hilo.join();
     obj2.hilo.join();
     obj3.hilo.join();

   }
   catch(InterruptedException ex)
   {
      System.out.println("Interrupcion del hilo principal");
   }
   System.out.println("El hilo 1 esta vivo: " + obj1.hilo.isAlive());   
   System.out.println("El hilo 2 esta vivo: " + obj2.hilo.isAlive());   
   System.out.println("El hilo 3 esta vivo: " + obj3.hilo.isAlive());   

   System.out.println("Salida del hilo principal");
}
}