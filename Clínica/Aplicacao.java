import java.time.LocalDateTime;
import java.util.Scanner;

public class Aplicacao {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PacienteRepository pacienteRepo = new PacienteRepository();
        MedicoRepository medicoRepo = new MedicoRepository();
        ConsultaRepository consultaRepo = new ConsultaRepository();

        System.out.println("--Cadastro de Consulta--");
        System.out.println(" ");

        //paciente
        System.out.println("- Informações do Paciente");
      
        System.out.println("Nome do paciente: ");
        String nomePaciente = sc.nextLine();

        System.out.println("CPF do paciente: ");
        String cpfPaciente = sc.nextLine();

        System.out.println("Email do paciente: ");
        String emailPaciente = sc.nextLine();

        System.out.println("Telefone do paciente: ");
        String telPaciente = sc.nextLine();

        Paciente p = new Paciente(1L, nomePaciente, cpfPaciente, emailPaciente, telPaciente);

        //especialidade
        System.out.println("- Informações da Especialidade do Médico");
      
        System.out.println("Especialidade do médico: ");
        String nomeEsp = sc.nextLine();

        System.out.println("Descrição da especialidade: ");
        String descEsp = sc.nextLine();

        Especialidade esp = new Especialidade(nomeEsp, descEsp);

        //médico
        System.out.println("- Informações do Médico");
   
        System.out.println("Nome do médico: ");
        String nomeMedico = sc.nextLine();

        System.out.println("CPF do médico: ");
        String cpfMedico = sc.nextLine();

        System.out.println("Email do médico: ");
        String emailMedico = sc.nextLine();

        System.out.println("Telefone do médico: ");
        String telMedico = sc.nextLine();

        System.out.println("CRM do médico: ");
        String crm = sc.nextLine();

        Medico m = new Medico(3L, nomeMedico, cpfMedico, emailMedico, telMedico, crm, esp);

        // data consulta
        System.out.println("- Informações da Consulta");
       
        System.out.println("Ano da consulta: ");
        int ano = sc.nextInt();

        System.out.println("Mês da consulta: ");
        int mes = sc.nextInt();

        System.out.println("Dia da consulta: ");
        int dia = sc.nextInt();

        System.out.println("Hora da consulta: ");
        int hora = sc.nextInt();
        
        System.out.println("Minuto da consulta: ");
        int minuto = sc.nextInt();


        LocalDateTime dataConsulta = LocalDateTime.of(ano, mes, dia, hora, minuto);

        pacienteRepo.cadastrar(p);
        medicoRepo.cadastrar(m);

        Consulta c = new Consulta(p, m, dataConsulta);
        consultaRepo.cadastrar(c);

        // exibir as informações coletadas
        System.out.println("--Informações da Consulta--");
        System.out.println(" ");
        consultaRepo.listar();

        sc.close();
    }
}