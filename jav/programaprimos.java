import java.io.*;

public class programaprimos
{
   public static int divis=0;
   public static int aleatorio=0;
   public void pruebaPrimo()
   {
      aleatorio=(int)(100*Math.random()+1);
      divis=0;
      for(int i=1;i<=aleatorio;i++)
      {
         if(aleatorio%i==0)
         {
            divis++;
         }
      }
   }
public void datos() //throws IOException
{
   int num=0,nu=5;
   while(num<3)
   {
      int suma=0;
      for(int j=1;j<nu;j++)
      {
         if(nu%j==0)
         {
            suma=suma+j;
         }
      }
      if(suma==nu)
      {
         System.out.println(nu);
         num++;
      }
      nu++;   
   }
}
//pedir datos de ingreso al usuario
   /*int x;
   BufferedReader entra=new BufferedReader(new InputStreamReader(System.in));
   
      System.out.println("dame x");
      x=Integer.parseInt(entra.readLine());
      System.out.println(x); */  
//}


public void funcion1()
{
   pruebaPrimo();
   if(divis==2)
   {
      System.out.println(aleatorio+" es primo");
   }
   else
   {
      System.out.println(aleatorio+" NO es primo");
   }
}

public void rango()throws IOException
{
   int x=0, y=0, dato=0,mayor=0,menor=0;
   BufferedReader entra=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("rango menor");
   x=Integer.parseInt(entra.readLine());
   //System.out.println(x);
   System.out.println("rango mayor");
   y=Integer.parseInt(entra.readLine());
   //System.out.println(y);

   for(int j=x;j<y;j++)
   {
      //System.out.println(j);
      int divis=0;
      for(int i=1;i<=j;i++)
      {
         if(j%i==0)
         {
            divis++;
         }
      }
   
      if(divis<=2)
      {
         dato++;
         if (dato>mayor)
         {
            mayor=dato;
         }
         
         if(dato<mayor && dato>=menor)
            //if(dato<menor)
         {
            menor=dato;
         }
         
      }
      else
      {
         dato=0;
      }   
   }
   System.out.println(menor);
   System.out.println(mayor);
}

public void longitud()throws IOException
{
   int x=0, y=0;
   BufferedReader entra=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("rango menor");
   x=Integer.parseInt(entra.readLine());
   
   System.out.println("rango mayor");
   y=Integer.parseInt(entra.readLine());
   
   for(int j=x;j<y;j++)
   {
      int divis=0;
      for(int i=1;i<=j;i++)
      {
         if(j%i==0)
         {
            divis++;
         }
      }
   
      if(divis<=2)
      {
         System.out.println(j);
      }
   }
}


public void formula()throws IOException
{
int n=0,x=1;
   BufferedReader entra=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("valor de n ");
   n=Integer.parseInt(entra.readLine()); 
   while(x<=n)
   {
      int dato=0,primo=0,divis=0;
      primo=x*x-x+41;
      
      for(int i=1;i<=primo;i++)
      {
         if(primo%i==0)
         {
            divis++;
         }
      }
      if(divis<=2)
      {
         System.out.println(primo);
         x++;
      }
      else
      {
         x=x+n;
      }
   }
}

public void among()throws IOException
{
   int x=0, y=0, dato=0,mayor=0;
   BufferedReader entra=new BufferedReader(new InputStreamReader(System.in));
   System.out.println("rango menor");
   x=Integer.parseInt(entra.readLine());
  
   System.out.println("rango mayor");
   y=Integer.parseInt(entra.readLine());
   

   for(int j=x;j<y;j++)
   {
      //System.out.println(j);
      int divis=0;
      for(int i=1;i<=j;i++)
      {
         if(j%i==0)
         {
            divis++;
         }
      }
   
      if(divis>2)
      {
         dato++;
         if (dato>mayor)
         {
            mayor=dato;
         } 
      }
      else
      {
         dato=0;
      }   
   }
   System.out.println(mayor);
}



public static void main(String bolsa[]) throws Exception
{
programaprimos objeto=new programaprimos();
objeto.among();
}
}

