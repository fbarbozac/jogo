/*
	Author: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

	class Jogador
	{
		int pontos;
		String nome;

		void pontua()
		{
			this.pontos++;
		}

		void setNome(String nome)
		{
			this.nome = nome;
		}
	}