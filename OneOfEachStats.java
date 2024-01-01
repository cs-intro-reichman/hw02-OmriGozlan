import java.util.Random;
/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get two command-line arguments: an int value
 * 	that determines how many families to simulate, and an int value
 *  that serves as the seed of the random numbers generated by the program.
 *  Example usage: % java OneOfEachStats 1000 1
 */
public class OneOfEachStats {
	public static void main (String[] args) {
		// Gets the two command-line arguments
		int T = Integer.parseInt(args[0]);
		int seed = Integer.parseInt(args[1]);
		// Initailizes a random numbers generator with the given seed value
        Random generator = new Random(seed);
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

//// In the previous version of this program, you used a statement like:
//// double rnd = Math.random();
//// Where "rnd" is the variable that stores the generated random value.
//// In this version of the program, replace this statement with:
//// double rnd = generator.nextDouble();
//// This statement will generate a random value in the range [0,1),
//// just like you had in the previous version, except that the
//// randomization will be based on the given seed.
//// This is the only change that you have to do in the program.