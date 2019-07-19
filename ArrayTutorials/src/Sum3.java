/*
 * 
 * Return the sum of the numbers in the array, returning 0 for an empty array. Except the number 13 is very unlucky, 
 * so it does not count and numbers that come immediately after a 13 also do not count.
 * 	returning the difference between smallest and largest element in array
 *  sum13([1, 2, 2, 1])  6
	sum13([1, 1]) 2
	sum13([1, 2, 2, 1, 13]) 6
 */
public class Sum3 {

	public static void main(String[] args) {
		int[] arr={1,2,2,1,13,9,1};
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=13){
				sum+=arr[i];
			}else
				break;
		}
		System.out.println(sum);
	}

}
