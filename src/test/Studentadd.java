package test;

public class Studentadd {
	 @Override
	    public String toString() {
	        return "Student [name=" + name + ", roll=" + roll + ", standard=" + standard + ", address=" + address + "]";
	    }
	    
	    public static void main(String args[])
	    {
	        Address address=new address();
	        address.setStreetNo(34);
	        address.setCity("Bangalore");
	        address.setState("Karnakata");
	        address.setCountry("India");
	        
	        Student student=new Student();
	        student.setName("Robin");
	        student.setRoll(23);
	        student.setStandard("Fifth");
	        student.setAddress(address);
	        
	        System.out.println(student);
	    }
	    
	     

}
