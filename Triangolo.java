  
public class Triangolo implements Runnable {
	String suono;
	int volte;
	int i = 0; 
	public Triangolo(String suono, int volte){
		this.suono=suono;
		this.volte=volte;
	}

	public synchronized void check(){
		try{
			if(suono.equals("tin")){
				System.out.println((i+1)+" "+suono);
				i++;
				wait(600);
			}else{
				if(suono.equals("ton")){
					wait(200);
					System.out.println((i+1)+" "+suono);
					i++;
					wait(400);
				}else{
					if(suono.equals("tan")){
						wait(400);
						System.out.println((i+1)+" "+suono);
						i++;
						wait(200);
					}
				}
			}
		}catch(Exception e){}
	}

	public void run(){
		while(i<volte){
			check();
		}
	}
}