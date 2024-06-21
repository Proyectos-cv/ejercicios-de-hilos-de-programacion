
///principal

public class numeros
{
   public static void main (String args[])
   {
      Thread par=new Thread(new imparesThread());
      Thread impar=new Thread(new paresThread());
      par.start();
      impar.start();
   }
}


///pares


class paresThread implements Runnable
{
   public paresThread()
   {

   }

   public void run()
   {
      int conta=0,ale=0;
      System.out.println("par inicia");
      while(conta<10)
      {
         ale=(int)(1+Math.random()*1000);
         if(ale%2==0)
         {
            System.out.println("Par encontrado: " + ale);
            /*try
            {
               Thread.sleep(1000);
               System.out.println("par aqui durmiendo");   
            }
            catch(InterruptedException ex)
            {
            }*/
            conta++; 
         }
      }
      System.out.println("fin del par");
   }
}


///impar

class imparesThread implements Runnable
{
    public imparesThread()
    {

    }

    public void run()
    {
       int conta=0,ale=0;
       System.out.println("impar inicia");
       while(conta<10)
       {
          ale=(int)(1+Math.random()*1000);
          if(ale%2!=0)
          {
             System.out.println("impar encontrado: " + ale);
             /*try
             {
                Thread.sleep(1000);
                System.out.println("impar aqui durmiendo");   
             }
             catch(InterruptedException ex)
             {
             }*/
             conta++; 
         }
      }
      System.out.println("fin del impar");
    }
}