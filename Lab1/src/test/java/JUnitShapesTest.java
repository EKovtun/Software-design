import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.kovtunea.shapes.Circle;
import ru.kovtunea.shapes.Rectangle;
import ru.kovtunea.shapes.Square;

import static org.junit.jupiter.api.Assertions.*;

public class JUnitShapesTest {

    @Test
    public void testCircle() {
        Assertions.assertEquals(new Circle(0).area(), 0, "Error in getting area from 0 for a circle");
        assertEquals(new Circle(1).area(), Math.PI, "Error in getting area from 1 for a circle");
        assertEquals(new Circle(10).area(), Math.PI * 100, "Error in getting area from 10 for a circle");

        assertThrows(IllegalArgumentException.class, () -> new Circle(-1), "Error in checking negative parameters for a circle");
        assertThrows(IllegalArgumentException.class, () -> new Circle(-10), "Error in checking negative parameters for a circle");

        assertDoesNotThrow(() -> { new Circle(1); }, "Error in checking positive parameters for a circle");
    }

    @Test
    public void testRectangle() {
        Assertions.assertEquals(new Rectangle(1, 5).area(), 5, "Error in getting area from 1,5 for a rectangle");
        assertEquals(new Rectangle(5, 1).area(), 5, "Error in getting area from 5,1 for a rectangle");
        assertEquals(new Rectangle(10, 7).area(), 70, "Error in getting area from 10,7 for a rectangle");

        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, 1), "Error in checking negative parameters for a rectangle");
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(1, -1), "Error in checking negative parameters for a rectangle");
        assertThrows(IllegalArgumentException.class, () -> new Rectangle(-1, -1), "Error in checking negative parameters for a rectangle");

        assertDoesNotThrow(() -> { new Rectangle(1, 1); }, "Error in checking positive parameters for a rectangle");
    }

    @Test
    public void testSquare() {
        Assertions.assertEquals(new Square(1).area(), 1, "Error in getting area from 1 for a square");
        assertEquals(new Square(5).area(), 25, "Error in getting area from 5 for a square");
        assertEquals(new Square(7).area(), 49, "Error in getting area from 7 for a square");

        assertThrows(IllegalArgumentException.class, () -> new Square(-1), "Error in checking negative parameters for a square");
        assertThrows(IllegalArgumentException.class, () -> new Square(-10), "Error in checking negative parameters for a square");

        assertDoesNotThrow(() -> { new Square(1); }, "Error in checking positive parameters for a square");
    }

}
