import java.util.Scanner;

public class Exercício2 {

	public static void saudacaoPersonalizada() {
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Insira o nome: ");
		String nome = ler.nextLine();
		
		String primeira = nome.substring(0,1);
        String resto = nome.substring(1, nome.length());
		
		System.out.println("Olá, " + primeira.toUpperCase() + resto + " seja bem vindo(a)!");
		
		ler.close();
	}
	
	public static void main (String [] args) {
		
		saudacaoPersonalizada();	
		
	}
	
}
 