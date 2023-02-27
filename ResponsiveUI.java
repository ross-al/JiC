//need to add a way queue to only read and print completed tasks
//e.g. can synchronize add() and remove() methods
//currently this programme will interupt the user input calls

public class ResponsiveUI implements Runnable {
	private int task;
	private int time;
	
	public ResponsiveUI(int task, int time){
		this.task = task;
		this.time = time;
	}
	
	
	@Override
	public void run() {
			sleep();
			System.out.println("Finished tasks: " +task);				
	} 

	
	private void sleep(){
		try {
			Thread.sleep(time);		
					
		} catch (InterruptedException ex) {
			ex.printStackTrace(); // Nothing to do, sleep a bit less
		}
	}


	//runs for 10 times
	public static void main(String args[]) {
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter the duration (in ms) of task " + i + ": ");
			String input = System.console().readLine();
			int ms = Integer.parseInt(input);
			Runnable r = new ResponsiveUI(i, ms);
			Thread t = new Thread(r);
			t.start();
		}
	}
	
}