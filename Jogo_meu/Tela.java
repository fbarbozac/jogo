/*
	Author: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class Tela
{
	void imprimePontos(String nome, int pontos, long t)
	{
		System.out.printf("Resultado:\n\t%s, você fez %s pontos em "+
						 "%s segundos\n", nome, pontos, t);
	}

	void imprimePergunta(int p1, int p2, String frase)
	{
		System.out.printf(" %s %s %s ?\n", p1, frase, p2);
	}
}