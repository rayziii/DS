
public class Soma {

	public static void main(String[] args) {
		
		int matriz [] [] = new int [4] [4];
		
		int num = 1;
		
		int soma = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
			
				matriz [i] [j] = num;
				num++;
				
				System.out.print(matriz [i] [j] + " ");
				
				soma += matriz [i] [j];
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println(" ");
		System.out.println("Soma = " + soma);
		
		
	}
}



