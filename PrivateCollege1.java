class college{
private int phy,chem,total; float per;

public void physics(int p){
 	if (p>=0 && p<=150){
 		phy=p; }
 	else {
 		phy=-1;
 		System.out.println("Invalid Physics Marks");
 	}
 }
public void chemistry(int c){
 	if (c>=0 && c<=150){
 		chem=c; }
 	else {
 		chem=-1;
 		System.out.println("Invalid Chemistry Marks");
 	}
}
public void showresults(){
	if (phy==-1 || chem==-1){
		System.out.println("Please check marks entered");
	}

	else {

		total=phy+chem;
		per=total*100/300;
		System.out.println("Total Marks = " +total);
		System.out.println("Your percentage is "+per);
	  }
}
}

class PrivateCollege1{
	public static void main(String xyz[]){
		college abc;
		abc=new college();
		abc.physics(600);
		abc.chemistry(120);
		abc.showresults();
	}
}