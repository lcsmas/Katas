package missinginteger;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    Solution solution= new Solution();

    @Test
    public void case1() {

        assertEquals(5, solution.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }
    @Test
    public void case2() {

        assertEquals(4, solution.solution(new int[]{1, 2, 3}));
    }
    @Test
    public void case3() {

        assertEquals(1, solution.solution(new int[]{-1, -3}));
    }
}