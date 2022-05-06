package week1.day3;

public class swappingnumbers {
	public static void main(String[] args) {
		int a=222;
		int b=555;
		System.out.println("Before swapping: ");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a=" +a);
		System.out.println("b=" +b);
	}
}
