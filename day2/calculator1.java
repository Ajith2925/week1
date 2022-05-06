package week1.day2;

public class calculator1 {
	public void add(int a,int b) {
		int c=a+b;
		System.out.println(c);
	}
	public void sub(int a,int b) {
		int c=a-b;
		System.out.println(c);
	}
	public void multi(int a,int b) {
		int c=a*b;
		System.out.println(c);
	}
	public void div(int a,int b) {
		int c=a/b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		calculator1 obj=new calculator1();
		obj.add(12, 12);
		obj.sub(50, 10);
		obj.multi(10, 2);
		obj.div(50, 5);
		
		
	}
}
