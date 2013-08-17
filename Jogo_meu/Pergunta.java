/*
	Author: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/

	class Pergunta
	{
		int pergunta1;
		int pergunta2;
		String oper;
		String frase;

		void escolheOper()
		{
			int oper = new java.util.Random().nextInt(4);
			switch(oper)
			{
				case 0: 
					this.oper = "!=";
					this.frase = "é diferente de";
				 break;
				case 1:
					this.oper = "=";
					this.frase = "é igual a";
					break;
				case 2: 
					this.oper = ">"; 
					this.frase = "é maior que";
					break;
				case 3: 
					this.oper = "<"; 
					this.frase = "é menor que";
					break;
			}
		}

		void escolhePergunta()
		{
			 pergunta1 = new java.util.Random().nextInt(10);
			 pergunta2 = new java.util.Random().nextInt(10);
		}
	}