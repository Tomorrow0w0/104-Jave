import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J����");
		int s = scn.nextInt();
		B user[] = new B[s];
		System.out.println("�п�J�W�ټƶq����");
		for (int i = 0; i < s; i++) {
			String a = scn.next();
			int b = scn.nextInt();
			int c = scn.nextInt();
			user[i] = new B(a, b, c);
		}

		String str = "abcdefgabc"; 
		System.out.println("�п�J����:�a�}      �q��[��a�q�ܫe��+(0#)]  �ǯu");
		A store = new A(scn.next(),str=scn.next(),scn.next());
		 if(str.matches("[0-9]{4}[0-9]{6}")) 
	            System.out.println("�q�ܮ榡���T"); 
	        else 
	            System.out.println("�q�ܮ榡���~");
		System.out.println("             �o��(�Ȭw��u��)");
		System.out.println("�a�}:" + store.address);
		System.out.println("�q��:" + store.tel);
		System.out.println("�ǯu:" + store.fax);
		System.out.println("�ӫ~����\t�ƶq\t���\t�p�p");
		for (int i = 0; i < s; i++) {
			System.out.println(user[i].name + "\t" + user[i].number + "\t"
					+ user[i].prise + "\t" + user[i].number * user[i].prise);
		}
		float total = 0;
		for (int i = 0; i < s; i++) {
			total = total + user[i].number * user[i].prise;
		}
		System.out.println("�X�p"+total);
	}
}

class A {
	public String address;
	public String tel;
	public String fax;

	public A(String add, String t, String f) {
		address = add;
		tel = t;
		fax = f;
	}
}

class B {
	public int number;
	public String name;
	public float prise;

	public B(String name1, int num, float pri) {
		number = num;
		name = name1;
		prise = pri;
	}

}
