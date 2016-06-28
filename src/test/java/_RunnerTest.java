import static org.testng.Assert.*;

/**
 * Created by ivanpryshchepau on 6/23/16.
 */
public class _RunnerTest {
    @org.testng.annotations.Test
    public void testCombine() throws Exception {
        _Runner.combine(2);
        assertEquals(_Runner.result, new int[]{34,8456,87,6,4,567,67,84,5,7,99,8456,56});
    }

}