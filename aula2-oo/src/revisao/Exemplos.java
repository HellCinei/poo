package revisao;

public class Exemplos {
	
	public static void main(String[] args)
	{
		int i = 1;
		
		while (i <= 10)
		{
			System.out.println(i);
			i++;
		}
		
		i = 1;
		
		System.out.println("*****Próximo*****");
		
		do
		{
			System.out.println(i);
			i++;
		} while (i <= 10);
		
		System.out.println("*****Próximo*****");
		
		for (int j = 1; j <= 10; j++)
		{
			System.out.println(j);	
		}
		
		System.out.println("*****Próximo*****");
		
		String[] nomes = {"João", "Pedro", "José", "Ana"};
		
		for (int k = 0; k < nomes.length; k++)
		{
			System.out.println(nomes[k]);
		}
		
		System.out.println("*****Próximo*****");
		
		for (String n: nomes)
		{
			System.out.println(n);
		}
		
		System.out.println("*****Próximo*****");
		
		for (int l = 0; l < nomes.length; l++)
		{
			if(l >= 1 && l<=2)
			{
				continue;
			}
			System.out.println(nomes[l]);
		}
	}
	
}
