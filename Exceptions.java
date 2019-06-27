class Exceptions{
	public static void main(String xyz[]){
		int A, B, C;
		A=B=C=0;
	try{
		A=4;
		B=0;
		C=A/B;
		System.out.println("Result is"+C);
	}
	catch(NumberFormatException D){
	System.out.println("Enter a number");
	}
	catch(ArithmeticException E){
	System.out.println("Error");
}
}
}