import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int escolhacadastro = -1;
        while (escolhacadastro != 9) {
            System.out.println("Digite 0 para cadastrar Cliente\n" + "Digite 1 para cadastar administrativo\n" + "Digite 2 para cadastrar médico.");
            escolhacadastro = scanner.nextInt();
            scanner.nextLine();
            if (escolhacadastro == 0) {
                ClienteManipulacao clienteManipulacao = new ClienteManipulacao();
                int opcao = 0;
                while (opcao != 9) {
                    System.out.println("Digite 1 para criar cliente");
                    System.out.println("Digite 2 para listar cliente");
                    System.out.println("Digite 3 para editar uma cliente");
                    System.out.println("Digite 4 para excluir cliente");
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
                            System.out.println("Digite o cpf da pessoa");
                            pessoa.setCpf(scanner.nextLine());
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
                            System.out.println("Digite o endereço");
                            pessoaNova.setEndereco(scanner.nextLine());
                            System.out.println("Digite o telefone");
                            pessoaNova.setTelefone(scanner.nextLine());
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
            if (escolhacadastro == 1) {
                AdministrativoManipulacao administrativoManipulacao = new AdministrativoManipulacao();
                int opcao = 0;
                while (opcao != 9) {
                    System.out.println("Digite 1 para criar pessoa do administrativo");
                    System.out.println("Digite 2 para listar pessoas do administrativo");
                    System.out.println("Digite 3 para editar uma pessoa do administrativo");
                    System.out.println("Digite 4 para excluir pessoas do administrativo");
                    System.out.println("Digite 9 para sair");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            Administrativo pessoa = new Administrativo();
                            System.out.println("Digite o nome da pessoa");
                            pessoa.setNome(scanner.nextLine());
                            System.out.println("Digite o endereço da pessoa");
                            pessoa.setEndereco(scanner.nextLine());
                            System.out.println("Digite o telefone da pessoa");
                            pessoa.setTelefone(scanner.nextLine());
                            System.out.println("Digite o código do administrativo ");
                            pessoa.setCodigoDoAdministrativo(scanner.nextLine());
                            administrativoManipulacao.adicionarAdministrativo(pessoa);
                            break;
                        case 2:
                            administrativoManipulacao.listarPessoas();
                            break;
                        case 3:
                            System.out.println("Qual pessoa do administrativo você deseja editar?");
                            administrativoManipulacao.listarPessoas();
                            int index = scanner.nextInt();
                            scanner.nextLine();

                            Administrativo pessoaNova = new Administrativo();
                            System.out.println("Digite o novo nome da pessoa");
                            pessoaNova.setNome(scanner.nextLine());
                            System.out.println("Digite cpf");
                            pessoaNova.setCodigoDoAdministrativo(scanner.nextLine());
                            System.out.println("Digite o endereço");
                            pessoaNova.setEndereco(scanner.nextLine());
                            System.out.println("Digite o telefone");
                            pessoaNova.setTelefone(scanner.nextLine());
                            administrativoManipulacao.editarCliente(index, pessoaNova);
                            break;
                        case 4:
                            System.out.println("Qual administrativo você deseja excluir?");
                            administrativoManipulacao.listarPessoas();
                            int id = scanner.nextInt();
                            administrativoManipulacao.removerClientePorIndice(id);
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
    }
}