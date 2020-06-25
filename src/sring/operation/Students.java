package sring.operation;

public class Students {

	public static void main(String[] args) {
		String ab = "this is just a demo";
	
		
		String str1 = new String("Hi my name is Adam and my major is math.");
        System.out.println(str1);
        String str2 = "I am Joe, I am interested in becoming a doctor.";
        System.out.println(str2);
        System.out.println("Hello everyone my Sam, not sure what I want to do yet.");
        String str3 = new String ("Adam is also good in English,");
        String str4 = new String ( " Adam and Sam are both brothers.");
        System.out.println (str3 + str4);
        System.out.println("college math is hard for many of you ,but if you work hard you will make it.");
	    
        //to add
        System.out.println(ab.substring(8,9));
        //lower case
        System.out.println(ab.toLowerCase());
        //upper case
        System.out.println(ab.toUpperCase());
        //does exit
        System.out.println(ab.contains("s"));
        //ends with
        System.out.println(ab.endsWith("s"));
        //hash code 
        System.out.println(ab.hashCode());
        //trim
        System.out.println(ab.trim() + "codes ");
        //replace
        System.out.println(ab.replace('g','f'));
        //getBytes
        System.out.println(ab.getBytes());
        //equals
        System.out.println(ab.equals("Hello"));
	    //isEmpty
        System.out.println(ab.isEmpty());
        //lastIndex
        System.out.println(ab.lastIndexOf("s"));
        //Index
        System.out.println(ab.indexOf("s"));
        //length
        System.out.println(ab.length());
        //
        System.out.println(ab.substring(8));
        //
        System.out.println(ab.codePointAt(1));
        
        
        
	
	
	
	}   
	
	
	

}
