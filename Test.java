package Texas;


import junit.framework.TestCase;
public class Test extends TestCase{
	public void setUp() throws Exception 
	{}
	
	public void tearDown() throws Exception 
	{}


	public void test1() 
	{
	     String s4,s5;
	     s4="2H 3D 5S 9C KD";
	     s5="2C 3H 4S 8C AH";
	      Compare instance = new Compare();
	      String  expResult = "White";
	      @SuppressWarnings("static-access")
		String result = instance.compare(s4,s5);
	      System.out.print(result);
	      assertEquals(expResult, result);
	      System.out.println("\r\n");
	 }
	public void test2() 
	{
	     String s6,s7;
	     s6="2H 4S 4C 2D 4H";
	     s7="2S 8S AS QS 3S";
	      Compare instance = new Compare();
	      String  expResult = "Black";
	      @SuppressWarnings("static-access")
		String result = instance.compare(s6,s7);
	      System.out.print(result);
	      assertEquals(expResult, result);
	      System.out.println("\r\n");
	 }
	public void test3() 
	{
	     String s6,s7;
	     s6="2H 3D 5S 9C AD";
	     s7="2C 3H 4S 8C KH";
	      Compare instance = new Compare();
	      String  expResult = "Black";
	      @SuppressWarnings("static-access")
		String result = instance.compare(s6,s7);
	      System.out.print(result);
	      assertEquals(expResult, result);
	      System.out.println("\r\n");
	 }
	public void test4() 
	{
	     String s6,s7;
	     s6="2H 3D 5S 9C KD ";
	     s7="2D 3H 5C 9S KH";
	      Compare instance = new Compare();
	      String  expResult = "Tie";
	      @SuppressWarnings("static-access")
		String result = instance.compare(s6,s7);
	      System.out.print(result);
	      assertEquals(expResult, result);
	 }

}
