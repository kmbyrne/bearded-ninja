import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class MaxContSubTest extends TestCase {
    MaxContSub m = new MaxContSub();

    @Before
    public void setup(){
        m = new MaxContSub();
    }

    @Test
    public void testFindMaximumValueContguousSubsequence() throws Exception {
        int[] array = {5, -6, 7, 12, -3, 0, -11, -6};
        assertEquals(19, m.findMaximumValueContiguousSubsequence(array));

        int[] array2 = {-5, -1, 2, -3, 0, -3, 3};
        assertEquals(3, m.findMaximumValueContiguousSubsequence(array2));

    }

    @Test
    public void testFindLongestIncreasingSubsequence(int[] array) {
        int[] array = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 4, 11, 7, 15};
        int[] solution = {0, 2, 6, 9, 11, 15};

        assertEquals(solution, testFindLongestIncreasingSubsequence(array));
    }
}