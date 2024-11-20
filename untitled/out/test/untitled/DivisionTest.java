import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {
    int a = 10;
    int b = 5;

    @Test
    void division() throws Exception {
        long result = Division.division(a, b);
        assertEquals(2.0, result);
    }

    @Test
    void divisionUsingLoop() throws Exception {
        long result = Division.divisionUsingLoop(a, b);
        assertEquals(2.0, result);
    }

    @Test
    void divisionUsingRecursion() throws Exception {
        long result = Division.divisionUsingRecursion(a, b);
        assertEquals(2.0, result);
    }

    @Test
    void divisionUsingMultiplication() throws Exception {
        long result = Division.divisionUsingMultiplication(a, b);
        assertEquals(2.0, result);
    }

    @Test
    void divisionUsingShift() throws Exception {
        long result = Division.divisionUsingShift(a, b);
        assertEquals(2.0, result);
    }

    @Test
    void divisionUsingLogs() throws Exception {
        long result = Division.divisionUsingLogs(a, b);
        assertEquals(2.0, result);
    }
}