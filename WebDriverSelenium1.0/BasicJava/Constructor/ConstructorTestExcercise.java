package Constructor;

public class ConstructorTestExcercise {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Car Toyota = new Car("Camry",2014,true);
		 
		 Toyota.iDoors = 4;
		 Toyota.iGear = 5;
		 Toyota.iHighestSpeed = 200;
		 Toyota.iTyres = 4;
		 Toyota.sColor = "Black";
		 Toyota.sTransmission = "Automatic";
		 
		 //Using Car class method
		 Toyota.DisplayCharacterstics();
		 
		 
	}

}
