/**
 *  Generates and prints random integers in the range [0,10),
 *  as long as they form a non-decreasing sequence.
 */
public class InOrder {
	public static void main (String[] args) {
	boolean inOrder = true;
	int prev = -1;
	while (inOrder){
		int current = (int) (10*Math.random());
		if (current >= prev){
			System.out.print(current + " ");
			prev = current;
		}else {
			inOrder=false;
		}
	}
	}
}
