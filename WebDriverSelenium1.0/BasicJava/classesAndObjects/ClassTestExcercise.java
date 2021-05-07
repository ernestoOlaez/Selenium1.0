package classesAndObjects;

public class ClassTestExcercise {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		Car Toyota=new Car();
		System.out.println("Hello this  is my Toyota:");
		Toyota.bLeftHandDrive = true;
		 Toyota.iDoors = 4;
		 Toyota.iGear = 5;
		 Toyota.iHighestSpeed = 200;
		 Toyota.iMake = 2014;
		 Toyota.iTyres = 4;
		 Toyota.sColor = "Black";
		 Toyota.sTransmission = "Manual";
		 Toyota.sModel = "Camry";
		 
		 Toyota.DisplayCharacterstics();

	}

}
