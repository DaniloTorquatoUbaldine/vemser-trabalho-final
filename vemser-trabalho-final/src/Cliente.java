import java.util.ArrayList;

public class Cliente extends Usuario{

    private int idCliente;
    private String cpf;
    private int idUsuario;
    private String nome;
    private String endereco;
    private String telefone;

    public Cliente() {

    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
