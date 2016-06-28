/** This class represents an employee
 * 
 * @author Vitor
 * @version 1.0
 */

public class Employee implements Cloneable{

		private String lastName;
		private String firstName;
		private double salary;
		
		public Address address;
		
		/**
		 * Creates an employee with the specific name
		 * @param lastName
		 * @param firstName
		 */
		public Employee(String lastName, String firstName){
			
			this.lastName = lastName;
			this.firstName = firstName;
			
		}
		
		public String getLastName(){
			return this.lastName;
		}
		
		public void setLastName(String lastName){
			this.lastName = lastName;
		}
		
		public String getFirstName(){
			return this.firstName;
		}
		
		public void setFirstName(String firstName){
			this.firstName = firstName;
		}
		
		public double getSalary(){
			return this.salary;
		}
		
		public void setSalary(double salary){
			this.salary = salary;
		}
		
		public Object clone(){
			
			Employee emp;
			try{
				emp = (Employee) super.clone();
				emp.address = (Address) address.clone();
			}
			catch(CloneNotSupportedException e){
				return null;
			}
			
			return emp;
		}
		
		public String toString(){
			
			return this.getClass().getName() + "[" + this.firstName + " " + this.lastName + " "+ this.salary+" ]";
		}
}