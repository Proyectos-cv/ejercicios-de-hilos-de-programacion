import java.io.*;

public class ejemploarreglo
{
   public ejemploarreglo()
   {
      //inizializar
      arreglo=new int[100];  
   }
   public void llena()
   {
      int ale=0;
      for (int i=0; i<=99;i++)
      {
         ale=(int)(100*Math.random()+1);
         arreglo[i]=ale;
         
      } 
   }
   public static void main(String a[])
   {
      ejemploarreglo obj=new ejemploarreglo();  
   }
}