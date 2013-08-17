/*
	Author: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class JogoComp
{
	public static void main(String[] args)
	{
		java.io.Console c = System.console();

		int numJog = 2;
		Integer nJog[] = new Jogador();

		Pergunta per = new Pergunta();
		Resposta con = new Resposta();
		Cronometro cro = new Cronometro();
		//Jogador jog = new Jogador();
		Tela tel = new Tela();
		
		int rodadas = 10;

		jog[numJog].entraNome(c.readLine("Qual seu nome: "));

		cro.inicia();
		while(rodadas > 0)
		{
			per.escolheOper();
			per.escolhePergunta();

			tel.imprimePergunta(per.pergunta1, per.pergunta2, per.frase);

	 		con.armResposta(c.readLine("->:"));

	 		if (con.verifRes(con.gabaritoResposta(per.pergunta1, 
	 			per.pergunta2, per.oper)))
	 		{
	 		 	jog.pontua();
	 		}
	 		rodadas--;
	 	}
	 	tel.imprimePontos(jog.nome, jog.pontos ,cro.sPercorrido());
	}	
}