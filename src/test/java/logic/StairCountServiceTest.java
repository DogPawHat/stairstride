package logic;

import models.StairCountRequest;
import org.testng.annotations.*;

import java.util.Arrays;
import java.util.List;

public class StairCountServiceTest {

    @Test()
    public void testStairCount1() {
        List<Integer> flights = Arrays.asList(17);
        int stride = 3;

        StairCountRequest stairCountRequest = new StairCountRequest(flights,stride);

        int result = StairCounter.countStairs(stairCountRequest);

        System.out.println(result);
        assert 6 == result;
    }

    @Test()
    public void testStairCount2() {
        List<Integer> flights = Arrays.asList(17,17);
        int stride = 3;

        StairCountRequest stairCountRequest = new StairCountRequest(flights, stride);

        int result = StairCounter.countStairs(stairCountRequest);

        assert 14 == result;
    }

    @Test()
    public void testStairCount3() {
        List<Integer> flights = Arrays.asList(4,9,8,11,7,20,14);
        int stride = 2;

        StairCountRequest stairCountRequest = new StairCountRequest(flights,stride);

        int result = StairCounter.countStairs(stairCountRequest);

        assert 50 == result;
    }
}
