class One extends First {
public One(){
	System.out.println(1);
}
}


class Two extends One {
public Two(){
	System.out.println(3);
}
public Two(int A){
System.out.println(2);
}
}


class First extends Second {
public First(){
	System.out.println(6);
}
}


class Second{
public Second(){
	System.out.println(7);
}
}


class Constructors {
	public static void main(String xyz[]){

		Two x = new Two(1);

}
}
