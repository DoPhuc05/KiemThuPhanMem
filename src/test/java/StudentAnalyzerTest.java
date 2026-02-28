import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.jupiter.api.Assertions.*;

public class StudentAnalyzerTest {

    StudentAnalyzer analyzer = new StudentAnalyzer();

    // ===== TEST countExcellentStudents =====

    @Test
    public void testCountExcellent_NormalCase() {
        assertEquals(2,
                analyzer.countExcellentStudents(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)));
    }

    @Test
    public void testCountExcellent_AllValid() {
        assertEquals(3,
                analyzer.countExcellentStudents(
                        Arrays.asList(8.0, 9.0, 10.0)));
    }

    @Test
    public void testCountExcellent_EmptyList() {
        assertEquals(0,
                analyzer.countExcellentStudents(
                        Collections.emptyList()));
    }

    @Test
    public void testCountExcellent_BoundaryValues() {
        assertEquals(2,
                analyzer.countExcellentStudents(
                        Arrays.asList(0.0, 7.9, 8.0, 10.0)));
    }

    @Test
    public void testCountExcellent_AllInvalid() {
        assertEquals(0,
                analyzer.countExcellentStudents(
                        Arrays.asList(-5.0, 15.0)));
    }


    // ===== TEST calculateValidAverage =====

    @Test
    public void testCalculateAverage_NormalCase() {
        assertEquals(8.17,
                analyzer.calculateValidAverage(
                        Arrays.asList(9.0, 8.5, 7.0, 11.0, -1.0)),
                0.01);
    }

    @Test
    public void testCalculateAverage_AllValid() {
        assertEquals(9.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(8.0, 9.0, 10.0)),
                0.01);
    }

    @Test
    public void testCalculateAverage_EmptyList() {
        assertEquals(0,
                analyzer.calculateValidAverage(
                        Collections.emptyList()),
                0.01);
    }

    @Test
    public void testCalculateAverage_BoundaryValues() {
        assertEquals(5.0,
                analyzer.calculateValidAverage(
                        Arrays.asList(0.0, 10.0)),
                0.01);
    }

    @Test
    public void testCalculateAverage_AllInvalid() {
        assertEquals(0,
                analyzer.calculateValidAverage(
                        Arrays.asList(-2.0, 12.0)),
                0.01);
    }
}