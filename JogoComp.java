/*
	Authors: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

class JogoComp
{	
	void executaJogo()
	{
		//Integer rodadas = Integer.valueOf(c.readLine("Entre a qtd de rodadas: "));
		Tela tel = new Tela();
		Integer rodadas = Integer.valueOf(tel.imprimeEle("Entre a quantidade de rodadas: "));
		Integer numJog = Integer.valueOf(tel.imprimeEle("Entre numero de jogadores: "));
		Cronometro cro = new Cronometro();
		Pergunta per = new Pergunta();
		Jogador[] jog = new Jogador[numJog];
		Resposta res = new Resposta();
		int x =1;
		long temp = 0;

		for(int i=0; i<numJog; i++)
		{
			jog[i] = new Jogador ();
			jog[i].setNome(tel.imprimeEle("Qual seu nome: "));
		}

		rodadas *=numJog;
		
		while(rodadas > 0)
		{
			for(int i=0; i<jog.length; i++)
			{
				cro.inicia();
				tel.imprime("\nPergunta "+(x)+" ao jogador "+jog[i].getNome()+":\n");
				per.escolheOper();
				per.escolhePergunta();

				tel.imprime(String.valueOf(per.pergunta1), per.frase, 
							String.valueOf(per.pergunta2));

		 		res.armResposta(tel.imprimeEle("->:"));

		 		if (res.verifRes(res.gabaritoResposta(per.pergunta1, 
		 			per.pergunta2, per.oper)))
		 		{
		 		 	jog[i].pontua();
		 		}
		 		rodadas--;
		 		temp = cro.getSPercorrido();
		 		jog[i].addTime(temp);
		 		//	jog[i].addTime(cro.getSPercorrido());
		 	}
		 	++x;
	 	}
	 	for(int i=0; i<jog.length; i++)
	 	{
	 		tel.imprime("Resultado\n\t"+jog[i].getNome(),",vocë fez "+jog[i].getPontos(),
	 					"pontos em "+jog[i].getTime(), "segundos.\n");
	 	}
	}	
}