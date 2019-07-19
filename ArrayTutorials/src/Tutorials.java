/*
 * return true if 6 appers at first or last in array
 *  {1,2,6}--true
 *  {6,5,8,1}--true
 *  {8,5,6---false
 */
public class Tutorials {

	public static void main(String[] args) {

		int[] arr={1,5,7,8,6,9};
		int lp=arr.length-1;
		
		if(arr[0]==1 && arr[lp]==6){
			System.out.println("true");
		}
		else if(arr[0]==6 && arr[lp]==1){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}

}
