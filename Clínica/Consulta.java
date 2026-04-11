
import java.time.LocalDateTime;

public class Consulta {
    private Paciente paciente;
    private Medico medico;
    private LocalDateTime data;

    //construtor consulta
    public Consulta(Paciente paciente, Medico medico, LocalDateTime data) {
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    public void exibir() {
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Médico: " + medico.getNome());
        System.out.println("Especialidade: " + medico.getEspecialidade().getNome());
        System.out.println("Data: " + data);
    }
}