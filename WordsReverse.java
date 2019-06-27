class StringProcessing3 {


public void wordcount(String msg){
	String word="";
	int I=msg.length()-1;
	while (I>=0){
	if (msg.substring(I,I+1).equals(" ")){
	System.out.print(word+" ");
	word="";

}
else{
	word=msg.substring(I,I+1)+word;
}
I=I-1;
}
System.out.print(" "+word);
	}
}

class WordsReverse {
	public static void main(String xyz[]){

		StringProcessing3 ref;
		ref=new StringProcessing3();
		ref.wordcount("I Am Klaus");
}
}
