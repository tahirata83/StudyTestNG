import org.testng.annotations.*;

public class TC1 {
    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before the Test" );
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after the Test" );
    }
    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before the Class");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after the Class");
    }
    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every Test Method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every Test Method");
    }
    @Test
    void test1(){
        System.out.println("This is test 1...");
    }

    @Test
    void test2(){
        System.out.println("This is test 2...");
    }

}
