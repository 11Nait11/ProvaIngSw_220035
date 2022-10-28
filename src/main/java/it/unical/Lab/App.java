package it.unical.Lab;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	FunnyAlgorithms2 fa=new FunnyAlgorithms2();
    	String b="55555555";
    	int a = 0;
		try {
			a = fa.stringToIntConverter(b);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	System.out.println(a);
    }
}
