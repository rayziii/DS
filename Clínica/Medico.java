
//herança
public class Medico extends Pessoa {
    private String crm;
    private Especialidade especialidade;
    
    //construtor medico
    public Medico(Long id, String nome, String cpf, String email, String telefone,
                  String crm, Especialidade especialidade) {
        super(id, nome, cpf, email, telefone);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    //retorna a especialidade do médico
    public Especialidade getEspecialidade() {
        return especialidade;
    }
}