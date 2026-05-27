package dois;

class Retangulo extends Figuras {
	
	   double base;
	    double altura;

	    public Retangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    double calcularArea() {
	        return base * altura;
	    }
}

