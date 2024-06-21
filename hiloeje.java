class hilos1 implements runnable
{
String nombre;
Thread t;
int i;
}

hilos (String nombrehilo)
{
nombre=nombrehilo;
t=new Thread(this, nombre);
System.out.println("nuevo hilo: "+t);
t.start();
}