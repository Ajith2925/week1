package week1.day1;

public class twowheeler {
	String bikeName="Yamaha";
	int noOfWheels=2;
	short noOfMirrors=2;
	long chassisNumber=57388269372L;
	boolean isPunctured=false;
	double runningKilometers=11295.6785;
	
	public static void main(String[] args) {
		twowheeler details=new twowheeler();
		System.out.println( details.bikeName);
		System.out.println( details.noOfWheels);
		System.out.println( details.noOfMirrors);
		System.out.println( details.chassisNumber);
		System.out.println( details.isPunctured);
		System.out.println( details.runningKilometers);
	}
}
	