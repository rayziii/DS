import java.util.Scanner;

public class Exercício3 {

    public static int[] inserirNumeros() {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o primeiro número aleatório (1 à 100): ");
        int num1 = ler.nextInt();

        System.out.println("Insira o segundo número aleatório (1 à 100): ");
        int num2 = ler.nextInt();
        
        System.out.println("Inseridos: " + num1 + " e " + num2);
        
        ler.close();

        return new int[]{num1, num2};
        
    }

    public static int[] sortearNumeros() {

        int num3 = (int)(Math.random() * 100) + 1;
        int num4 = (int)(Math.random() * 100) + 1;

        System.out.println("Sorteados: " + num3 + " e " + num4);

        return new int[]{num3, num4};
    }

    public static void compararNumeros(int num1, int num2, int num3, int num4) {

        if (num1 == num2 && num2 == num3 && num3 == num4) {
        	
            System.out.println("True.");
            
        } else {
        	
            System.out.println("False.");
            
        }
    }

    public static void main(String[] args) {

        int[] inseridos = inserirNumeros();
        int[] sorteados = sortearNumeros();

        compararNumeros(
                inseridos[0],
                inseridos[1],
                sorteados[0],
                sorteados[1]
        );
    }
}