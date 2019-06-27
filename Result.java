class Result{
	public static void main (String xyz[]){
	int phy, chem, maths, total;
	float per;
	phy=50;
	chem=100;
	maths=100;
	total=phy+chem+maths;
	per=total*100/450;
	System.out.println("Total Marks = "+total);
	System.out.println("Your percentage is "+per);

	if (per>=50){
		System.out.println("You have passed");
	}
	else {
		System.out.println("You have failed");
	}
	}
}