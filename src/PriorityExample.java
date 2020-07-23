import org.testng.annotations.Test;

public class PriorityExample {

    @Test(priority = 0)
    void TestOne(){
        System.out.println("This is Test 1");
    }

    @Test(priority = 1)
    void TestTwo(){
        System.out.println("This is Test 2");
    }

    @Test(priority =3, enabled=false)
    void TestThree(){
        System.out.println("This is Test 3");
    }

    @Test(priority = 3)
    void TestFour(){
        System.out.println("This is Test 4");
    }
}
