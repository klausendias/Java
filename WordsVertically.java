class StringProcessing2 {


public void wordcount(String msg){
	String Word="";
	int I=0;
	while (I<msg.length()){
		if (msg.substring(I,I+1).equals(" ")){
		System.out.println(Word);
		Word="";
	}
		else{
			Word=Word+msg.substring(I,I+1);
		}
		I=I+1;
	}
	System.out.println(Word);
}
}

class WordsVertically {
	public static void main(String xyz[]){

		StringProcessing2 ref;
		ref=new StringProcessing2();
		ref.wordcount("I Am Klaus");
}
}