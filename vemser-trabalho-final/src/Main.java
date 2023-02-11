import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    ClienteManipulacao clienteManipulacao = new ClienteManipulacao();

    int opcao = 0;
        while (opcao != 9) {
        System.out.println("Digite 1 para criar pessoa");
        System.out.println("Digite 2 para listar pessoas");
        System.out.println("Digite 3 para editar uma pessoa");
        System.out.println("Digite 4 para excluir pessoas");
        System.out.println("Digite 9 para sair");
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao) {
            case 1:
                Cliente pessoa = new Cliente();
                System.out.println("Digite o nome da pessoa");
                pessoa.setNome(scanner.nextLine());
                System.out.println("Digite o endereço da pessoa");
                pessoa.setEndereco(scanner.nextLine());
                System.out.println("Digite o telefone da pessoa");
                pessoa.setTelefone(scanner.nextLine());
                System.out.println("Digite o cpf da1 pessoa");
                pessoa.setCpf(scanner.nextLine());
                System.out.println("Digite o id do cliente");
                pessoa.setIdCliente(scanner.nextInt());
                scanner.nextLine();
                clienteManipulacao.adicionarCliente(pessoa);
                break;
            case 2:
                clienteManipulacao.listarPessoas();
                break;
            case 3:
                System.out.println("Qual pessoa você deseja editar?");
                clienteManipulacao.listarPessoas();
                int index = scanner.nextInt();
                scanner.nextLine();

                Cliente pessoaNova = new Cliente();
                System.out.println("Digite o novo nome da pessoa");
                pessoaNova.setNome(scanner.nextLine());
                System.out.println("Digite cpf");
                pessoaNova.setCpf(scanner.nextLine());
                clienteManipulacao.editarCliente(index, pessoaNova);
                break;
            case 4:
                System.out.println("Qual pessoa você deseja excluir?");
                clienteManipulacao.listarPessoas();
                int id = scanner.nextInt();
                clienteManipulacao.removerClientePorIndice(id);
                break;
            case 9:
                break;
            default:
                System.err.println("opção inválida");
                break;
        }
    }

}
}