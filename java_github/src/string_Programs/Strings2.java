package string_Programs;

public class Strings2 {

	public static void main(String[] args) {
		
		StringBuilder sb= new StringBuilder("SNeha");
		System.out.println(sb);
		
		//char at index 0
		System.out.println(sb.charAt(1));
		
		// set char at index 0
		sb.setCharAt(0, 'P');
		System.out.println(sb);

		sb.insert(2, 'i');
		System.out.println(sb);
		
		// delete the extra i 
		sb.delete(2, 3);
		System.out.println(sb);
		
		//append - add string to the end 
		sb.append(" ");
		sb.append("P");
		sb.append("a");
		sb.append("t");
		sb.append("h");
		sb.append("a");
		sb.append("k");
		System.out.println(sb);
		
	}

}
