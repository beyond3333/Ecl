import java.until.Scanner
public class Star {
	
	
	
	
	public static void main(String []args) {

	
		
		
System.out.println("홀수입력");
Scanner sc = new Scanner(System.in);
int num = sc.nextInt();
for (int i=0; i<num;i++) {
	for(int j=0; j<num;j++)
	{
		if (i<=num/2)
		{
			if (i+j<=num/2-1)
				System.out.print(" ");
			else if (j-i>=num/2+1)
			    System.out.print(" ");
			else
				System.out.print("*");
		}
		
		else if (1>num/2)
		{
			if (i-j>=num/2+1)
				System.out.print(" ");
			else if (j+i>=num/2*3+1)
			    System.out.print(" ");
			else
				System.out.print("*");
		}
		}
	
	System.out.println();
	}
}
	
	
	
	}
		
		
	
	for(int i=0; i)	
		

