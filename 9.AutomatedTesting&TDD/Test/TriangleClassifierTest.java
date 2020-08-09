import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void typeOfTriangle() {
        String expexted = "Tam giac can";
        String result = TriangleClassifier.typeOfTriangle(0,1,2);
        assertEquals(expexted,result);


    }
}