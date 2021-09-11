package comc.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String args[]) {
		List<Student> al = new ArrayList<Student>();
		
		System.out.println("Student List (ordered by name)");
		Student s1=new Student(101, "Kim", 23);
		al.add(s1); //adding Student class object
		Student s2=new Student(102, "Choi", 21);
		al.add(s2);
		al.add(new Student(103, "Park", 25));
		
		Collections.sort(al);
		//Traverse elements arraylist (ordered)
		for(Student s : al) {
			System.out.println(s.toString());
		}
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(al, Collections.reverseOrder());
		//Traverse elements of arraylist (reverse ordered)
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i).toString());
		}
		/*
		Student s = new Student();
		s.setNo(1);
		s.setName("홍길동");
		s.setAge(20);
		list.add(s);
		list.add(new Student(2, "철수", 22));
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
		list.remove(0);
		System.out.println("홍길동 삭제됨");

		
		for(Student obj : list) {
			System.out.println(obj.toString());
		}
		*/
	}
}
