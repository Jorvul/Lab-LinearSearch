
public class LinearSearch {
	
	public static void main(String[] args) {
		char letter = 'm';
		char [] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
	's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		LinearSearch ls = new LinearSearch();
		System.out.println(letters.length);
		System.out.println(ls.findLetter(letter, letters));
		System.out.println(ls.findLetterBackwards(letter, letters));
		System.out.println(ls.findLetterFromMiddle(letter, letters));
	}
	
	public int findLetterBackwards(char target, char [] data) {
		for(int i = data.length - 1; i >= 0;i--) {
			char temp = data[i];
			if(temp == target) {
				return i;
			}
		}
		return -1;
	}
	
	public  int findLetter(char target, char [] data) {
		for(int i = 0; i < data.length; i++) {
			char temp = data[i];
			if(temp == target) {
				return i;
			} 
			
		}
		return -1;
	}
	
	public  int findLetterFromMiddle(char target, char [] data) {
		char [] firstHalf = new char[data.length / 2];
		char [] secondHalf = new char[data.length/2];
		for(int i = 0; i < firstHalf.length; i++) {
			  firstHalf[i] = data[i];
		}
		for(int i = 0; i < secondHalf.length;i++) {
			secondHalf[i] = data[i + firstHalf.length];
		}
		int result1 = findLetter(target, firstHalf);
		int result2 = findLetterBackwards(target, secondHalf);
		
		if(result1 != -1) return result1;
		else if(result2 != -1) return result2 + firstHalf.length;
		else return -1;
	}
	

}