package it.unical.mavenFirstTest;

public class myMath {
	public static int fibonacci(int position) {
//		if(position<0) {
//			throw 
//			System.out.println(fibonacci(5)+"illegal sequence");
//		}
		if(position==0) {
			return 0;
			
		}
		if(position==1) {
			return 1;
		}
		return fibonacci(position-1)+ fibonacci(position-2);
	}

}
