import java.util.Scanner;
import java.util.Random;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
 
 

          int date[]  = new int[10];   
          int  count=0;
		for(int i=0;i<10;i++){
			date[i]=rnd.nextInt(100);
			if(date[i]%2==0){
			count++;	
		     }
		}
		
		 
		int	j = 0;
        while(j<3){
        	
         System.out.println("�вq���h�֭Ӱ���");
          int k=scn.nextInt();
          
         if(k==count){
        		System.out.println("���ߧA�q��F");
              break;
         
         }else{
        	 
        	 System.out.println("�A��F");}	
         
              j++;
              
        }
            System.out.println("�C������");
     
     
     
     
     
     
     
     
     
		
	}

}
