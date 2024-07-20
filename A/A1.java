package A1;
public class A1{
	public static void main(String[] args) {
		OddEven obj=new OddEven();
		obj.setN(32);
		obj.checkOddEven();
		obj.setN(133);
		obj.checkOddEven();
	}
}
public class OddEven {
	int n;

	void setN(int k) {
		n = k;
	}

	void checkOddEven() {
		if (n%2==0) {
			System.out.println(n + " is an EVEN number.");
		} else {
			System.out.println(n + " is an ODD number.");
		}
	}
}
