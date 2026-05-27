
public class Main {

	public static void main(String[] args) {
		
		double valor = 1000;
		
		Icms icms = new Icms();
		Iss iss = new Iss();
		Ipi ipi = new Ipi();
		
		 System.out.println("ICMS: " + icms.calcular(valor));
	     System.out.println("ISS: " + iss.calcular(valor));
	     System.out.println("IPI: " + ipi.calcular(valor));
		
	}
		
}
