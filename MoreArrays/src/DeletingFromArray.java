public class DeletingFromArray {

	public static void main(String[] args) throws InterruptedException {

		
//		int a=6;
//		System.out.println((a++ - ++a)+(--a + --a)*(++a + a--)+(++a - a++));
//		System.out.println(a++ * --a + --a* --a);
//		int a=10;int b=2;
//		System.out.println(a&b);
//		System.out.println(a|b);
//		System.out.println(a<<b);
//		System.out.println(a>>b);

		if (true)
			return;
		
		int[] arr1 = { 1, 8, 6, 9, 7 };
		int toDelete = 6;
		int elementNot = 0;

		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == toDelete) {
				for (int j = i; j < arr1.length - 1; j++) {
					arr1[j] = arr1[j + 1];
					elementNot++;

				}
			}
		}
		if (elementNot == 0)
			System.out.println("element not present");

		for (int a2 : arr1)
			System.out.print(" " + a2);

		//2 way
		
		if (true)
			return;
		int[] arr = { 1, 8, 6, 9 };
		int[] arr2 = new int[2];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 8 || arr[i] == 6) {
				continue;
			} else {
				arr2[count++] = arr[i];
			}
		}
		// arr reference has been chanced to arr2
		arr = arr2;
		for (int a3 : arr)
			System.out.print(" " + a3);

	}

}
