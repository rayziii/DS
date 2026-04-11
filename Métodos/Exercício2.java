import java.util.Scanner;

public class Exercício2 {

    public static void verificarIdade() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        int idade = ler.nextInt();

        if (idade > 17) {
            System.out.println("Maior de idade.");
        } else {
            System.out.println("Menor de idade.");
        }
        
        ler.close();
    }

    public static void main(String[] args) {

        verificarIdade();

    }
}