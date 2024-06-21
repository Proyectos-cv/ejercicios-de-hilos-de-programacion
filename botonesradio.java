import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class botonesradio
{
   public static int divis=0;
   public static JFrame principal=new JFrame("factorial");

   //public static ButtonGroup grupo1=new ButtonGroup();

   public static JButton boton=new JButton("procesa");
   public static JLabel lab1=new JLabel("cuantos");
   public static JLabel lab2=new JLabel("resultado");
   public static JTextField caja1=new JTextField(5);
   //public static JTextField caja2=new JTextField("factorial");

   public static JRadioButton radio1=new JRadioButton("par",true);
   public static JRadioButton radio2=new JRadioButton("primo");
   public static JRadioButton radio3=new JRadioButton("impar no primo");
   public static ButtonGroup grupo1=new ButtonGroup();

   public static List lista1=new List();
   public static List lista2=new List();
   public static List lista3=new List();

   public static void pruebaPrimo(int ale)
   {
      int i;
      divis=0;
      for(i=1;i<=ale;i++)
      {
         if(ale%i==0)
         {
            divis++;
         }
      }
   }

   public static void procesa(int cuantos, int radio)
   {
      int cont=0, ale=0;
      switch(radio)
      {
         case 1: do
                 {
                    ale=(int)(100*Math.random()+1);
		    if (ale%2==0)
		    {
                       cont++;
		       lista1.add(String.valueOf(ale));
		    }
                 }
                 while(cont<=cuantos);
                 break;
        case 2: do
                 {
                    ale=(int)(100*Math.random()+1);
		    pruebaPrimo(ale);
		    if (divis==2)
		    {
                       cont++;
		       lista2.add(String.valueOf(ale));
		    }
                 }
                 while(cont<=cuantos);
                 break;
        case 3: do
                 {
                    ale=(int)(100*Math.random()+1);
                    pruebaPrimo(ale);
		    if ((ale%2!=0)&&(divis!=2))
		    {
                       cont++;
		       lista3.add(String.valueOf(ale));
		    }
                 }
                 while(cont<=cuantos);
                 break;
      }
   }

   public static void muestraprincipal() throws IOException
   {
      principal.setSize(100,100);
      principal.setLayout(new FlowLayout());
  
      //cargar logicamente los radios al grupo
 
      grupo1.add(radio1);
      grupo1.add(radio2);
      grupo1.add(radio3);

      principal.add(lab1);
      principal.add(caja1);

      principal.add(radio1);
      principal.add(radio2);
      principal.add(radio3);
      principal.add(boton);

      //principal.add(lab2);
      //principal.add(caja2);

      principal.add(lista1);
      principal.add(lista2);
      principal.add(lista3);

      principal.setVisible(true);

      boton.addMouseListener(new MouseAdapter()
      { public void mousePressed(MouseEvent e){
         //sacar de la caja de texto cuantos
         //sensar cual radio fue seleccionado
         int cuantos, radio=0;
 	 cuantos=Integer.parseInt(caja1.getText());
	 if (radio1.isSelected()==true)
         {
	    radio=1;
         } 
         else if(radio2.isSelected()==true)
         {
	    radio=2;
         }
         else if(radio3.isSelected()==true)
         {
	    radio=3;
         }
         procesa(cuantos, radio);
      }});

      principal.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent we){
         System.exit(0);
      }});
   }
public static void main(String arre[]) throws Exception
{
   botonesradio obj=new botonesradio();
   obj.muestraprincipal();
}
}




/* static JMenuBar
   JMenu
   jMenuItem */

/*  */
