import java.util.Scanner;
import java.util.Random;

public class Array3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int date[] = new int[10];
		int i = 0;
		int count = 0;
		boolean flag = false;
		for (i = 0; i < 10; i++) {
			for (int v = i + 1; v < 10; v++) {
				while (i < 10) {
					date[i] = rnd.nextInt(100);
					flag = false;
					for (int a = 0; a < i; a++) {
						if (date[i] == date[a]) {
							flag = true;
						}
					}
					if (flag == false) {
						if (date[i] % 2 == 0) {
							count++;
						}
						i++;
					}
				}
			}
		}
		for (i = 0; i < 10; i++) {
			for (int v = i + 1; v < 10; v++) {

				if (date[i] > date[v]) {
					int v1 = date[i];
					date[i] = date[v];
					date[v] = v1;
				}

			}

		}
		int j = 0;
		while (j < 3) {
			System.out.println("�вq���h�֭Ӱ���");
			int k = scn.nextInt();
			if (k == count) {
				System.out.println("���ߧA�q��F");
				for (i = 0; i < 10; i++) {
					System.out.println(date[i] + "\t");
				}
				break;
			} else {
				j++;
				if (j == 3) {
					System.out.println("�A��F");
					System.out.println("�C������");

				} else {
					System.out.println("�ЦA��");
				}

			}

		}
		for (i = 0; i < 10; i++) {
			System.out.println(date[i] + "\t");
		}
	}
}