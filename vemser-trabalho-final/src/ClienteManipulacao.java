import java.util.ArrayList;
import java.util.List;

public class ClienteManipulacao {
    private List<Cliente> listaDeCliente;

    public ClienteManipulacao() {
        this.listaDeCliente = new ArrayList<>();
    }

    public void adicionarCliente(Cliente pessoa) {
        System.out.println(pessoa);
        this.listaDeCliente.add(pessoa);
    }

    public void removerClientePorIndice(Integer index) {
        this.listaDeCliente.remove(index.intValue());
    }

    public void editarCliente(Integer index, Cliente pessoa) {
        Cliente pessoaProcurada = listaDeCliente.get(index);
        pessoaProcurada.setIdCliente(pessoa.getIdCliente());
        pessoaProcurada.setCpf(pessoa.getCpf());
        pessoaProcurada.setIdUsuario(pessoa.getIdUsuario());
        pessoaProcurada.setNome(pessoa.getNome());
        pessoaProcurada.setTelefone(pessoa.getTelefone());
        pessoaProcurada.setEndereco(pessoa.getEndereco());
    }

    public void listarPessoas() {
        for (int i = 0; i < listaDeCliente.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeCliente.get(i).getIdCliente() + " " + listaDeCliente.get(i).getNome());
        }
    }
}
