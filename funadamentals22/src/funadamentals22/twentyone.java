package funadamentals22;

public class twentyone {
	public static void main(String[] args) {
	 int num = 122, reversedInteger = 0, remainder, originalInteger;
     originalInteger = num;
     
     while( num != 0 )
     {
         remainder = num % 10;
         reversedInteger = reversedInteger * 10 + remainder;
         num  /= 10;
     }
    
     if (originalInteger == reversedInteger)
         System.out.println(originalInteger + " is a palindrome.");
     else
         System.out.println(originalInteger + " is not a palindrome.");
 }
}