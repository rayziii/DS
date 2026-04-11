import java.util.Scanner;

public class Exercício3 {
	
	public static void inserirCep() {
			
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o seu CEP (apenas números): ");
		String cep = ler.nextLine();
		
		String parte1 = cep.substring(0,5);
		String parte2 = cep.substring(5,8);
		
		System.out.println(parte1 + "-" + parte2);
		
		ler.close();
		
	}

	public static void main(String[] args) {
	
		inserirCep();
		
	}

}
