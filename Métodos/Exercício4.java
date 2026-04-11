import java.util.Scanner;


public class Exercício4 {

    public static void dadosUsuario(String nome, String idade, String email, String peso) {

        System.out.println("Nome: " + nome.toUpperCase());
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email.toLowerCase());

        if (peso.length() > 2) {
        	
        	 String parte1 = peso.substring(0,2);
        	 String parte2 = peso.substring(2,3);
        
        System.out.println("Peso: " + parte1 + "," + parte2 + " kg");
        
        } else if (peso.length() == 2) {
        		System.out.println("Peso: " + peso + ",0 kg");
        }
      
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o seu nome: ");
        String nome = ler.nextLine();

        System.out.println("Insira a sua idade: ");
        String idade = ler.nextLine();

        System.out.println("Insira o seu e-mail: ");
        String email = ler.nextLine();

        System.out.println("Insira o seu peso (apenas números): ");
        String peso = ler.nextLine();

        dadosUsuario(nome, idade, email, peso);

        ler.close();
    }
}