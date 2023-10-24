import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

import static org.testng.Assert.assertEquals;

public class PersonTest {

    @DataProvider( name = "ageDataProvider")
    Object [][] ageDataProvider (){
        return new Object [] [] {
                { -1 , false },
                { 0 , false },
                { 1 , false },
                { 6, false },
                { 12 , false },
                { 13 , true },
                { 14 , true },
                { 16 , true },
                { 18 , true },
                { 19 , true },
                { 20 , false },
                { 30 , false },
        };
    }

    @Test (dataProvider = "ageDataProvider")
    public void testAge(int age , boolean expectedResult) {
        boolean result = Person.isTeenager( age );
        System.out.println("For age: " + age + ";"  + " Result : " + result + "/");
        assertEquals ( result , expectedResult);
    }
}
