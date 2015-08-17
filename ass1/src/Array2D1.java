import java.util.Scanner;
public class Array2D1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入有幾位學生");
		int n=scn.nextInt();
		int i =0;
		float data[][]=new float[n][7];
		String name[] = new String[n];
		
		for(i=0;i<n;i++){
			System.out.println("請輸入第"+(i+1)+"位學生的名字");
			name[i]=scn.next();
			System.out.println("請輸入三科成績");
			data[i][0]=scn.nextFloat();
            data[i][1]=scn.nextFloat();
			data[i][2]=scn.nextFloat();
			data[i][3]=(data[i][0]+data[i][1]+data[i][2])/3;
			 
       }
		
		System.out.println("全班平均");
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
		System.out.println("不及格人數"+m);
		
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
		 
		
		System.out.println("全班成績如下");
			for( i=0;i<n;i++){
			 System.out.println(name[i]+" "+data[i][0]+" "+data[i][1]+" "+data[i][2]+"個人平均 "+data[i][3]);
				    
				   
			    }
		
	System.out.println("全班平均最高 "+max+"全班平均最低 "+min);
		
		
		
		
	}

}
