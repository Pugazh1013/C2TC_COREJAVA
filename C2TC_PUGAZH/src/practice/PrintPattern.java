package practice;

public class PrintPattern {

	public static void print(int n) {
		int i,j;
		for(i =1 ;i<n;i++) {
			for(j=1; j<n; j++) {
				if(i==1||j==1||i==n-1||j==n-1) {
					System.out.print(j);
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println();
			
		}

	}
	public static void main(String args[]) {
		int n=4;
		print(n);
		
	}

}
