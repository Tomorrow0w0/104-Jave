
import java.util.Scanner;
public class A13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�ɨ��H");
		int A = scn.nextInt();		
		System.out.print("�п�J�b�Z�H");
		int W = scn.nextInt();			
		System.out.print("�п�J���L�ؤo�H");
		int R = scn.nextInt();			
		if (A>43 && W>130 && R==12)
			System.out.print("����X��I�i�R�I");	
		else
			System.out.print("���󤣦X��I���n�R�I");
	}

}
