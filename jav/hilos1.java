class hilos1 implements Runnable 
{
    String nombre;
    Thread t;
    int i;

hilos1(String nombrehilo)
{
    nombre = nombrehilo;
    t=new Thread(this,nombre);
    System.out.println("nuevo hilo: " + t);
    t.start(); 
}
public void run()
{
    try
    {
        for(i=5;i>0;i--)
        {
            System.out.println(nombre+": "+i);
            t.sleep(1000);
        }
    }
 catch(InterruptedException e)
        {
            System.out.println("Interrupcion del hilo "+nombre);
            System.out.println("Salida del hilo " +nombre);
        }
}
public static void main(String a[])throws Exception
{
    new hilos1("uno");
    new hilos1("dos");
    new hilos1("tres");
    try
    {
        Thread.sleep(10000);
    }
    catch(InterruptedException e)
    {
        System.out.println("Interrupcion del hilo principal");

    }
    System.out.println("Salida del hilo principal");
}
}