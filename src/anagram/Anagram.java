package anagram;
import java.util.Arrays;
public class Anagram {
public static void main(String[] args) {
	String x = "He is abcd";
	String y = "acbd si eh";
	x = x.replace("\\s", "");
	y= y.replace("\\s", "");
	x= x.toLowerCase();
	y= y.toLowerCase();
	char[] a= x.toCharArray();
	char []b = y.toCharArray();
	Arrays.sort(a);
	
	
	
}

}
