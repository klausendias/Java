class maths2 extends maths{
	public void multiplication(int X,int Y){
		System.out.println("result ="+(X*Y));
	}

}

class testmaths2{
	public static void main (String xyz[]){
		maths2 ref= new maths2();
		ref.subtraction(8,5);
	}
}