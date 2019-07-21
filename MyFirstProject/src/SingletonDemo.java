
public class SingletonDemo {

	public static void main(String[] args) {
		//Ab obj=new Ab();
		//only one obj is created and it is shared
		Ab obj=Ab.getInstance();
		System.out.println(obj);
		Ab obj2=Ab.getInstance();
		System.out.println(obj2);
			
	}

}

class Ab{
	//step 1: first  create an instance of the class by using static keyword
	
	static Ab obj;
	
	//seep 2: create private const 
	private Ab(){
		
	}
	
	//step3: create a static method which returns obj 
	
	public static Ab getInstance(){
		if(obj==null){
			obj = new Ab();
		}
		return obj;

		
	}
	
}
