import java.util.ArrayList;

public class Medico extends Usuario{
    private int idMedico;
    private int idUsuario;
    private String crm;
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Usuario> usuarios;
    final private static String ID_USUARIO = "O id do médico é: ";
    final private static String ID_CRM = "O CRM do médico é: ";
    final private static String ID_MEDICO = "O id do médico é: ";

    final private static String ID_NOME = "O nome do médico é: ";
    final private static String ENDERECO = "O endereço do médico é: ";
    final private static String TELEFONE = "O telefone do médico é: ";

    public Medico(int idMedico, String nome, String endereco, String telefone){
        this.idMedico = idUsuario;
        this.idMedico = idMedico;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void imprimirAdministrativo(){
        System.out.println(ID_USUARIO);
        System.out.println(idUsuario);
        System.out.println(ID_MEDICO);
        System.out.println(idMedico);
        System.out.println(ID_NOME);
        System.out.println(nome);
        System.out.println(ENDERECO);
        System.out.println(endereco);
        System.out.println(TELEFONE);
        System.out.println(telefone);
    }

    public Medico(ArrayList usuarios){
        this.usuarios = usuarios;
    }

    public int getIdMedico() {
        return idMedico;
    }

    public void setIdMedico(int idMedico) {
        this.idMedico = idMedico;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
