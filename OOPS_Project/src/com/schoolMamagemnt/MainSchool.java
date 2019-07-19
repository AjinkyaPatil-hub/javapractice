package com.schoolMamagemnt;

import java.util.ArrayList;
import java.util.List;

public class MainSchool {

	public static void main(String[] args) {
		
		Teacher lazzy=new Teacher(1, "lazzy", 5000);
		Teacher malisa=new Teacher(2, "malisa", 2000);
		Teacher john=new Teacher(3, "john", 70000);

		List<Teacher> teachers=new ArrayList<>();
		teachers.add(lazzy);
		teachers.add(malisa);
		teachers.add(john);
		
		Student arvin=new Student(1, "arvin", 2);
		Student pooja=new Student(2, "pooja", 4);
		Student raby=new Student(3, "raby", 8);
		
		List<Student> students =new ArrayList<>();
		students.add(arvin);
		students.add(pooja);
		students.add(raby);
		
		School sc=new School(teachers, students);
		
		arvin.payFees(500);
		pooja.payFees(7000);
		System.out.println("school has earned rs:"+ sc.getTotalMoneyEarned());
		
	}
	

}
