package serialization;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import  java. io. Serializable;

public class serialization {
  public static void main(String[] args) {
	
	   serializationdemo();
	  
	 deserializationdemo();

  }
  
  
  
  
  public static void serializationdemo() {
		FileOutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			os = new FileOutputStream("/c:/javafsd/javademos/myfile");
			oos = new ObjectOutputStream(os);
			Employee emp = new Employee(31, "John", 20000, "A1123F");
			oos.writeObject(emp);
			System.out.println("Object serialized");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				oos.close();
				os.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
  }
  
  
  public static void deserializationdemo()  {
		FileInputStream os = null;
		ObjectInputStream ois = null;
		try {
			os = new FileInputStream("/c:/javafsd/javademos/myfile");
			ois = new ObjectInputStream(os);
			
			Employee emp1 = null;
			try {
				emp1 = (Employee) ois.readObject();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Object deserialized " + emp1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				os.close();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
  }
  
  
}

class Employee implements Serializable {
	
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
}

