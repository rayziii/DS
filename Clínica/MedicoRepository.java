
import java.util.ArrayList;
import java.util.List;

public class MedicoRepository {
    private List<Medico> medicos = new ArrayList<>();

    public void cadastrar(Medico medico) {
        medicos.add(medico);
    }

    public void listar() {
        medicos.forEach(m -> System.out.println(m.getNome()));
    }
}