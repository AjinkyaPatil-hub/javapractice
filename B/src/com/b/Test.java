package com.b;

class Test {

	public static void main(String[] args) {
		int[] arr ={7,6,8,9,2,1};
		int temp;
		//for loop for number of rounds 
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-1;j++){
				if(arr[j]>arr[j+1]){
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(int no:arr)
			System.out.print(" "+no);
		
		
	
	}
}
