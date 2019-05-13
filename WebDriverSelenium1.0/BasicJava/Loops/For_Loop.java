package Loops;

public class For_Loop {

	public static void main(String[] args) 
	{
		//This will print -- 0,1,2,3,4,5...100
		for(int Increment=0; Increment<=100; Increment++)
		{
			System.out.println("Count is ==>  " + Increment);
		}
		
		System.out.println("<==== Next Count ====>");
		for(int Decrement=100; Decrement >=0; Decrement--)
		{
			System.out.println("Count is ==>  " + Decrement);
		}


	}

}
