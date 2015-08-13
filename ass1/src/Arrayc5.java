import java.util.Scanner;
import java.util.Random;

public class Arrayc5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		Random rnd = new Random();
		int data[] = new int[3];
		int i = 0;
		

		for(i=0;i<3;i++){
			data[i] = rnd.nextInt(100);
			System.out.println(data[i]);
		}
		
		
		int max=data[0];
		for(i=0;i<3;i++){
			max =Math.max(max,data[i]);
		}
		System.out.println("最大為"+max);
		
		int min=data[0];
		for(i=0;i<3;i++){
			min =Math.min(min,data[i]);
		}
		System.out.println("最小為"+min);
		
		
		
	}

}
