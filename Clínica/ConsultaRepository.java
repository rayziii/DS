
import java.util.ArrayList;
import java.util.List;

public class ConsultaRepository {
    private List<Consulta> consultas = new ArrayList<>();

    public void cadastrar(Consulta consulta) {
        consultas.add(consulta);
    }

    public void listar() {
        consultas.forEach(Consulta::exibir);
    }
}