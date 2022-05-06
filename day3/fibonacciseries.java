 package week1.day3;

public class fibonacciseries {
	public static void main(String[] args) {
int n=10, firstTerm =0, secondTerm =1;
System.out.println("Fibonacci series for " +n +" terms");

for (int i=0; i<=n; i++) {
	System.out.println(firstTerm +"        ");
	
	int nextTerm=firstTerm+secondTerm;
	firstTerm=secondTerm;
	secondTerm=nextTerm;
	
}
	}

}
