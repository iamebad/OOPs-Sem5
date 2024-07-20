//Generate all the Prime numbers from 1 to 100.

package A4;

public class A4{
	public static void main(String[] args) {
		GneratePrimeNums obj = new GneratePrimeNums();
		obj.printPrimeNums();
	}
}

public class  GneratePrimeNums{

	void printPrimeNums() {
		int c = 0;
		for (int i = 1; i <= 100; i++){
			c=0;
			for (int j = 2; j <= i/2; j++){
				if (i%j == 0){
					c++;
					break;
				}
			}
			if (c == 0 ) {
				System.out.print(i + " ");
			}
		}

	}
}
