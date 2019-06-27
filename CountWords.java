class StringProcessing1 {


public void wordcount(String msg){
	int Count=1;
	int I=0;
	while (I<msg.length()){
		if (msg.substring(I,(I+1)).equals(" ")){
		Count=Count+1;
	}
	I=I+1;
}
	System.out.println(Count);
}
}

class countwords1 {
	public static void main(String xyz[]){

		StringProcessing1 ref;
		ref=new StringProcessing1();
		ref.wordcount("klausen hi");
}
}