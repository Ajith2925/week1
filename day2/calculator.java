package week1.day2;

public class calculator {
	
	public int add(int a,int b) {
		int total=a+b;
		return total;
}
    public void sub(int totalvalue,int d) {
    	int z=totalvalue-d;
    	System.out.println(z);
}
public static void main(String[] args) {
	calculator cal=new calculator();
	int totalvalue=cal.add(50, 30);
	System.out.println(totalvalue);
	cal.sub(totalvalue,10);
}
}
