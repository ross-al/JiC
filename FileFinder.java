import java.io.*;

public class FileFinder {
	
	public static void main(String[] args){
		FileFinder myFinder = new FileFinder();
		myFinder.launch();
	}
	
	private void launch(){
		System.out.println("Please enter a file name: ");
		String input = System.console().readLine();
		File file = new File(input);
		try (BufferedReader in = new BufferedReader(new FileReader(file))){
			String line;
			while ((line = in.readLine()) != null){
				System.out.println(line);
			}
		} catch (FileNotFoundException ex) {
				System.out.println("File " + file + "does not exist.");
		} catch (IOException ex) {
			ex.printStackTrace();
		}

	}
}