
public class ReversingArrayWithoutSecondArray {

	public static void main(String[] args) {
		int[] arr={8,7,6,5,4,3,2,1};
		for(int i=0;i<(arr.length)/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
		System.out.println("reverse array");
		for(int i:arr)
			System.out.print(" "+i);
		System.out.println("hiii");
		
	}

}
