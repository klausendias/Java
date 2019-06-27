class Second{
int phy,chem;
public void message(){
	System.out.println("Hello");
	System.out.println("My Friend");
	}
}

class Test2{
	public static void main(String xyz[]){
		Second x;
		x = new Second();
		x.phy=75;
		x.message();
		System.out.println("Your total marks = " + x.phy);
	}
}