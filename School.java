class Results{
int phy,chem,mat;
public void showresults(){
	int total;
	total=phy+chem+mat;
	System.out.println("Total Score = "+total);
	if (total>200){
	System.out.println("Passed");}
	else {
		System.out.println("Failed");
	}
	}
}

class School{
	public static void main(String xyz[]){
		Results Peter, James;
		Peter = new Results();
		James = new Results();
		Peter.phy =100;
		Peter.chem=100;
		Peter.mat=50;
		James.phy=50;
		James.chem=40;
		James.mat=60;
		Peter.showresults();
		James.showresults();
	}
}