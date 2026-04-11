import java.util.Scanner;

public class Exercício4 {

    public static long calcularFatorial(int numero) {
    	
        long fatorial = 1;

        for (int i = 1; i <= numero; i++) {
        	
            fatorial = fatorial * i;
            
        }

        return fatorial;
    }

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.println("Insira um número: ");
        int numero = ler.nextInt();

        long resultado = calcularFatorial(numero);

        System.out.println("Fatorial: " + resultado);

        ler.close();
    }
}