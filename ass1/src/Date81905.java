import java.util.Scanner;

public class Date81905 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�@�ӥ����");
		int n = scn.nextInt();
		System.out.println("�п�J�i��(1~10)");
		int b = scn.nextInt();
		String str = "";
		while (n >= b) {
			str = Integer.toString(n % b) + str;
			n = n / b;
		}
		str = Integer.toString(n % b) + str;
		System.out.print(str);
	}

}
