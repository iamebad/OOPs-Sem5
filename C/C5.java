public class C5{
	public static void main(String[] args){
		Rectangle obj1=new Rectangle();
		Rectangle obj2=new Rectangle();
		System.out.println("The First Rectangle:");
		obj1.setLength(5);
		obj1.setWidth(10);
		obj1.show();
		System.out.println("Area="+obj1.getArea()+" Perimeter="+obj1.getPerimeter());
		System.out.println("The Second Rectangle:");
		obj2.setLength(10);
		obj2.setWidth(5);
		obj2.show();
		System.out.println("Area="+obj2.getArea()+" Perimeter="+obj2.getPerimeter());
		if(obj2.isSameArea(obj1)==true)System.out.println("Area of both rectangles are equal.");
		else System.out.println("Area of both rectangle are not equal");
	}
}
class Rectangle{
	float length,width,area,perimeter;
	
	void setLength(float length){
		this.length=length;
	}
	void setWidth(float width){
		this.width=width;
	}
	float getArea(){
		area=length*width;
		return area;
	}
	float getPerimeter(){
		perimeter=2*(length+width);
		return perimeter;
	}
	void show(){
		System.out.println("Length="+length+" Width="+width);
	}
	boolean isSameArea(Rectangle obj){
		return obj.getArea()==this.area;
	}
}


