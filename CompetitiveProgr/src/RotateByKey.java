
public class RotateByKey {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};
		int match=6;
		int found=0,count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length;j++){
				found=arr[i]*arr[j];
				//System.out.println(found);
				if(found==match){
					System.out.println("element found" +arr[i]+","+arr[j] );
					count++;
					break;
				}
				
			}
		}
		if(count==0)
			System.out.println("element not found");
	}

}
