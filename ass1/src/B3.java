import java.util.Scanner;
public class B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("請輸入三角形邊長a= ");
		Float a = scn.nextFloat();
		System.out.println("請輸入三角形邊長b= ");
		Float b = scn.nextFloat();
		System.out.println("請輸入三角形邊長c= ");
		Float c = scn.nextFloat();
		
	if(a<=b && b<=c){	
		
		if(a*a+b*b < c*c){System.out.println(" 鈍角三角形");}
		if(a*a+b*b == c*c){System.out.println("直角三角形");}
		if(a*a+b*b > c*c){System.out.println(" 銳角三角形");}
		
	}else{System.out.println("無此三角形");}
		
		
		
		
		
		
		
		
		
		

	}

}
