public class Par_impar_hilos
{
 public static void main (String args[])
 {
  
   Thread par=new Thread(new ImparThread());
   Thread impar=new Thread(new ParThread());
   
   par.start();
   impar.start();
 }
}

class ParThread implements Runnable{
public ParThread(){

}

public void run()
{
  int i=0,num_alea=0;
 System.out.println("arranco el par");
 while(i<10)
 {
   num_alea=(int)(Math.random()*100+1);
   if(num_alea%2==0){
   System.out.println("Soy un Par y entre a la condicion"+num_alea);
   try
   {
     Thread.sleep(2000);
     System.out.println("Soy Un Par");   
   }catch(InterruptedException ex){
   }
   i++; 
 }
 }
 System.out.println("Termina El Par");
 }
}

class ImparThread implements Runnable{
public ImparThread(){

}

public void run()
{
  int i=0,num_alea_impar=0;
 System.out.println("arranco el impar");
 while(i<10)
 {
   num_alea_impar=(int)(Math.random()*100+1);
   if(num_alea_impar%2!=0){
   System.out.println("Soy un impar y entre a la condicion"+num_alea_impar);
   try
   {
     Thread.sleep(2000);
     System.out.println("Soy un Impar");   
   }catch(InterruptedException ex){
   }
   i++; 
 }
 }
 System.out.println("Termina el impar");
 }
}