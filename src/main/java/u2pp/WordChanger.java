package u2pp;
/**
 * Receives 2 words from the main class and changes them
 * @param word1 The first string to take a piece out of
 * @param start1 The starting index of the substring of word1
 * @param end1 The ending index of the substring of word1 (inclusive)
 * @param word2 The second string to take a piece out of
 * @param start2 The starting index of the substring of word2
 * @param end2 The ending index of the substring of word2 (inclusive)
 * @return returns modified string
 */
//takes a substring of 2 words, concatenates them, and returns the result.
public class WordChanger {
	static String word1;
	static int start1;
	static int end1;
	static String word2;
	static int start2;
	static int end2;
	 
	
	
	//wordChanger constructor takes a string, integer, integer, string, integer, integer
	public WordChanger(String w1, int s1, int e1, String w2, int s2, int e2){
		word1 = w1;
		start1 = s1;
		end1 = e1;
		
		word2 = w2;
		start2 = s2;
		end2 = e2;
	}
	//modifies the words provided by WordChange constructor
	public static String wordchange() {
		String str1 = word1.substring(start1,end1);
		String str2 = word2.substring(start2,end2);
		
		String str3 = str1 + str2;
		//System.out.println(str3);
		return str3;

	
				
	}

	


}
