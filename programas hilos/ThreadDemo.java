class ThreadDemo implements Runnable  {
	ThreadDemo()  {
		Thread ct = Thread.currentThread();
		Thread t = new Thread(this, "demo Thread");
		System.out.println("hilo actual: " + ct);
		System.out.println("Hilo creado: " + t);
		t.start();
		try  {
			Thread.sleep(3000);
		}  catch (InterruptedException e)  {
		   	System.out.println("Interrumpido");
		}
		System.out.println("!saliendo del hilo main");
    	}
    	public void run()  {
		try  {
			for (int y = 5; y > 0; y--)  {
				System.out.println(" " + y);
				Thread.sleep(1000);
		 	}
		}  catch (InterruptedException e)  {
			System.out.println("hijo interrumpido");
		}
		System.out.println("saliendo del hilo hijo");
    	}
    	public static void main (String args [])  {
		new ThreadDemo();
	}
}