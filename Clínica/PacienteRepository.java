
	
import java.util.ArrayList;
import java.util.List;
	
public class PacienteRepository {
	    private List<Paciente> pacientes = new ArrayList<>();
	
	    public void cadastrar(Paciente paciente) {
	        pacientes.add(paciente);
	    }
	
	    public void listar() {
	        pacientes.forEach(p -> System.out.println(p.getNome()));
	    }
}