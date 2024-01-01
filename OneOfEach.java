
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		boolean boy = false;
		boolean girl = false;
		int numOfChild = 0;
		while(!(boy && girl)) {
			if(Math.random() < 0.5){
				boy=true;
				System.out.print("b ");
			} else {
				girl = true;
				System.out.print("g ");
			}
			numOfChild++;
		}
		System.out.println("\nYou made it... and you now have " + numOfChild + " children.");
		}
	}

