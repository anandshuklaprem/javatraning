package array;

public class strname {

	public static void main(String[] args) {
	String name  ="harry";
	//esape sequance
	System.out.println("ak shukla \n dpuble quate ");
	//equals
	System.out.println(name.equals("harry"));
	
	//indexOf
	System.out.println(name.indexOf("ry"));
     
	//charAt
	 System.out.println(name.charAt(3));
	
	
	//endwith
	System.out.println(name.endsWith("ryuu"));
	
	//startwith
	System.out.println(name.startsWith("har"));
	
	//replace
	System.out.println(name.replace("harry","anand"));

	
	//substring
	System.out.println(name.substring(1));
	
	//substring
	System.out.println(name.substring(1,5));
	
	//toUppercase
	String ustring=name.toUpperCase();
	System.out.println(ustring);
	
	//name
	System.out.println(name);
	
	//lowercase
	String lstring=name.toLowerCase();
	System.out.println(lstring);
	
	//trimmmed
	String nonTrimmedstring="   Harry    ";
	System.out.println(nonTrimmedstring);
			
				

	}

}
