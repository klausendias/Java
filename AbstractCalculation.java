class calculations2 extends calculations{
	public void Tax(int Salary){
	float Result;
	Result= Salary*20/100;
	System.out.println(Result);
}
}

class AbstractCalculation{
	public static void main(String xyz[]){

		calculations2 ref = new calculations2();
		ref.Tax(10000);
	}
}