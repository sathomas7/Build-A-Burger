import java.util.Stack;

/**
 * @author Sam Thomas
 * Email: sathomas7@dmacc.edu
 * 
 * This class is the order for a customer in the Burger Restaurant program
 */
public class BuildOrder {
	//declares the max size of the burger
	//12 items can be added to the burger before the user insn't allowed to add more
	//The 13 max is to account for the bottom bun being added on creation
	final int BURGER_MAX_SIZE = 13;
	
	//creates the stack so a burger can be built 
	Stack<String> customBurger;
	
	//declares a string so the items like drink and fries can be added to this class
	String[] extra = new String[20];
	
	/**
	 * Default constructor
	 */
	public BuildOrder() {
		customBurger = new Stack<String>();
		customBurger.push("Bottom Bun");
	}
	
	
	/**
	 * I realized to late that i could use a string to heavily reduce the length of the if statement
	 * since I'm using buttons instead of input.
	 * This would be something i would change down the line but i didn't have the time to convert it when i started working with the GUI
	 * 
	 * This section is the build a burger method
	 * But this method takes in a number and adds the ingredient to the burger that matches the number
	 * @param ingredient
	 */
	public void addIngredientString(int ingredient) {
		if (ingredient == 22) {
			customBurger.push("Top Bun");
		}
		
		if (customBurger.size() <= BURGER_MAX_SIZE) {
			
			if (ingredient == 1) {
				customBurger.push("Meat Patty 1/4");
			}
			else if (ingredient == 2) {
				customBurger.push("Meat Patty 1/3");
			}
			else if (ingredient == 3) {
				customBurger.push("Meat Patty 1/2");
			}
			else if (ingredient == 4) {
				customBurger.push("Vegan Patty 1/4");
			}
			else if (ingredient == 5) {
				customBurger.push("Vegan Patty 1/3");
			}
			else if (ingredient == 6) {
				customBurger.push("Vegan Patty 1/2");
			}
			else if (ingredient == 7) {
				customBurger.push("Bacon");
			}
			else if (ingredient == 8) {
				customBurger.push("Lettuce");
			}
			else if (ingredient == 9) {
				customBurger.push("Tomatoes");
			}
			else if (ingredient == 10) {
				customBurger.push("Cheese");
			}
			else if (ingredient == 11) {
				customBurger.push("Onions");
			}
			else if (ingredient == 12) {
				customBurger.push("Jalapenos");
			}
			else if (ingredient == 13) {
				customBurger.push("Grilled Mushrooms");
			}
			else if (ingredient == 14) {
				customBurger.push("Green Onions");
			}
			else if (ingredient == 15) {
				customBurger.push("Caramel Onions");
			}
			else if (ingredient == 16) {
				customBurger.push("Ketchup");
			}
			else if (ingredient == 17) {
				customBurger.push("Mustard");
			}
			else if (ingredient == 18) {
				customBurger.push("Mayo");
			}
			else if (ingredient == 19) {
				customBurger.push("BBQ");
			}
			else if (ingredient == 20) {
				customBurger.push("Sriracha");
			}
			else if (ingredient == 21) {
				customBurger.push("Hot Sauce");
			}
		}
		else {
			System.out.println("You can't add any more ingredients to this burger");
		}
	}
	
	/**
	 * This is where i realized i could simplify the code so there isn't a ton of if statements
	 * 
	 * This method takes in a string and adds it to the extra string
	 * @param item
	 */
	public void addExtraItems(String item) {
		for(int i = 0; i < extra.length; i++) {
			if(extra[i] == null) {
				extra[i] = item;
				break;
			}
		}
	}

	/**
	 * Prints the stack by popping out the items on the burger
	 */
	public void printStackList() {
		int iterate = customBurger.size();
		
		for(int i = 0; i < iterate; i++) {
			System.out.println(customBurger.pop());
		}
	}
	
	
	/**
	 * prints the extra items string
	 */
	public void printExtraItems() {
		
		for(int i = 0; i <extra.length; i++) {
			if(extra[i] != null) {
				System.out.println(extra[i]);
			}
		}
	}
}
