import java.util.Scanner;
public class While1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		
		
		double s=20000;
		int m=1;
		while(s<1100000){
		 
			s+=s*0.15;
            m++;
            System.out.println(m+"�p�ɫB�q"+s);   
       }
		    System.out.print(m+"���w����");
		
		
		
	}

}
