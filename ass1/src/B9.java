import java.util.Scanner;
public class B9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.print("�п�J�A�����Z");
		
		int A = scn.nextInt();
		
		if(A>100||A<0){
			System.out.println("��J�榡���~");
		}else{

		if(A<=100 && A>97){System.out.println("���Z���a�O: A+");}
		
		if(A<=97 && A>=94){System.out.println("���Z���a�O:A");}
		 
		if(A<94 && A>=90){System.out.println("���Z���a�O: A-");}
		 
		if(A<90 && A>=87){System.out.println("���Z���a�O: B+");}
		 
		if(A<87 && A>=84){System.out.println("���Z���a�O: B");}
		 
		if(A<83 && A>=80){System.out.println("���Z���a�O: B-");}
		 
		if(A<80 && A>=77){System.out.println("���Z���a�O: C+");}
		 
		if(A<77 && A>=74){System.out.println("���Z���a�O: C");}
		 
		if(A<74 && A>=70){System.out.println("���Z���a�O: C-");}
		
		if(A<70 && A>=67){System.out.println("���Z���a�O: D+");}
		 
		if(A<67 && A>=64){System.out.println("���Z���a�O: D");}
		
		if(A<64 && A>=60){System.out.println("���Z���a�O: D-");}
		
		if(A<60){System.out.println("E");}
		
		
		
		}
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
