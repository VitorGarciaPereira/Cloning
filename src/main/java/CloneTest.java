
import org.junit.Test;

public class CloneTest {
	
	@Test
	
	public static void main(String[] args){
		
		Employee emp1 = new Employee ("Martinez", "Anthony");
		emp1.setSalary(40000.0);
		
		emp1.address = new Address("1300 first street", "Fresno", "CA", "93702");
		
		Employee emp2 = (Employee) emp1.clone();
		
		System.out.println("***** after cloning *****\n");
		printEmployee(emp1);
		System.out.println();
		printEmployee(emp2);
		
		emp2.setLastName("Smith");
		emp2.address = new Address("205 6th street", "Fresno", "CA", "93722");
		
		System.out.println("***** after changing emp2 *****\n");
		printEmployee(emp1);
		System.out.println();
		printEmployee(emp2);
	}
	
	public static void printEmployee (Employee e){
		
		System.out.println(e.getFirstName()+ " "+e.getLastName());
		System.out.println(e.address.getAddress());
	}
}