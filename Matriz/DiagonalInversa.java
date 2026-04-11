
public class DiagonalInversa {

	public static void main(String[] args) {
		
		int matriz [] [] = new int [10] [10];
		
		int num = 1;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
			
				matriz [i] [j] = num;
				num++;
				
				System.out.print(matriz [i] [j] + " ");
				
			}
			
			System.out.println(" ");
			
		}
		
		System.out.println(" ");
		System.out.println("Elementos da Diagonal Inversa:");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz.length; j++) {
				
				if (i + j == matriz.length - 1) {
					System.out.print(matriz [i] [j] + " ");
				}
			}
		}
	}
}
