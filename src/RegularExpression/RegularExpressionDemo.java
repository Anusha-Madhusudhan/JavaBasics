package RegularExpression;

import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		 
		System.out.println(Pattern.matches(".m", "am")); //true
		
		System.out.println(Pattern.matches("..m", "am"));  //false
		
		System.out.println(Pattern.matches("[abc]", "am"));  //false it operates on single character. but we have provided 2 character "am"
		
		System.out.println(Pattern.matches("[abc]", "d"));  //false
		
		System.out.println(Pattern.matches("[abc]", "c"));  //true
		
		System.out.println(Pattern.matches("[^abc]", "x"));  //true
		
		System.out.println(Pattern.matches("[^abc]", "b"));  //false
		
		System.out.println(Pattern.matches("[^abc]", "nv")); //false  it operates on single character. but we have provided 2 character "nv"
		
		System.out.println(Pattern.matches("[a-zA-Z]", "a"));  //true
		
		
		System.out.println(Pattern.matches("[a-dA-S]", "T")); //false
		
		System.out.println(Pattern.matches("[0-9]", "8"));  //true
		
		System.out.println(Pattern.matches("[xyz]{3}?", "xyz")+"ttttttttttttttt");  //true once or not
		
		System.out.println(Pattern.matches("[xyz]+", "xyz"));  //true   once or more
		
		System.out.println(Pattern.matches("[xyz]*", ""));   // true    zero or more
		
		System.out.println(Pattern.matches("[xyz]?", "xx"));  //false
		
		System.out.println(Pattern.matches("\\d", "1"));  // true
		
		System.out.println(Pattern.matches("\\d", "12")); // false bcz operates only on single character
		
		System.out.println(Pattern.matches("\\d", "1a"));  //false
		
		System.out.println(Pattern.matches("\\D", "1"));  //false
		
		System.out.println(Pattern.matches("\\D", "a"));  //true 
		
		
		System.out.println(Pattern.matches("\\d{3}", "123"));  // true 3 characters 
		
		System.out.println(Pattern.matches("[a-z]{3}", "xyz")); //true
		
		
		System.out.println(Pattern.matches("[AB][a-z]{5}", "Anusha"));  // true 1st letter is AorB rest 5 letters between a-z
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9.-_]+@+[a-zA-Z.]+$", "anu_sha@gmail.com")); //true
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9.-_]+@+[a-zA-Z.]+$", "anu_shagmail.com")); //false
		
		System.out.println(Pattern.matches("^[a-zA-Z0-9.-_]+@+[a-zA-Z.]+$", "@yahoo.com"));  //false
		
		
		
		System.out.println(Pattern.matches("^[^.][a-zA-Z0-9.-_]+@+[a-zA-Z.]+[^.]$", "anusha.basavaraj@yahoo.com."));  // false end should not ends with .=>[^.]

		System.out.println(Pattern.matches("^[^.][a-zA-Z0-9.-_]+@+[a-zA-Z.]+[^.]$", ".anusha.basavaraj@yahoo.com"));  //false email should not starts with . ==>[^.]
		
		
		System.out.println(Pattern.matches("^[^.](?:\\.[a-zA-Z0-9.-_])+@+[a-zA-Z.]+[^.]$", "anusha.basavaraj@yahoo.com"));  // false no Consecutive .. are allowed ==>?:\\.
		
		System.out.println(Pattern.matches("^[^.][a-zA-Z0-9.-_]+@+[a-zA-Z.]+[^.]$", "anusha..basavaraj@yahoo..com")); //true bcz here we have not added  ==>  ?:\\. to verify Consecutive .. 
		
	}

}
