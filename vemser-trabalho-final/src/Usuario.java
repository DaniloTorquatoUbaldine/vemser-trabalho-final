import java.util.ArrayList;

public abstract class usuario {
    private int idUsuario;
    private String nome;
    private String endereco;
    private String telefone;
    private ArrayList<Integer> usuarios;

        public usuario(int idUsuario, String nome, String endereco, String telefone){
            this.idUsuario = idUsuario;
            this.nome = nome;
            this.endereco = endereco;
            this.telefone = telefone;
        }

    public usuario(int idUsuario, String nome, String endereco, String telefone, ArrayList usuarios){
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.usuarios = usuarios;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public ArrayList<Integer> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Integer> usuarios) {
        this.usuarios = usuarios;
    }
}
