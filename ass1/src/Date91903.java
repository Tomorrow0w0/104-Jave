import java.util.Scanner;

public class Date91903 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入一個字串");
		String a=scn.nextLine();
		System.out.println(remove(a,' '));
		
	}

	public static String remove(String resource, char ch) {
		StringBuffer buffer = new StringBuffer();
		int position = 0;
		char currentChar;
		while (position < resource.length()) {
			currentChar = resource.charAt(position++);
			if (currentChar != ch)
				buffer.append(currentChar);
		}
		return buffer.toString();

	}

}
