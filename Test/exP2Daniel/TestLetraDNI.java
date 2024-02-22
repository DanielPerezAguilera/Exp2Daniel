package exP2Daniel;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestLetraDNI {

    @Test
    void testObtenerLetraDNI() {
        int dni = 43171728; 
        char expected = 'S'; 
        char result = LetraDNI.obtenerLetraDNI(dni);

        assertEquals(expected, result);
    }
}

		
		
		