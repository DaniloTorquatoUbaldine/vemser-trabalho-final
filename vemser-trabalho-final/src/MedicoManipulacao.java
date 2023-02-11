import java.util.ArrayList;
import java.util.List;

public class MedicoManipulacao {
    private List<Medico> listaDeMedico;

    public MedicoManipulacao() {
        this.listaDeMedico = new ArrayList<>();
    }

    public void adicionarMedico(Medico pessoa) {
        System.out.println(pessoa);
        this.listaDeMedico.add(pessoa);
    }

    public void removerMedicoPorIndice(Integer index) {
        this.listaDeMedico.remove(index.intValue());
    }

    public void editarMedico(Integer index, Medico pessoa) {
        Medico pessoaProcurada = listaDeMedico.get(index);
        pessoaProcurada.setIdUsuario(pessoa.getIdUsuario());
        pessoaProcurada.setNome(pessoa.getNome());
        pessoaProcurada.setEndereco(pessoa.getEndereco());
        pessoaProcurada.setTelefone(pessoa.getTelefone());
        pessoaProcurada.setCrm(pessoa.getCrm());
    }

    public void listarPessoas() {
        for (int i = 0; i < listaDeMedico.size(); i++) {
            System.out.println("id=" + i + " | " + listaDeMedico.get(i).getIdUsuario() + " " + listaDeMedico.get(i).getNome());
        }
    }
}
