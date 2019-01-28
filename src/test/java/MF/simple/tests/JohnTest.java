package MF.simple.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class SwitchToFrame_ID {
public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver(); //navigates to the Browser
	    driver.get("http://demo.guru99.com/test/guru99home/"); 
	       // navigates to the page consisting an iframe

	       driver.manage().window().maximize();
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

			System.out.println("********We are switch to the iframe*******");
     		driver.findElement(By.xpath("html/body/a/img")).click();
  		    //Clicks the iframe
       
  			System.out.println("*********We are done***************");
      }
}		

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
