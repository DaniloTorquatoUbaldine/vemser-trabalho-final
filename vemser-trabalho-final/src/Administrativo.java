import java.util.ArrayList;

public class Administrativo extends Usuario{
    private int idUsuario;
    private int idAdministrativo;
    private String matricula;
    private String nome;
    private String endereco;
    private String telefone;

    final private static String ID_USUARIO = "O id do usuário é: ";
    final private static String ID_ADMINISTRATIVO = "O id da administração do usuário é: ";
    final private static String ID_MATRICULA = "A matrícula é: ";
    final private static String ID_NOME = "O nome do usuário é: ";
    final private static String ENDERECO = "O endereço do usuário é: ";
    final private static String TELEFONE = "O telefone do usuário é: ";

    public Administrativo(int idUsuario, int idAdministrativo, String matricula, String nome, String endereco, String telefone){
        this.idUsuario = idUsuario;
        this.idAdministrativo = idAdministrativo;
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }


    public void imprimirAdministrativo(){
        System.out.println(ID_USUARIO);
        System.out.println(idUsuario);
        System.out.println(ID_ADMINISTRATIVO);
        System.out.println(idAdministrativo);
        System.out.println(ID_MATRICULA);
        System.out.println(matricula);
        System.out.println(ID_NOME);
        System.out.println(nome);
        System.out.println(ENDERECO);
        System.out.println(endereco);
        System.out.println(TELEFONE);
        System.out.println(telefone);
    }

    public int getIdAdministrativo() {
        return idAdministrativo;
    }

    public void setIdAdministrativo(int idAdministrativo) {
        this.idAdministrativo = idAdministrativo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
