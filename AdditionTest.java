import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AdditionTest{

 @Test
public void testThatIsumTwoNumbersToGetFive(){

	int actual = Addition.sumOfNumbers(2, 3);
	int expected = 5;
	
	assertEquals(actual, expected); 
	
	}
}




