/*
 * 	first 10 logic 0+1=1;
 *	 				1+1=2
 * 					1+2=3
 * 					2+3=5	
 */
public class FiboSeries {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for(int i=1;i<10;i++){
			System.out.print(" "+b);
			int c=a+b;
			a=b;
			b=c;
			
		}
	}

}
