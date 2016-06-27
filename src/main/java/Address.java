public class Address implements Cloneable {


		private String street;
		private String city;
		private String state;
		private String zipCode;
		
		public Address(){
			
			this.street = "";
			this.city= "";
			this.state = "";
			this.zipCode = "";
		}
		
		public Address(String street, String city, String state, String zipCode){
			
			this.street = street;
			this.city= city;
			this.state = state;
			this.zipCode = zipCode;
		}
		
		public Object clone(){
			
			try{
				return super.clone();
			}
			catch(CloneNotSupportedException e){
				return null;
			}
		}
		
		public String getAddress(){
			return this.street + "\n" + this.city + ", " + this.state + " " + this.zipCode;
		}
		
}