/*
	Authors: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

	class Jogador
	{
		private int pontos;
		private String nome;
		private long time;

		void pontua()
		{
			this.pontos++;
		}

		int getPontos()
		{
			return this.pontos;
		}

		void setNome(String nome)
		{
			this.nome = nome;
		}

		String getNome()
		{
			return this.nome;
		}

		void addTime(long t)
		{
			this.time += t;
		}

		long getTime()
		{
			return this.time;
		}
	}