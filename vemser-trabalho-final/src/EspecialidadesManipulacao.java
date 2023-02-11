import java.util.ArrayList;
import java.util.List;

public class EspecialidadesManipulacao {
    private List<Especialidades> listaDeEspecialidades;

    public EspecialidadesManipulacao() {
        this.listaDeEspecialidades = new ArrayList<>();
    }

    public void adicionarEspecialidade(Especialidades pessoa) {
        this.listaDeEspecialidades.add(pessoa);
    }

    public void removerEspecialidadePorIndice(Integer index) {
        this.listaDeEspecialidades.remove(index.intValue());
    }

    public void editarEspecialidade(Integer index, Especialidades pessoa) {
        Especialidades pessoaProcurada = listaDeEspecialidades.get(index);
        pessoaProcurada.setNome(pessoa.getNome());
        pessoaProcurada.setValor(pessoa.getValor());
    }

    public void listarEspecialidades() {
        for (int i = 0; i < listaDeEspecialidades.size(); i++) {
            System.out.println("id=" + i + " | " + " Nome: " +  listaDeEspecialidades.get(i).getNome() + " | " + listaDeEspecialidades.get(i).getValor());
        }
    }
}
