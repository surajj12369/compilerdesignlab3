import java.util.Scanner;


public class Driver {
	static char  l;
	static int i;
	static String s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("Hello");
		Scanner ss =	new Scanner(System.in);
	 s= ss.nextLine();
	 l = s.charAt(i);
	//parser p = new parser();
	S();
	if(l=='$')
	{
		System.out.println("Succesful");
	}
	else{
		System.out.println("Parse error");
	}
	}
	public  static void S()
	{
		if(l=='a')
		{
		match('a');
		}
		else if(l=='^')
		{
		match('^');
		}
		else if(l=='(')
		{
		match('(');
		T();
		match(')');
	}
		}
		
		
	public static void T()
	{
		S();
		Tp();
	}
	public static void Tp()
	{
		if(l==',')
		{
		match(',');
		S();
		Tp();
		}
	}
	public static void match(char t)
	{
		if(l==t)
		{
		l =s.charAt(++i);
		}
	}
}
