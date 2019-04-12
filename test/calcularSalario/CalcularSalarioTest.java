
package calcularSalario;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class CalcularSalarioTest {
    public CalcularSalario e; 
    public CalcularSalarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        e = new CalcularSalario();
        
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testSomeMethod() {
       
       assertEquals ((1500),e.calcularsalario("DBA", 2000));
        
     
    }
    
}
