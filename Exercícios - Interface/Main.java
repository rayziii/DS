package tres;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente("Lilian");
        Assistente assistente = new Assistente("Andreia", 2500.0);

        gerente.listarDados();
        gerente.aprovarFolga();

        System.out.println();

        assistente.listarDados();
    }
    
}
