/*Define a class Calculator2 which has two integer members. Define add(int,int),
sub(int,int), multi(int,int), divi(int,int) , show() methods to perform Addition,
Subtraction, Multiplication , Division and Display operations. Create an object and
call the methods in the correct order */

package A7;

public class A7{
	public static void main(String[] args) {
		Calculator2 obj = new Calculator2();
		obj.add(20, 3);
		obj.sub(10,7);
		obj.multi(3, 4);
		obj.divi(15,3);
		obj.show();
	}

}

public class Calculator2 {
	int x,y;    
	int addValue,subValue,mulValue,diviValue;
	void add(int a, int b) {
		x=a;
		y=b;
		addValue = x+y;
	}
	void sub(int a, int b) {
		x=a;
		y=b;
		subValue = x-y ;
	}
	void multi(int a, int b) {
		x=a;
		y=b;
		mulValue = x*y;
	}
	void divi(int a, int b) {
		x=a;
		y=b;
		diviValue = x/y;
	}

	void show() {
		System.out.println("Addition = " + addValue);
		System.out.println("Subtraction = " + subValue);
		System.out.println("Multiplication = " + mulValue);
		System.out.println("Divison = " + diviValue);
	}
}
