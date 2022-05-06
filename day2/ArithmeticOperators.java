package week1.day2;

public class ArithmeticOperators {
	public void add() {
		int a=19;
		int b=11;
		int c=a+b;
		System.out.println("Addition of two numbers =" +c);}
	public void sub() {
		int a=156;
		int b=122;
		int c=a-b;
		System.out.println("Subtraction of two numbers =" +c);}
	public void multi() {
		int a=87;
		int b=22;
		int c=a*b;
		System.out.println("Multiple of two numbers=" +c);}
	public void division() {
		int a=100;
		int b=10;
		int c=a/b;
		System.out.println("Division of two numbers=" +c);}

public static void main(String[] args) {
	ArithmeticOperators Arithmetic=new ArithmeticOperators();
	Arithmetic.add();
	Arithmetic.sub();
	Arithmetic.multi();
	Arithmetic.division();
}
}