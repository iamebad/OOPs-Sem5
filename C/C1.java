public class C {
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.setValue(20, 3);
		obj.add();
		obj.sub();
		obj.multi();
		obj.divi();
		obj.show();
	}
}

class Calculator {
	int a,b;
	int addValue, subValue,multValue,divValue;

	void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}

	void add() {
		addValue=a+b;
	}
	void sub() {
		subValue=a-b;
	}
	void multi() {
		multValue=a*b;
	}
	void divi() {
		divValue=a/b;
	}

	void show() {
		System.out.println("Addition = " + addValue);
		System.out.println( "Subtraction = " + subValue);
		System.out.println( "Multiplication = " + multValue);
		System.out.println( "Division = " + divValue);
	}
}
