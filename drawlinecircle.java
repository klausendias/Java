class line extends draw{
	public void drawing(){
		System.out.println("Draw Line");
	}
}

class circle extends draw{
	public void drawing(){
        System.out.println("Draw Circle");
	}
}


class drawlinecircle{
public static void letsdraw(draw D){
	D.drawing();
}
	public static void main (String xyz[]){
		line x = new line();
		letsdraw(x);
		circle y= new circle();
		letsdraw(y);
	}
}


