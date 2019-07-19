
public class TrickyArrays1 {

	public static void main(String[] args) {
	//System.out.println("asdas");
		int[] arr ={4,3,1,6,4,3,6,4};
		int b[][]=new int[arr.length][2];//2D array 
		arr=sort(arr);
		for(int a:arr)
			System.out.print(" "+a);
		
		
	}	 
		public static int[] sort(int arr[] ){
			
			for(int i=0;i<arr.length;i++){
				for(int j=i;j<arr.length;j++){
					if(arr[i]>=arr[j]){
						int temp;
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
				}
			}
			return arr;
			
		}

}
