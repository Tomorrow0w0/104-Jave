import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J����");
		int s = scn.nextInt();
		item user[] = new item[s];
		System.out.println("�п�J�W�ټƶq����");
		for (int i = 0; i < s; i++) {
			String a = scn.next();
			int b = scn.nextInt();
			int c = scn.nextInt();
			user[i] = new item(a, b, c);
		}
		invoice store = new invoice("�x�������p�Ϭh�׸�500��", "04-23323456 #6101",
				"04-23233876");
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

class invoice {
	public String address;
	public String tel;
	public String fax;

	public invoice(String add1, String tel1, String fax1) {
		address = add1;
		tel = tel1;
		fax = fax1;
	}
}

class item {
	public int number;
	public String name;
	public float prise;

	public item(String name1, int num, float pri) {
		number = num;
		name = name1;
		prise = pri;
	}

}
