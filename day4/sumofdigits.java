package week1.day4;

public class sumofdigits {
	public static void main(String[] args) {
		int x=1505;
		int sum=0;
		while(x>0) {
			int rem = x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println("Sum of digits is: " +sum);	
		}
	}
