package MF.simple.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class JohnTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public JohnTest( String testName )
    {
        super( testName );
    }


    /**
     * Rigourous Test :-)
     */
    public void testAppA()
    {
        alert(1);
        assertTrue( true );
    }

    public void testAppB()
    {
        assertTrue( true );
    }

    public void testAppC()
    {
        assertTrue( true );
    }

    public void testAlwaysFail()
    {
        assertTrue( true );
    }
}
