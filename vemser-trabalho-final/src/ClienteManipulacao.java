import java.util.ArrayList;
import java.util.List;

public class ClienteManipulacao {
    private List<Cliente> listaDeCliente;

    public ClienteManipulacao() {
        this.listaDeCliente = new ArrayList<>();
    }

    public void adicionarCliente(Cliente pessoa) {
        this.listaDeCliente.add(pessoa);
    }

    public void removerClientePorIndice(Integer index) {
        this.listaDeCliente.remove(index.intValue());
    }

    public void editarCliente(Integer index, Cliente pessoa) {
        Cliente pessoaProcurada = listaDeCliente.get(index);
        pessoaProcurada.setCpf(pessoa.getCpf());
        pessoaProcurada.setNome(pessoa.getNome());
        pessoaProcurada.setTelefone(pessoa.getTelefone());
        pessoaProcurada.setEndereco(pessoa.getEndereco());
    }

    public void listarPessoas() {
        for (int i = 0; i < listaDeCliente.size(); i++) {
            System.out.println("id=" + i + " | " + " Nome: " +  listaDeCliente.get(i).getNome() + " | " + " CPF: " + listaDeCliente.get(i).getCpf() +  " Enderço: "  + listaDeCliente.get(i).getEndereco() + " | " + " telefone: " +listaDeCliente.get(i).getTelefone());
        }
    }
}
