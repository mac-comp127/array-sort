package arraysort;

import org.junit.jupiter.api.Test;

import static arraysort.ArraySort.sort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArraySortTest {

    @Test
    public void testSingleElement() {
        assertArrayEquals(
                new String[]{"7"},
                sort(new String[]{"7"})
        );
    }

}
