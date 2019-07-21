
public class RotateRight {

	public static void main(String[] args) {
		
		int[] arr={1,2,3,4,5,6,7};
		int x=arr[arr.length-1];
		int j=arr.length-1;
		for(int i=arr.length-1;i>0;i--){
			arr[i]=arr[i-1];
		}
		arr[0]=x;
		
		for(int aa:arr)
			System.out.print(" "+aa);

		
	}

}
