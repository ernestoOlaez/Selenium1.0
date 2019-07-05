package Loops;

public class Enhanced_Loop {

	public static void main(String[] args)
	{

		//Array of String storing days of the week
		String days[]= {"Mon","Tue","Wed", "Thr", "Fri", "Sat", "Sun"};
		
		//Enhancement for loop, this will automatically iterate on array list
		for(String dayName: days)
		{
			System.out.println("Days==> "+dayName);
		}
		
		System.out.println("<==== Normal for Loop ====>");
		//Normal for loop
		for(int i=0; i<days.length; i++)
		{
			System.out.println("Days ==>" + days[i]);
		}

	}

}
