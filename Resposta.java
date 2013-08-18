/*
	Authors: Guilherme & Fernando 
	Date: 10/Ago/2013
	Description: Implementation of a kinf of quiz game in Java.
*/
import java.io.IOException;

class Resposta
{
	
	String resposta;
	String possRespS[] = {"Sim", "sim", "s", "S", "si", "sIm",
						  "siM", "claro", "é", "e", "obvio", 
						  "SIM", "sIM", "SIm"};
	
	String possRespN[] = {"Não","não","n","N","NÃO","nÃo","nãO",
						  "nao","NAO","Nao","nAo", "naO", 
						  "nAO", "NAo"};

	boolean gabaritoResposta(int a, int b, String oper)
	{
		boolean ret =false;
		switch(oper)
		{
			case "!=":
				ret = (a != b);
			break;
			
			case "=":
				ret = (a == b);
			break;

			case ">":
				ret = (a > b)? true: false;
			break;

			case "<":
				ret = (a < b)? true : false;
			break;
		}
		return ret;
	}

	void armResposta(String var)
	{
		this.resposta = var;
	}

	boolean verifRes(boolean var)
	{
		if (var)
		{
			for(int i=0; i<this.possRespN.length; i++)
			{
				if(this.resposta.equals(this.possRespS[i]))
				{
					return true;
				}
			}
		}else
		{
			for(int i=0; i<this.possRespN.length; i++)
			{
				if(this.resposta.equals(this.possRespN[i]))
				{
					return true;
				}
			}
		}
	return false;
	}
}	