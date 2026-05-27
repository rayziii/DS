package tres;

public class Assistente extends Funcionario {

    public Assistente(String nome, double salario) {
        super(nome, salario);
    }

    public void listarDados() {
        System.out.println("-- Dados do Assistente --");
        super.listarDados();
    }
	
}
