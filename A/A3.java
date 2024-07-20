public class A3 {
	public static void main(String[] args) {
		CheckPrime obj = new CheckPrime();
		obj.setN(32);
		obj.checkPrime();
		obj.setN(17);
		obj.checkPrime();
	}
}
public class CheckPrime {
	int n;

	void setN(int a) {
		n = a;
	}

	void checkPrime() {
		int c = 0;
		for (int i = 2; i <= n/2; i++){
			if (n%i == 0){
				c++;
				System.out.println(n+" is not a Prime number");
				break;
			}
		}
		if (c == 0) {
			System.out.println(n+" is a Prime number");
		}
	}
}
