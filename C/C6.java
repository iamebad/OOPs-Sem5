public class C6{
	public static void main(String[] args){
		DOB obj=new DOB();
		obj.setDOB(16,05,2004);
		obj.show();
	}
}
class DOB{
	void setDOB(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
void show(){
		System.out.print(date+"/"+month+"/"+year);
	}
DOB findAge(DOB obj){


