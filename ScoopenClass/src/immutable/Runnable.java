package immutable;

import java.util.Date;

public class Runnable {

	public static void main(String[] args) {

		Address address=new Address(455445, "pune");
		final Emp emp=new Emp(1, "asd", address, new Date(2019/07/24));
		
		System.out.println(emp);
		emp.getDate().setYear(2022);
		System.out.println(emp);
	}

}
