import java.util.Scanner;
import java.util.Random;
public class Date8017a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
        Random rnd = new Random();
        int date[]  = new int[3];  
        System.out.println("�ӫ~����");
        date[1]=rnd.nextInt(999)+1;
        System.out.println(date[1]);
        date[2]=1000-date[1];
        System.out.println("�H1000���I��,��s"+date[2]+"��");
       // System.out.println("��^�ֿ̤����Ӽ�");
     int end,end2,end3,end4,end5,end6,end7,end8,end9,end10,end11;

          
           
           
        	end = date[2]/500;
        	end2= date[2]%500;
        	
        	end3= end2/100;
        	end4= end2%100;
        	
        	end5 = end4/50;
        	end6= end2%50;
        	
        	end7 = end6/10;
        	end8= end2%10;
        	
        	end9 = end8/5;
        	end10= end2%5;
        	
        	end11 = end10/1;
 
        	
        	 System.out.println("��"+end+"�i500");
        	 System.out.println("��"+end3+"�i100");
        	 System.out.println("��"+end5+"�T50");
        	 System.out.println("��"+end7+"�T10");
        	 System.out.println("��"+end9+"�T5");
        	 System.out.println("��"+end11+"�T1");
        

	}

}
