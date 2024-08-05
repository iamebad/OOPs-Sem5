public class C6{
	public static void main(String[] args){
		DOB obj=new DOB();
		DOB obj2=new DOB();
		obj.setDOB(16,05,2004);
		obj2.setDOB(16,05,2006);
		obj.show();
		obj2.show();
		DOB ageDiff=obj.findAge(obj2);
		ageDiff.show();
	}
}
class DOB{
	int date, month, year;
	void setDOB(int date,int month,int year){
		this.date=date;
		this.month=month;
		this.year=year;
	}
void show(){
		System.out.println(date+"/"+month+"/"+year);
	}
DOB findAge(DOB obj){
		DOB difference = new DOB();

        if (this.date < obj.date) {
            this.date += 30;
            this.month -= 1;
        }
        difference.date = this.date - obj.date;

        if (this.month < obj.month) {
            this.month += 12;
            this.year -= 1;
        }
        difference.month = this.month - obj.month;

        difference.year = this.year - obj.year;
        
        return difference;
    }
}


