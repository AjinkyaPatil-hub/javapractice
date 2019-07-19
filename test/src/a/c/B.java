package a.c;

public class B {

	public static void main(String[] args) {
	double d=130000.456;
	int x=(int)d;
	System.out.println(x);
	//byte b=(byte)x;
	//System.out.println(b);
	short s=(short)x;
	System.out.println(s);
	String sr="            big    ss";
//	System.out.println(sr.concat("Aai"));
//	sr.concat("kay");
//	System.out.println(sr);
	//System.out.println(sr.equalsIgnoreCase("JaVa"));
	System.out.println(sr.trim()+"d");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		if(false){
		int evencnt=0;
		int oddcnt=0;
		int arr[] = { 5, 9, 12, 6, 3 };
		System.out.println("even:");
			for (int j = 0; j < arr.length; j++) {
				if (arr[j] % 2 == 0){
					evencnt++;
					System.out.print(arr[j]+" ");
				}
			}
			System.out.println("total even:"+evencnt);
			System.out.println("\nodd");
			for (int j = 0; j < arr.length; j++) {

				if (arr[j] % 2 != 0){
					System.out.print(arr[j]+" ");
					oddcnt++;
				}
			}
			System.out.println("total odd:"+oddcnt);
		}
	}
	}

