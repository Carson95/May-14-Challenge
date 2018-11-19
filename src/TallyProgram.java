import java.util.HashMap;
import java.util.Map;

public class TallyProgram {
	
	private static Map<Character, Integer> scores = new HashMap<>();
	private static String scoreInput = "EbAAdbBEaBaaBBdAccbeebaec";
	
	public static void main (String args[]) {
		
	//set the starting scores
	scores.put('a', 0);
	scores.put('b', 0);
	scores.put('c', 0);
	scores.put('d', 0);
	scores.put('e', 0);
	
	char[] chars = scoreInput.toCharArray();
	
	for (char c : chars) {
		if (Character.isUpperCase(c)) {
			scores.replace(Character.toLowerCase(c), scores.get(Character.toLowerCase(c)) - 1);
		} else {
			scores.replace(c, scores.get(c) + 1);
		}
	}	
	
	System.out.println("player a scored: " + scores.get('a'));
	System.out.println("player b scored: " + scores.get('b'));
	System.out.println("player c scored: " + scores.get('c'));
	System.out.println("player d scored: " + scores.get('d'));
	System.out.println("player e scored: " + scores.get('e'));
	
	}

}
