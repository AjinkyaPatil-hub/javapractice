
class Parent{
	
	public void c(){
		
	}
	
}

public class TypeCasting extends Parent {
	public void d(){
		
	}
	public static void main(String[] args) {
	   TypeCasting tp=(TypeCasting) new Parent();
	   tp.d();
	   Parent p=new TypeCasting();
	   p.c();
	   
	}

}
