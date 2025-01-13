public class StackExample{
	public static void main(String[] args){
		methodA();//calling methodA
	}
	
	public static void methodA(){
		int x = 10;//local variable in methodA
		methodB();//Callimng methodB
	}
	
	public static void methodB(){
		int y = 20;//Local variable in methodB
		//Do something with y...
	}
}