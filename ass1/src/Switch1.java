import java.util.Scanner;
public class Switch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J�P�� (1~7)");
		int A = scn.nextInt();
		String str="";
		if(A>=1 && A<=7){
			switch(A){
			case 1:
				str ="Monday"; break;
			case 2:
				str ="Tuesday"; break;
			case 3:
				str ="Wednesday"; break;
			case 4:
				str ="Thursday"; break;
			case 5:
				str ="Friday"; break;
			case 6:
				str ="Saturday"; break;
			case 7:
				str ="Sunday"; break;
			    }
			
			System.out.println("�P��"+A+"���^�嬰"+str);
		
		}else{System.out.println("�S���o�ӬP��");}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
