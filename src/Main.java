import Pkg_Add.Add;


public class Main {
	public static void main(String arg[])
	{
		Add add = new Add();
		int result = add.Add(20,20);
		System.out.println(result);
	}
	//change by sangvt
	@Test
	public void testAdd() 
	{
	    int x  = 1 ; int y = 1;
	    Add add = new Add();
	    assertEquals(2, add.Add(x,y));
	}
}
