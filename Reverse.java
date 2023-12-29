/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String s = args[0];
		String ans = "";
		for(int i=s.length()-1;i>=0 ; i--){
			ans = ans + s.charAt(i);
		}
		System.out.println(ans);
		int mid = (ans.length()/2);
		char res = ans.charAt(mid);
		System.out.println("The middle charactr is " + res);
	}
}
