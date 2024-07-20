/*Define a class Calculator which has two integer members. Define add(), sub(),
multi(), divi() , show() methods to perform Addition, Subtraction, Multiplication ,
Division and Display operations. [Don’t pass the parameter in the methods]. Create
an object and call the methods in the correct order.*/
package A6;

public class A6 {
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

	void setValue(int x, int y) {
		a = x;
		b = y;
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
