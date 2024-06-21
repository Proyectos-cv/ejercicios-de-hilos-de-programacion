import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class factorial
{
   public static JFrame principal=new JFrame("factorial");
   public static JButton boton=new JButton("calcular");
   public static JLabel lab1=new JLabel("dame x");
   public static JLabel lab2=new JLabel("resultado");
   public static JTextField caja1=new JTextField(5);
   public static JTextField caja2=new JTextField("factorial");
   public static void muestraprincipal() throws IOException
   {
      principal.setSize(100,100);
      principal.setLayout(new FlowLayout());
 
      principal.add(lab1);
      principal.add(caja1);
      principal.add(lab2);
      principal.add(caja2);
      principal.add(boton);
      principal.setVisible(true);

      boton.addMouseListener(new MouseAdapter()
      { public void mousePressed(MouseEvent e){
         int num, facto=1;
         num=Integer.parseInt(caja1.getText());
         for(int i=1;i<=num;i++)
         {
            facto=facto*i;
         }
         caja2.setText(String.valueOf(facto));
      }});

      principal.addWindowListener(new WindowAdapter(){
      public void windowClosing(WindowEvent we){
         System.exit(0);
      }});
   }
public static void main(String arre[]) throws Exception
{
   factorial obj=new factorial();
   obj.muestraprincipal();
}
}