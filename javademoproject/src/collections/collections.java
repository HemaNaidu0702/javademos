package collections;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class collections {
   public static void main(String[] args) {
	   Set<Integer> intset = new TreeSet<Integer>();
	   intset.add(2);
	   intset.add(8);
	   intset.add(5);
	   intset.add(1);
	   // collection is sorted
	   System.out.println(intset);
	   
	   Set<String> strset = new TreeSet<String>();
	   strset.add("John");
	   strset.add("Adam");
	   strset.add("Steve");
	   strset.add("Max");
	   // collection is sorted alphabetically
	   System.out.println(strset);	   
	   
	   
	   //how to sort objects
	   //1. comparable - natural ordering
	   //2. comparator - change the natural ordering
	   
	   Set<Employee> employees  = new TreeSet<Employee>();
	   employees.add(new Employee(11,"John",23400,"A21"));
	   employees.add(new Employee(7,"Adam",45000,"A25"));
	   employees.add(new Employee(9,"Steve",98000,"A20"));
	   employees.add(new Employee(3,"Max",12000,"A11"));
	   System.out.println(employees);
	   
	   
	   Set<String> emp2 = new TreeSet<String>(new stringcomparator());
	   emp2.add("John");
	   emp2.add("Joee");
	   emp2.add("Steve");
	   emp2.add("Rebeka");
	   System.out.println(emp2);
   }
}



class Employee implements Comparable <Employee> {
	
	int id;
	String name;
	int salary;
	transient String aadhar;
	
	Employee(int id, String name, int salary, String aadhar) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.aadhar = aadhar;
	}
	
	public String toString() {
		return this.id + "|" + this.name + "|" + this.salary + "|" + this.aadhar;
	}
	
	public int compareTo(Employee o) {
		return this.id < o.id ? -1 : this.id > o.id ? 1 : 0;
	}
}



class stringcomparator implements Comparator <String> {
	public int compare(String s1, String s2) {
		int l1 = s1.length();
		int l2 = s2.length();
		
		if(l1<l2) {
			return -1;
		} else if(l1>l2) {
			return 1;
		} else {
			return s1.compareTo(s2);
		}
	}
}


