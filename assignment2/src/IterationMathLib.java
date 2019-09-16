
public class IterationMathLib 
extends MathLib{

	@Override
	int gcd(int x, int y) {
		
		// TODO Auto-generated method stub
		//System.out.println("Iteration GCD Not Implemented");
		int temp;
		while(y!=0) {
			if(x>=y && x!= 0) {
			temp = x;
			x=y;
			y=temp % y;
			}
		}
		return x;
		
	}

	@Override
	int ack(int x, int y) {
		// TODO Auto-generated method stub
		int temp2;
		int temp3;
		while(x!=0) {
			if(y==0) {
				x-=1;
				y=1;
			}
			
			  if(x!=0 && y!=0) {
				  temp2 = x;
				  x -=1; 
				  temp3=y;
				  y= ack(temp2, temp3-1); }
			 
		}
		return y+=1;
	
	}

	@Override
	int fib(int x) {
		// TODO Auto-generated method stub
		while(x!=0) {
			if(x==1) {
				return 1;
			}
			if(x>1) {
				return fib(x-1) + fib(x-2);
			}
			}
		return 0;
		}

	@Override
	int hanoi(int n) {
		while(n!=1) {
			if(n>1) {
				return 2*hanoi(n-1)+1;
			}
		}
		return 1;
	}
		
	}


