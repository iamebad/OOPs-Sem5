/*5. Write a program to perform the following operation between two operands of
integer type, the operation includes Addition, Subtraction, Division and
Multiplication.*/
package A5;

public class A5{
	public static void main(String[] args) {
		Operation obj = new Operation();
		obj.setValue(20, 3);
		obj.add();
		obj.sub();
		obj.multi();
		obj.div();
	}
}

class Operation {
	int a;
	int b;

	void setValue(int x, int y) {
		a = x;
		b = y;
	}

	void add() {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	void sub() {
		System.out.println(a + " - " + b + " = " + (a-b));
	}
	void multi() {
		System.out.println(a + " * " + b + " = " + (a*b));
	}
	void div() {
		if (b == 0){
			System.out.println(a+"/"+b+"=Undefined");
			return;
		}
		System.out.println(a + " / " + b + " = " + (a/b));
	}
}
