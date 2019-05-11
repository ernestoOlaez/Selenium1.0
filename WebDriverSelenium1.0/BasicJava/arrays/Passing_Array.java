package arrays;

public class Passing_Array
{

	public static void main(String[] args) 
	{
		//Declaring an Array
		String [] aMake= {"BMW", "AUDI", "TOYOTA", "SUSUKI", "HONDA"};
		//Calling print array and passing an array as parameter
		
		Print_Array(aMake);
	}
		
	public static void Print_Array(String []array)
	{
		for(int i=0; i<=array.length-1; i++)
		{
			System.out.println("Print all the values of an Array== > " + array[i]);
		}
			
	}
		

	}


