/*
	Authors: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class Cronometro 
{
	private java.util.Date tempoInicial;

	void inicia()
	{
		tempoInicial = new java.util.Date();
	}
	
	long getMsPercorrido() 
	{
		java.util.Date tempoFinal = new java.util.Date();
		return (tempoFinal.getTime() - tempoInicial.getTime());
	}

	long getSPercorrido() 
	{
		return (getMsPercorrido() / 1000);
	}
}