public class Carrera{
	public static void main (String args[]){
		Thread tortuga1 = new Thread(new TortugaThread());
		Thread liebre1 = new Thread(new LiebreThread());
		
		tortuga1.start();
		liebre1.start();
	}
}

class LiebreThread implements Runnable{
	public void run(){
		int i = 0;
		System.out.println("arranco la liebre");
		
		while(i<5){
			try {
				Thread.sleep(2000);
				System.out.println("Soy la liebre");
			} catch ( InterruptedException ex) {

			}
			i++;
		}

		System.out.println("Termina la liebre");
	}
}

class TortugaThread implements Runnable{
	public void run(){
		int i = 0;
		System.out.println("arranco la tortuga");
		
		while(i<5){
			try {
				Thread.sleep(5000);
				System.out.println("Soy la tortuga");
			} catch ( InterruptedException ex) {
			}
			i++;
		}

		System.out.println("Termina la tortuga");
	}
}