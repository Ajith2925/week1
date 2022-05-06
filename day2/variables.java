package week1.day2;

public class variables {
	// global variable should declared outside method and within class
	String student;
	boolean isPaidFees;
	double mark;
	char initial='c';
	
	public void add() {
	int a=1;
	int b=2;
	int c=0;
	int total=a+b;
	System.out.println(total);
	System.out.println(c);
}
public static void main(String[] args) {
	variables var=new variables();
	System.out.println(var.student);
	System.out.println(var.initial);
	System.out.println(var.isPaidFees);
	System.out.println(var.mark);
	var.add();
}
}