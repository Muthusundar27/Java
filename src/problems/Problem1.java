package problems;

public class Problem1 {
 
	public static void main(String[] args) {
		String word = "abcdefd";
		char	ch = 'd';
		
		String rev ="";
        for(int i =0; i<=word.length()-1; i++) {
				if(word.charAt(i)==ch) {
					for (int j=i; j>=0; j--) {
						rev += word.charAt(j);
					}
                   break;
                    
				}
				
					} System.out.println(rev);
	}
}
