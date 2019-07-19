
/*
 * 	returning the difference between smallest and largest element in array
 * 	{1,2,3,8,9}--8 
 * 	lar 9 smal 1 
 */
public class LargestSmallestDifference {

	public static void main(String[] args) {
		
			int[] arr={1,3,7,5};
			int lar=arr[0];
			int small=arr[0];
			for(int i=0;i<arr.length;i++){
				if(arr[i]>lar)
					lar=arr[i];
			}
			for(int i=0;i<arr.length;i++){
				if(arr[i]<small)
					small=arr[i];
			}
			
			System.out.println(lar + " " +small );
			System.out.println("difference"+ (lar-small));
		
	}

}
