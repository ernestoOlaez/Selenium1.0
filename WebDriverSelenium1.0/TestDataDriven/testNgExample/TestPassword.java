package testNgExample;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

public class TestPassword 
{
	@Test
	public void TestPasswordLenght()
	{
		PasswordValidator pv=new PasswordValidator();
		AssertJUnit.assertEquals(true,pv.isValid("Abc123"));
	}

}
