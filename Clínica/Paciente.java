
//herança
public class Paciente extends Pessoa {
	
	//construtor paciente
    public Paciente(Long id, String nome, String cpf, String email, String telefone) {
        super(id, nome, cpf, email, telefone);
    }
}