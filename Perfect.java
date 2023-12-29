/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		int num = Integer.parseInt(args[0]);
		int count = 1;
		String ans = num + " is a perfect number since " + num + " = 1" ;
		for (int i=2; i<num; i++){
			if(num%i == 0){
				ans = ans + " + " + i;
				count +=i;
			}
		} if(num == count){
			System.out.println(ans);
		} else {
			System.out.println(num + " is not a perfect number");
		}

	}
}
