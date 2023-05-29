import java.util.Scanner;

public class RevStrWithoutRevAWord {

	/*public static void main(String[] args) {
		String s="Ram and Shyam";
		String w="";
		s=s.trim();
		char ch;
		for(int i=s.length()-1;i>=0;i--)
		{
			ch=s.charAt(i);
			if(ch!=' ') {
				w= ch+w;
					System.out.print(w);
			}
			else
				System.out.print(w+" ");
			w="";
		}
		

	}
*/
	public static String reverse_str_word(String input_sentence) {
	    if (input_sentence == null) {
	      throw new IllegalArgumentException("Input param can't be null.");
	    }
	    StringBuilder stringBuilder = new StringBuilder();
	    String[] words = input_sentence.split(" ");
	    for (int i = words.length - 1; i >= 0; i--) {
	      stringBuilder.append(words[i]);
	      if (i != 0) {
	        stringBuilder.append(" ");
	      }
	    }
	    return stringBuilder.toString();
	  }
	   public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input a string: ");
			String input = scanner.nextLine();
			System.out.println("\nResult: " + reverse_str_word(input));		
			}
}
