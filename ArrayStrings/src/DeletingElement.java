import java.util.Arrays;


public class DeletingElement {

	public static void main(String[] args) {
		int[] firstArray={10,20,30,40,50};
		System.out.println("Original array"+ Arrays.toString(firstArray));
		int[] secondArray=new int[firstArray.length];
		int index=2;//the index that which we have to delete
		
		for(int i=0,k=0;i<firstArray.length;i++){
			if(index==i){
				continue;
			}
			secondArray[k]=firstArray[i];
			k++;
		}
	System.out.println("copided array:"+Arrays.toString(secondArray));
	
	
//		//only copied
//		for(int i=0,k=0;i<firstArray.length;i++){
//			secondArray[k++]=firstArray[i];
//		}
//		System.out.println("copy:" +Arrays.toString(secondArray));
	}

}
