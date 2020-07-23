import org.testng.annotations.*;

public class TC2 {

    @BeforeSuite
    void beforeSuite(){
        System.out.println("This will execute before the Suite");
    }

    @AfterSuite
    void afterSuite(){
        System.out.println("This will execute after the Suite");
    }
    @BeforeClass
    void beforeClass() {
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    void afterClass() {
        System.out.println("This will execute after the Class");
    }

    @BeforeMethod
    void beforeMethod() {
        System.out.println("This will execute before every Test Method");
    }

    @AfterMethod
    void afterMethod() {
        System.out.println("This will execute after every Test Method");
    }

    @Test
    void test3() {
        System.out.println("This is test 3...");
    }

    @Test
    void test4() {
        System.out.println("This is test 4...");
    }

}
