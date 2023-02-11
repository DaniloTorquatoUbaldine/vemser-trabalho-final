import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int escolhaTipoDeCadastro = -1;
        while (escolhaTipoDeCadastro != 9) {
            System.out.println("Digite 0 para cadastrar Usuários\n" + "Digite 1 para cadastar Convenio\n" + "Digite 2 para cadastrar Especialidades médicas.\nDigite 9 para sair.");
            escolhaTipoDeCadastro = scanner.nextInt();
            scanner.nextLine();
            if (escolhaTipoDeCadastro == 0) {
                int escolhacadastro = -1;
                while (escolhacadastro != 9) {
                    System.out.println("Digite 0 para cadastrar Cliente\n" + "Digite 1 para cadastar administrativo\n" + "Digite 2 para cadastrar médico.\nDigite 9 para sair.");
                    escolhacadastro = scanner.nextInt();
                    scanner.nextLine();
                    if (escolhacadastro == 0) {
                        ClienteManipulacao clienteManipulacao = new ClienteManipulacao();
                        int opcao = 0;
                        while (opcao != 9) {
                            System.out.println("Digite 1 para criar cliente");
                            System.out.println("Digite 2 para listar clientes");
                            System.out.println("Digite 3 para editar uma cliente");
                            System.out.println("Digite 4 para excluir cliente");
                            System.out.println("Digite 9 para sair");
                            opcao = scanner.nextInt();
                            scanner.nextLine();
                            switch (opcao) {
                                case 1:
                                    Cliente pessoa = new Cliente();
                                    System.out.println("Digite o nome do cliente");
                                    pessoa.setNome(scanner.nextLine());
                                    System.out.println("Digite o endereço do cliente");
                                    pessoa.setEndereco(scanner.nextLine());
                                    System.out.println("Digite o telefone do cliente");
                                    pessoa.setTelefone(scanner.nextLine());
                                    System.out.println("Digite o cpf do cliente");
                                    pessoa.setCpf(scanner.nextLine());
                                    clienteManipulacao.adicionarCliente(pessoa);
                                    break;
                                case 2:
                                    clienteManipulacao.listarPessoas();
                                    break;
                                case 3:
                                    System.out.println("Qual cliente você deseja editar?");
                                    clienteManipulacao.listarPessoas();
                                    int index = scanner.nextInt();
                                    scanner.nextLine();

                                    Cliente pessoaNova = new Cliente();
                                    System.out.println("Digite o novo nome do cliente");
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
                                    System.out.println("Qual cliente você deseja excluir?");
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
                                    System.out.println("Digite a mátricula da pessoa");
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
                    if (escolhacadastro == 2) {
                        MedicoManipulacao medicoManipulacao = new MedicoManipulacao();
                        int opcao = 0;
                        while (opcao != 9) {
                            System.out.println("Digite 1 para criar médico");
                            System.out.println("Digite 2 para listar médicos");
                            System.out.println("Digite 3 para editar  médico");
                            System.out.println("Digite 4 para excluir  médico");
                            System.out.println("Digite 9 para sair");
                            opcao = scanner.nextInt();
                            scanner.nextLine();
                            switch (opcao) {
                                case 1:
                                    Medico pessoa = new Medico();
                                    System.out.println("Digite o nome médico");
                                    pessoa.setNome(scanner.nextLine());
                                    System.out.println("Digite o endereço do médico");
                                    pessoa.setEndereco(scanner.nextLine());
                                    System.out.println("Digite o telefone do médico");
                                    pessoa.setTelefone(scanner.nextLine());
                                    System.out.println("Digite o CRM do médico");
                                    pessoa.setCrm(scanner.nextLine());
                                    medicoManipulacao.adicionarMedico(pessoa);
                                    break;
                                case 2:
                                    medicoManipulacao.listarPessoas();
                                    break;
                                case 3:
                                    System.out.println("Qual médico você deseja editar?");
                                    medicoManipulacao.listarPessoas();
                                    int index = scanner.nextInt();
                                    scanner.nextLine();

                                    Medico pessoaNova = new Medico();
                                    System.out.println("Digite o nome do médico");
                                    pessoaNova.setNome(scanner.nextLine());
                                    System.out.println("Digite o CRM");
                                    pessoaNova.setCrm(scanner.nextLine());
                                    System.out.println("Digite o endereço");
                                    pessoaNova.setEndereco(scanner.nextLine());
                                    System.out.println("Digite o telefone");
                                    pessoaNova.setTelefone(scanner.nextLine());
                                    medicoManipulacao.editarMedico(index, pessoaNova);
                                    break;
                                case 4:
                                    System.out.println("Qual médico você deseja excluir?");
                                    medicoManipulacao.listarPessoas();
                                    int id = scanner.nextInt();
                                    medicoManipulacao.removerMedicoPorIndice(id);
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
            if (escolhaTipoDeCadastro == 1) {
                ConvenioManipulacao convenioManipulacao = new ConvenioManipulacao();
                int opcao = 0;
                while (opcao != 9) {
                    System.out.println("Digite 1 para criar convenio");
                    System.out.println("Digite 2 para listar convenios");
                    System.out.println("Digite 3 para editar um convenio");
                    System.out.println("Digite 4 para excluir convenio");
                    System.out.println("Digite 9 para sair");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            Convenio pessoa = new Convenio();
                            System.out.println("Digite o nome do convenio");
                            pessoa.setNome(scanner.nextLine());
                            System.out.println("Digite o Codigo de verificação no orgão regulamentador");
                            pessoa.setCadastroDoConvenioNoOragaoRegulador(scanner.nextLine());
                            System.out.println("Digite a taxa de abatimento do plano (0 a 1)");
                            pessoa.setTaxaDeAbatimentoNaConsulta(scanner.nextDouble());
                            scanner.nextLine();
                            convenioManipulacao.adicionarConvenio(pessoa);
                            break;
                        case 2:
                            convenioManipulacao.listarConvenios();
                            break;
                        case 3:
                            System.out.println("Qual cliente você deseja editar?");
                            convenioManipulacao.listarConvenios();
                            int index = scanner.nextInt();
                            scanner.nextLine();

                            Convenio pessoaNova = new Convenio();
                            System.out.println("Digite o novo nome do convenio");
                            pessoaNova.setNome(scanner.nextLine());
                            System.out.println("Digite o código de verificação no orgão regulamentador");
                            pessoaNova.setCadastroDoConvenioNoOragaoRegulador(scanner.nextLine());
                            System.out.println("Digite a taxa de abatimento (0 a 1)");
                            pessoaNova.setTaxaDeAbatimentoNaConsulta(scanner.nextDouble());
                            convenioManipulacao.editarConvenio(index, pessoaNova);
                            break;
                        case 4:
                            System.out.println("Qual cliente você deseja excluir?");
                            convenioManipulacao.listarConvenios();
                            int id = scanner.nextInt();
                            convenioManipulacao.removerConvenioPorIndice(id);
                            break;
                        case 9:
                            break;
                        default:
                            System.err.println("opção inválida");
                            break;
                    }
                }
            }
            if (escolhaTipoDeCadastro == 2) {
                EspecialidadesManipulacao especialidadesManipulacao = new EspecialidadesManipulacao();
                int opcao = 0;
                while (opcao != 9) {
                    System.out.println("Digite 1 para criar especialidade");
                    System.out.println("Digite 2 para listar especialidades");
                    System.out.println("Digite 3 para editar uma especialidade");
                    System.out.println("Digite 4 para excluir especialidade");
                    System.out.println("Digite 9 para sair");
                    opcao = scanner.nextInt();
                    scanner.nextLine();
                    switch (opcao) {
                        case 1:
                            Especialidades pessoa = new Especialidades();
                            System.out.println("Digite o nome da especialidade");
                            pessoa.setNome(scanner.nextLine());
                            especialidadesManipulacao.adicionarEspecialidade(pessoa);
                            break;
                        case 2:
                            especialidadesManipulacao.listarEspecialidades();
                            break;
                        case 3:
                            System.out.println("Qual especialidade você deseja editar?");
                            especialidadesManipulacao.listarEspecialidades();
                            int index = scanner.nextInt();
                            scanner.nextLine();

                            Especialidades pessoaNova = new Especialidades();
                            System.out.println("Digite o novo nome da especialidade");
                            pessoaNova.setNome(scanner.nextLine());
                            especialidadesManipulacao.editarEspecialidade(index, pessoaNova);
                            break;
                        case 4:
                            System.out.println("Qual cliente você deseja excluir?");
                            especialidadesManipulacao.listarEspecialidades();
                            int id = scanner.nextInt();
                            especialidadesManipulacao.removerEspecialidadePorIndice(id);
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