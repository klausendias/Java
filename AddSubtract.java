class Maths{
public void addition(int A,int B){
	int result;
	result = A+B;
	System.out.println("Result = "+result);
	}
public int subtraction(int A, int B){
	int answer;
	answer=A-B;
	return answer;
	}
	}

class AddSubtract{
	public static void main(String xyz[]){
		Maths x;
		x= new Maths();
		x.addition(2,10);
		System.out.println("Result = " +x.subtraction(100,20));
	}
}