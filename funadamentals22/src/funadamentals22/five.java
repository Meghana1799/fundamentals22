package funadamentals22;

public class five {
	public static void main(String[] args) {
		int n;
        
        System.out.print("Enter the number you want to check:");
        n=Integer.parseInt(args[0]);
        if(n%2== 0)
        {
        	
            System.out.println("The given number "+n+" is even");
        }
        else
        {
            System.out.println("The given number "+n+" is odd");
        }

	}

}
