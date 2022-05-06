package week1.day4;

public class amstrongnumber {
	public static void main(String[] args) {
		int x=123;
		int sum=0;
		int originalValue=x;
		while(x>0);{
		int rem=x%10;
		sum=sum+(rem*rem*rem);
		x=x/10;
		
	}
if (sum==originalValue) {
	System.out.println(x + " is a amstrong Number");
	
}
else {
	System.out.println(x + " is a amstrong Number");
}
	}
}
