package Loops;

public class DoWhile_Loop {

	public static void main(String[] args)
	{
		//A do while loop is exactly similar to while loop and the only difference between two is
		//that the do while loop executes the statement at least one time.
		int Count=0;
	     
		//This will print --5,10,15,20,25
		do
		{
			Count=Count+5;
			System.out.println("Count is ==>" + Count);
			
		}while(Count < 25);
		
		
		int CountOnce=25;
		System.out.println("<==== Next Count ====>");
		do
		{
		    System.out.println("Count is ==>"+ CountOnce);	
		}
		while(CountOnce < 25);

	}

}
