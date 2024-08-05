public class C{
	public static void main(String[] args)
{
		Complex obj=new Complex();
		obj.set(10,-30.5f);
		obj.disp();
	}
}
class Complex{
	float real;
	float image;
	void set(float real,float image ){
		this.real=real;
		this.image=image;
	}
	void disp(){
		if(image<0){
			System.out.println ("Complex number is "+real+"-"+Math.abs(image)+"i");
			return;
		}
		System.out.println("Complex number is "+real+"+"+image+"i");
	}
}


