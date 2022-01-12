package trail;

import java.util.Scanner;

public class Add {

	public static void main(String[] args) {
		int a,b,res;
		Scanner s=new Scanner(System.in);
		System.out.println("first no:");
		a=s.nextInt();
		System.out.println("second no:");
		b=s.nextInt();
		res=a+b;
		System.out.println("total="+res);
	}

}
