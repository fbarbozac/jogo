/*
	Author: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class Cronometro 
{
	java.util.Date tempoInicial;

	void inicia()
	{
		tempoInicial = new java.util.Date();
	}
	
	long msPercorrido() 
	{
		java.util.Date tempoFinal = new java.util.Date();
		return (tempoFinal.getTime() - tempoInicial.getTime());
	}

	long sPercorrido() 
	{
		return (msPercorrido() / 1000);
	}
}