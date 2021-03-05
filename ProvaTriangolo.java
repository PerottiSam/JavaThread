public class ProvaTriangolo {
	public static void main(String args[]){
		// metodo 1
		Runnable run_tr1=new Triangolo("tin",5);
		Thread thr1 = new Thread(run_tr1);

		thr1.start();

		// metodo 2
		Thread thr2 = new Thread(new Triangolo("ton",5)); 

		thr2.start();

		// metodo 3
		new Thread(new Triangolo("tan",5)).start();
	}
}