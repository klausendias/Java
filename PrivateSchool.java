class Results{
private int phy,chem,mat;

public void Physics(int p){
 	if (p>=0 && p<=150){
 		phy=p; }
 	else {
 		phy=-1;
 		System.out.println("Invalid Physics Marks");
 	}
 }

public void Chemistry(int c){
 	if (c>=0 && c<=150){
 		chem=c; }
 	else {
 		chem=-1;
 		System.out.println("Invalid Chemistry Marks");
 	}
 }

public void Maths(int m){
 	if (m>=0 && m<=150){
 		mat=m; }
 	else {
 		mat=-1;
 		System.out.println("Invalid Maths Marks");
 	}
 }

public void showresults(){
	int total;
	total=phy+chem+mat;
	if (phy==-1 || chem==-1 || mat==-1){
		System.out.println("Please check marks entered");
	}

	else if (total>200){
	System.out.println("Total Score = "+total);
	System.out.println("Passed");}

    else if (total>0 && total>200){
    	System.out.println("Total Score = "+total);
		System.out.println("Failed");
	  }
	}
}


class PrivateSchool{
	public static void main(String xyz[]){
		Results Peter, James;
		Peter = new Results();
		James = new Results();
		Peter.Physics(60);
		Peter.Chemistry(150);
		Peter.Maths(50);
		James.Physics(90);
		James.Chemistry(100);
		James.Maths(1100);
		Peter.showresults();
		James.showresults();
	}
}