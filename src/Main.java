import Pkg_Add.Add;


public class Main {
	public static void main(String arg[])
	{
		Add add = new Add();
		int result = add.Add(20,20);
		System.out.println(result);
	}
	public boolean test()
	{
		return add.Add(1,2) == 3;
	}
}
