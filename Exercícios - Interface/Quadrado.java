package dois;

class Quadrado extends Figuras {

	double lado;
	
    public Quadrado(double lado) {
        this.lado = lado;
    }

    double calcularArea() {
        return lado * lado;
    }
}

