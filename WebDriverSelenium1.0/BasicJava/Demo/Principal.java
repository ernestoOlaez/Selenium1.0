package Demo;

public class Principal 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//System.out.println("Hi");
		String input=new String("abcdefbbcd");
		String output=new String();
		for(int i=0; i< input.length()-1; i++)
		{
				if(input.charAt(i)!= input.charAt(i+1))
				{
					output+=input.charAt(i);
										
				}
			}
		System.out.println("==>:"+output);

		}
	
        
	}


