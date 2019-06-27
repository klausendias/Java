class StringProcessing {


public void wordcount(String msg){
	System.out.println("The msg contains "+msg.length()+ " characters");
}
}


class CountString {
	public static void main(String xyz[]){

		StringProcessing ref;
		ref=new StringProcessing();
		ref.wordcount("klausen");
}
}
