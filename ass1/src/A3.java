
import java.util.Scanner;
public class A3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J��Ϊ��W��?");
		Float L1 = scn.nextFloat();
		System.out.println("�п�J��Ϊ��U��?");
		Float L2 = scn.nextFloat();
		System.out.println("�п�J��Ϊ���?");
		Float H = scn.nextFloat();
		Float A = (L1+L2)*H/2;
		System.out.println("��Ϊ����n "+A);

	}

}
