import java.util.Scanner;

public class Exercício1 {

    public static void inserirNome(String nome) {

        if (nome.length() < 3) {
        	
        	String primeira = nome.substring(0,1);
            String resto = nome.substring(1, nome.length());
            
            System.out.println("Nome inválido: " + primeira.toUpperCase() + resto);
            System.out.println("Por favor insira um nome com mais de 3 caractéres.");
            
        } else {
        	
        	String primeira = nome.substring(0,1);
            String resto = nome.substring(1, nome.length());
        	
            System.out.println("Nome válido: " +  primeira.toUpperCase() + resto);
        }
        
        
        

    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o nome: ");
        String nome = ler.nextLine();

        inserirNome(nome);
        
        ler.close();

    }
}