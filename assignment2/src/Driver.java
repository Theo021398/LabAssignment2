
public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursiveMathLib recursionLibrary
			= new RecursiveMathLib();
		IterationMathLib iterationLibrary
		 	= new IterationMathLib();
		System.out.println("-------- Recursion --------\n");
		runTestCode(recursionLibrary);
		System.out.println("-------- Iteration --------\n");
		runTestCode(iterationLibrary);
	}
	public static void runTestCode(MathLib library) {
		System.out.println("GCD of 4,2 = " 
				+ library.gcd(4, 2));
		
		System.out.println("Ackermann of 2,2 = " 
				+ library.ack(2,2));
		
		System.out.println("Fibonacci Series of 7 = " 
				+ library.fib(7));
		
		
		System.out.println("It would take "+ library.hanoi(4) 
				+ " moves to move 4 disk(s) in a Tower of Hanoi game");
		
		
		System.out.println("---------------------------\n");
	}
}
