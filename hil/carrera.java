public class carrera
{
   public static void main(String args[]) 
{
   Thread tortuga1= new Thread(new tortugaTread());
   Thread liebre1= new Thread(new liebreTread());

   tortuga1.start();
   liebre1.start();
}
}


class liebreThread implements Runnable{

	public void run(){
		int i=0;
		System.out.println("arranco la liebre");
		while(i<5){		
			try{
				Thread.sleep(2000);
				System.out.println("soy la liebre");
			}
			catch(InterruptedException ex){
			}
			i++;
	}
	System.out.println("termina la liebre");
	}
}

class tortugaThread implements Runnable{
   public void run(){
   int i=0;
   System.out.println("arranco la tortuga");
   while(i<5){
      try{
      Thread.sleep(2000);
      System.out.println("soy la tortuga");
      }
      catch(InterruptedException ex){
      }
      i++;
   }
   System.out.println("termina la tortuga");
}
}