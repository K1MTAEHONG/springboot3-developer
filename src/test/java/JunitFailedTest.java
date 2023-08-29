import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class JunitFailedTest {

    @DisplayName("1 + 3는 4이다.")
    @Test

    public void junitFailedTest(){
        int a = 1;
        int b = 3;
        int sum = 3;

        Assertions.assertEquals(a+b, sum);
    }
}
