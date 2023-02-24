package ubu.gii.dass.test.c01;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import ubu.gii.dass.c01.Client;


public class ClientTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link ubu.gii.dass.c01.Client#main()}.
	 */
	@Test
	public void testmain() {
        Client c = new Client();
        try{
            c.main(null);
        }catch(Exception e){
            fail("No se ha ejecutado el main");
        }
        
        assertNotEquals(c.pool, null);
        assertNotEquals(c.r1, null);
        assertNotEquals(c.r2, null);
        assertNotEquals(c.r3, null);
        assertNotEquals(c.logger, null);
        
		
	}

}