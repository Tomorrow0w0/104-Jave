import java.util.Scanner;
public class B3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		System.out.println("�п�J�T�������a= ");
		Float a = scn.nextFloat();
		System.out.println("�п�J�T�������b= ");
		Float b = scn.nextFloat();
		System.out.println("�п�J�T�������c= ");
		Float c = scn.nextFloat();
		
	if(a<=b && b<=c){	
		
		if(a*a+b*b < c*c){System.out.println(" �w���T����");}
		if(a*a+b*b == c*c){System.out.println("�����T����");}
		if(a*a+b*b > c*c){System.out.println(" �U���T����");}
		
	}else{System.out.println("�L���T����");}
		
		
		
		
		
		
		
		
		
		

	}

}
