package tres;

public class Gerente extends Funcionario {
	   
    public Gerente(String nome) {
        super(nome, 8000.0);
    }

    public void aprovarFolga() {
        System.out.println(nome + " aprovou uma folga.");
    }

    public void listarDados() {
        System.out.println("-- Dados do Gerente --");
        super.listarDados();
    }
    
}
