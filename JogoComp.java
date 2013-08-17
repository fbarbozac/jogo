/*
	Author: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class JogoComp
{
	void executaJogo()
	{	
		java.io.Console c = System.console();

		Pergunta per = new Pergunta();
		Jogador jog = new Jogador();
		Resposta con = new Resposta();
		Cronometro cro = new Cronometro();		
		Tela tel = new Tela();
		Integer rodadas = Integer.valueOf(c.readLine("Entre a qtd de rodadas: "));

		jog.setNome(c.readLine("Qual seu nome: "));

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