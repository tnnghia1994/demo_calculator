import Pkg_Add.Add;


public class Main {
	public static void main(String arg[])
	{
		Add add = new Add();
		int result = add.Add(10, 20);
		System.out.println(result)
	}
}
public class Test {
	public boolean test()
	{
		return add.Add(10,20) == 30;
	}
}
