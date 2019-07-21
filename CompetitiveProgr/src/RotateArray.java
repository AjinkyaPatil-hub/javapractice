
public class RotateArray {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7};
		int a=arr[0];
		int b=arr[1];
		int n=2;
		
		while(n>0){
		for(int i=0;i<arr.length-1;i++){

			arr[i]=arr[i+1];
			
		}
		n--;
		}
		arr[arr.length-1]=b;
		arr[arr.length-2]=a;
		for(int aa:arr)
			System.out.print(" "+aa);
		System.out.println("time complexity: O(n) and Auxiliary space :O(n)");
	}

}
