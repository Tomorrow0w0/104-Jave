import java.util.Scanner;
public class Array2D3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		System.out.println("請輸入A為MxP矩陣");
		int M=scn.nextInt();
		int P=scn.nextInt();
		System.out.println("請輸入B為PxN矩陣");
		int N=scn.nextInt();
        int a[][]= new int[M][P];
        int b[][]= new int[P][N];
        int c[][]= new int[M][N];
        int i =0; int j =0; int k =0;
        System.out.println("請輸入A矩陣的數字");
        for(i=0;i<M;i++){
        	for(j=0;j<P;j++){
        		a[i][j] = scn.nextInt();
        	}
        }
        
        System.out.println("請輸入B矩陣的數字");
        for(k=0;k<N;k++){
        	for(j=0;j<P;j++){
        		b[k][j] = scn.nextInt();
        	}
        }
        
        for(i=0;i<M;i++){
        	for(k=0;k<N;k++){
        		for(j=0;j<P;j++){
        			c[j][k]=c[j][k]+a[i][j]*b[j][k];
        		}
        		System.out.print(c[j][k]+"  ");
        	}
        	System.out.println(" ");
        }
        
        
        
        
        
        
        
        
        
	}

}
