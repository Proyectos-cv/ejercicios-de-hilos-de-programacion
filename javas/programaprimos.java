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
public static void main(String bolsa[])
{
programaprimos objeto=new programaprimos();
objeto.funcion1();
}
}

