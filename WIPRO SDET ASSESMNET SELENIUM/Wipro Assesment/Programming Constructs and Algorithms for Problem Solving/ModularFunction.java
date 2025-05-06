package basics;
import java.util.*;
public class ModularFunction {
	public static long factorial(int n) {
		if(n<0) {
			return -1;
		}
		if(n==0||n==1) {
			return 1;
		}
		long fact=1;
		for(int i=2;i<=n;i++) {
			fact*=i;
		}
		return fact;
	}
	public static long fibonacci(int n) {
		if(n<1) {
			return -1;
		}
		if(n==1) {
			return 0;
		}else if(n==2) {
			return 1;
		}
		long prev=0;
		long curr=1;
		for(int i=3;i<=n;i++) {
			long next=prev+curr;
			prev=curr;
			curr=next;
		}
		return curr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter positive number");
		int n=sc.nextInt();
		long res=factorial(n);
		System.out.println("Factorial of "+n+" is: "+res);
		long res2=fibonacci(n);
		if(n==1) {
			System.out.println(n+"st fibonacci number is: "+res2);
		}else if(n==2) {
			System.out.println(n+"nd fibonacci number is: "+res2);
		}else if(n==3) {
			System.out.println(n+"rd fibonacci number is: "+res2);
		}else {
			System.out.println(n+"th fibonacci number is: "+res2);
		}		
	}
}
