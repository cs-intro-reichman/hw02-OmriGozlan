/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
	int T = Integer.parseInt(args[0]);
	int TotalChild = 0;
	int TwoChild = 0;
	int ThreeChild = 0;
	int FourOrMoReChild = 0;
	for (int i=0 ; i<T; i++) {
		boolean boy = false;
		boolean girl = false;
		int numOfChild = 0;
		while (!(boy && girl)) {
			if (Math.random() < 0.5) {
				boy = true;
			} else {
				girl = true;
			}
			numOfChild++;
		}
		TotalChild += numOfChild;
		if (numOfChild == 2) {
			TwoChild++;
		} else if (numOfChild == 3) {
			ThreeChild++;
		} else {
			FourOrMoReChild++;
		}
	}
	double Average = (double) TotalChild/T;
	String max = "2 children";
	if (ThreeChild >= TwoChild){
		max = "3 children";
	} else if (FourOrMoReChild >= ThreeChild) {
		max = "4 or more children";
	}
		System.out.println("Average: " + Average + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoChild);
		System.out.println("Number of families with 3 children: " + ThreeChild);
		System.out.println("Number of families with 4 or more children: " + FourOrMoReChild);
		System.out.println("The most common number of children is " + max + ".");
	}
	}

