import java.awt.*;
import java.awt.event.*;
import javax.swing.*;	

/**
* This class provides a small example of a program using a Swing GUI.
*/

public class PalindromeGUI {
	// instance variables for all the GUI components that may
	// be needed for one of the ActionListeners to do its job
	private JLabel instructionLabel, outputLabel;	
	private JTextField inputTextField;
	private JButton button;
	private JCheckBox iterative;
	private JLabel jlabChanged;
	private JLabel jlabSelected;
	// some constants to configure the GUI (avoid magic numbers)
	private static final int THE_WINDOW_WIDTH = 800;
	private static final int THE_WINDOW_HEIGHT = 600;
	private static final int THE_COLUMN_WIDTH = 20;
	
/**
* Constructs all the components for our GUI, puts them into
* a suitably configured JFrame, and makes the JFrame visible.
*/

	public PalindromeGUI() {
		// set up all the components of the GUI
		this.instructionLabel = new JLabel("Please enter something to check if it's a palindrome.");
		this.outputLabel = new JLabel(); // empty at first
		this.inputTextField = new JTextField(THE_COLUMN_WIDTH); // inputs can be longer!
		this.button = new JButton("Check!");
		
		this.button.addActionListener((ae) -> {
		// different event handler for our button: it has functionality, too!
		String s = this.inputTextField.getText();
		Boolean result = recursiveIsPalindrome(s);
		String input = result.toString();
		this.outputLabel.setText(input);
		});
		
		//create new empty checkbox labels
		jlabChanged = new JLabel("");
		jlabSelected = new JLabel("");
		
		//make checkboxes
		
		this.iterative = new JCheckBox("Iterative");
		
		
		//this.recursive.addItemListener(this); //bad design from book
		//this.iterative.addItemListener(this); //better create new ItemListener class and pass it as param

		// everything will be shown in a JFrame (it’s like a window)
		JFrame jFrame = new JFrame("Palindrome Checker!");
		jFrame.setLayout(new FlowLayout()); // sensible "default choice"
		jFrame.setSize(THE_WINDOW_WIDTH, THE_WINDOW_HEIGHT); // vary the constants for your needs
		// when the window closes, the program should terminate
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// now put the components into the JFrame in the desired order
		jFrame.add(this.instructionLabel);
		jFrame.add(this.inputTextField);
		jFrame.add(this.button);
		jFrame.add(this.outputLabel);
		jFrame.add(this.iterative);
		jFrame.add(this.jlabSelected);
		jFrame.add(this.jlabChanged);
		// actually show the JFrame
		jFrame.setVisible(true);
	}
	
	/* public void itemStateChanged(ItemEvent ie) {
		String = "";
		JCheckBox cb = (JCheckBox) ie.getItem();
		
		
		
	}
	 */
	
	//method for checking if isPalindrome
	
	public static boolean recursiveIsPalindrome(String s){
		// base case: 0 or 1 letters
        if (s.length() <= 1) {
            return true;
        }
		char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first != last) {
            return false; // no need to check further
        }
        String rest = s.substring(1, s.length() - 1);
        return recursiveIsPalindrome(rest);
    }
		
	//need to replace the code below with interative approach...
	public static boolean interativeIsPalindrome(String s){
		// base case: 0 or 1 letters
        if (s.length() <= 1) {
            return true;
        }
		char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first != last) {
            return false; // no need to check further
        }
        String rest = s.substring(1, s.length() - 1);
        return interativeIsPalindrome(rest);
    }	
	
	private class PalindromeActionListener{
		
		//code here
		
	}
		
	/**
	* Runs the Swing GUI for our example.
	*/
	
	
	public static void main(String[] args) {
		// use a lambda expression for the code to run by the GUI thread
		SwingUtilities.invokeLater(() -> new PalindromeGUI());
		}
		
}