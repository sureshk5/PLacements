package newasd;

public class StringPart {
	public static void main(String[] args) {

		String str="Suresh";
		char c='e';
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c) {
				continue;
			}
			System.out.print(str.charAt(i));
		}
	}
}
