import java.util.Scanner;
public class Array2D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("�п�J���X��ǥ�");
		int n=scn.nextInt();
		int i =0;
		float data[][]=new float[n][7];
		String name[] = new String[n];
		
		for(i=0;i<n;i++){
			System.out.println("�п�J��"+(i+1)+"��ǥͪ��W�r");
			name[i]=scn.next();
			System.out.println("�п�J�T�즨�Z");
			data[i][0]=scn.nextFloat();
            data[i][1]=scn.nextFloat();
			data[i][2]=scn.nextFloat();
			data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
			 
       }
		
		System.out.println("���Z����");
		int end=0;
		for(i=0;i<n;i++){
			end+=data[i][3];
		}
		System.out.println(end/n);
		
		int m=0;
		for(i=0;i<n;i++){
			if(data[i][3]<60){
				m++;
			}
		}
		System.out.println("���ή�H��"+m);
		
		float max;
		max=data[0][0];
		for (i=0;i<n;i++){
		  if (data[i][3]>max){
		     max=data[i][3];

		    }
		  
		}
		
		float min;
		min=data[0][0];
		for (i=0;i<n;i++){
		  if (data[i][3]<min){
		     min=data[i][3];

		    }
		  
		}
		 
		
		System.out.println("���Z���Z�p�U");
			for( i=0;i<n;i++){
			 System.out.println(name[i]+" "+data[i][0]+" "+data[i][1]+" "+data[i][2]+"�ӤH���� "+data[i][3]);
				    
				   
			    }
		
	System.out.println("���Z�����̰� "+max+"���Z�����̧C "+min);
		
		
		
		
	}

}
