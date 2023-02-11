import java.util.ArrayList;

public class Medico extends Usuario{
    private int idUsuario;
    private String nome;
    private String endereco;
    private String telefone;
    private String crm;

    public Medico() {
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
