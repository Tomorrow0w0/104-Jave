import java.util.Scanner;

public class Class1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入次數");
		int s = scn.nextInt();
		B user[] = new B[s];
		System.out.println("請輸入名稱數量價格");
		for (int i = 0; i < s; i++) {
			String a = scn.next();
			int b = scn.nextInt();
			int c = scn.nextInt();
			user[i] = new B(a, b, c);
		}

		String str = "abcdefgabc"; 
		System.out.println("請輸入本店:地址      電話[住家電話前面+(0#)]  傳真");
		A store = new A(scn.next(),str=scn.next(),scn.next());
		 if(str.matches("[0-9]{4}[0-9]{6}")) 
	            System.out.println("電話格式正確"); 
	        else 
	            System.out.println("電話格式錯誤");
		System.out.println("             發票(亞洲資工站)");
		System.out.println("地址:" + store.address);
		System.out.println("電話:" + store.tel);
		System.out.println("傳真:" + store.fax);
		System.out.println("商品項目\t數量\t單價\t小計");
		for (int i = 0; i < s; i++) {
			System.out.println(user[i].name + "\t" + user[i].number + "\t"
					+ user[i].prise + "\t" + user[i].number * user[i].prise);
		}
		float total = 0;
		for (int i = 0; i < s; i++) {
			total = total + user[i].number * user[i].prise;
		}
		System.out.println("合計"+total);
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
