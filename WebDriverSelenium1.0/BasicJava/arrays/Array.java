package arrays;

public class Array
{

	public static void main(String[] args)
	{
		String [] aMake= {"BMW", "AUDI","TOYOTA", "HONDA"};
				
				//This is to store the size of the array.
				int iLenght=aMake.length;
				System.out.printf("El tamaño del arreglo es: %s \n", iLenght);
				//System.out.println();
				
				//This is for access the first element of an array directly with it's posicion.
				String sBMW=aMake[0];
				System.out.printf("First value of the array is => %s\n", sBMW);
				//System.out.println();
				
				//This access to the last element of an Array
				String sHonda=aMake[3];
				System.out.printf("First value of the array is => %s\n", sHonda);
				//System.out.println();
				
				//This is for print all the element values of an Array
				for(int i=0; i<=iLenght-1; i++)
				{
					System.out.println("The value stored at posicion " +i+ " in Array is ==> " + aMake[i]);
				}
					
				
		}


	}


