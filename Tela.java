/*
	Authors: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class Tela
{
	private java.io.Console c = System.console();

	void imprime(String ... str)
	{
		String temp = "";
		for(int i=0; i<str.length; i++ )
		{
			temp +=str[i]+" ";
		}	
		System.out.printf("%s", temp);
	}

	String imprimeEle(String str)
	{
		return c.readLine(str);
	}
}