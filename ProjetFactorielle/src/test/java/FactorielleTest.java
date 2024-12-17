import com.moussadev.Factorielle;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorielleTest {
        @Test
        public void testFac(){
         Factorielle factorielle = new Factorielle();
         int resul = factorielle.fact(5);
         assertEquals(120,resul);
        }
}
