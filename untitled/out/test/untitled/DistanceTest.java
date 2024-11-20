import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanceTest {
    long[] testOne = {1, 5};
    long[] testTwo = {5, 6};

    double x1 = 5.0;
    double x2 = 3.0;
    double y1 = 6.0;
    double y2 = 2.0;

    double xOne = 6.0;
    double xTwo = 6.0;
    double yOne = 2.0;
    double yTwo = 3.0;


    @Test
    public void chebyshevDistance() throws Exception {
        long value = Distance.chebyshevDistance(testOne, testTwo);
        assertEquals(4, value);
    }

    @Test
    void squaredDistance() throws Exception {
        double value = Distance.squaredDistance(x1, y1, x2, y2);
        assertEquals(20, value);
    }

    @Test
    void euclideanDistance() throws Exception {
        double value = Distance.euclideanDistance(xOne, yOne, xTwo, yTwo);
        assertEquals(1, value);

    }
}