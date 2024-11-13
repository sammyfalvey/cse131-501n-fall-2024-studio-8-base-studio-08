package studio8;

public class MultipleChoiceQuestion extends Question {
	
	private String[] choices;  
	
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		//FIXME
		super(prompt, answer, points); 
		this.choices = choices;
	
		//Call the super class constructor, then create and set
		//instance variables for any values that aren't handled
		//by the base class
	}
	     
	
	public void displayPrompt() {
	    // Call the method from the base class to display the prompt
	    super.displayPrompt();  // assuming the base class method is displayPrompt() and displays the prompt message
	    
	    // Now, display the choices
	    String[] choices = {"0", "2", "3"}; // Example choices, you can customize this list
	    for (int i = 0; i < choices.length; i++) {
	        System.out.println((i + 1) + ". " + choices[i]);
	    }
	}
	
	public static void main(String[] args) {
		String[] choices = {"seven", "nine", "eight", "six"};
		Question multipleChoice = new MultipleChoiceQuestion("What studio is this?", "3", 1, choices);
		multipleChoice.displayPrompt();
		System.out.println(multipleChoice.checkAnswer("hi"));//wrong
		System.out.println(multipleChoice.checkAnswer("1"));//wrong
		System.out.println(multipleChoice.checkAnswer("3"));//right
	}

}
