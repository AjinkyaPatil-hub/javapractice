//we can also decler our enum before the class
//enum Days{Te(2),Wes(5),Sat,Sun}
public class EnumDemo {
	int value;
	private EnumDemo(int value){
	this.value=value;
	}
		public enum Days {mon,thu,fri }
		public static void main(String[] args) {
			
			for(Days d: Days.values())
				System.out.println(d);
//			Days d=Days.Sat;
//			System.out.println(d);
}

}

