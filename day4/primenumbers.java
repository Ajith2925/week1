package week1.day4;

public class primenumbers {
	public static void main(String[] args) {
		
	int input=11;
	int count=0;
	for (int i=1; i<=input; i++) {
		if (input%i==0) {
		count++;
	}
	}
if (count==2) {
System.out.println("Prime Number");
}
else {
	System.out.println("Not a prime number");
}
		
	}
	
}
