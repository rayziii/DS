
public class Pessoa {
    protected Long id;
    protected String nome;
    protected String cpf;
    protected String email;
    protected String telefone;
    
    //construtor pessoa
    public Pessoa(Long id, String nome, String cpf, String email, String telefone) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }
    
    //valida o cpf
    public boolean validarCpf(String cpf) {
    	//cpf tem que existir e ter comprimento igual a 11 caractéres
        return cpf != null && cpf.length() == 11;
    }

    public String getNome() {
        return nome;
    }
}