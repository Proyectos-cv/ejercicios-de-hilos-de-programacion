import java.io.*;

public class archivos
{
public static BufferedReader entra=new BufferedReader
(new InputStreamReader(System.in));
   public static String nombre;
   public static int edad=0;
   public static Double promedio=0.0;
   public void llena()throws IOException
   {

      try
      {
         FileOutputStream a=new FileOutputStream("nombre.dat",true);
         DataOutputStream b=new DataOutputStream(a);
         //metodos de escritura 
         //writeUTF(cadenas)
         //writeChar,int,double(caracteres)
         for(int i=1;i<=3;i++)
         {
            System.out.println("dame el nombre");
            nombre=entra.readLine();
            b.writeUTF(nombre);

            System.out.println("dame la edad");
            edad= Integer.parseInt(entra.readLine());
            b.writeInt(edad);

            System.out.println("dame el promedio");
            promedio=Double.parseDouble(entra.readLine());
            b.writeDouble(promedio);
         }
         //cerrar archivo
         b.close();         
      }
      catch(IOException exc)
      {
      }
   }
   public void muestra()throws IOException
   {
    try
      {
      FileInputStream a=new FileInputStream("nombre.dat");
      DataInputStream b=new DataInputStream(a);
      //recorrer el archivo hasta el fin del archivo
      boolean mas=true;
      while(mas)
      {
         nombre=b.readUTF();
         edad=b.readInt();
         promedio=b.readDouble();
         System.out.println("nombre="+nombre+" edad="+edad+" promedio="+promedio);
      }
      b.close();
System.out.println("aqui");
    }
      catch(IOException exc)
      {
      }
   }


public static void main(String bolsa[])throws Exception
{
archivos objeto=new archivos();
//objeto.llena();
objeto.muestra();
}
}
