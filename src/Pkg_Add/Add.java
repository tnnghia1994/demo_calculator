package Pkg_Add;

public class Add {
	public int Add(int a, int b)
	{
		return a+b+1;
	}
}

//change by sangvt
@Test
public void testAdd() 
{
    int x  = 1 ; int y = 1;
    assertEquals(2, Add.Add(x,y));
}
