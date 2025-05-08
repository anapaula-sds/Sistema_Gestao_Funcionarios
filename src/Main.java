import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        int opcao;

        do {
        System.out.println("Digite:\n1 - Cadastrar Novo funcionario (CLT ou PJ)\n2 - Exibir todos os funcionários\n3 - Sair");
        System.out.print("Opção: ");
        opcao = sc.nextInt();
        sc.nextLine();

        switch (opcao) {
            case 1:
                System.out.println("Digite o Nome do novo Funcionário: ");
                String nome = sc.nextLine();

                System.out.println("Digite o Departamento do Funcionário: ");
                String departamento = sc.nextLine();

                System.out.println("Digite o Salário Base do Funcionário: ");
                double salarioBase = sc.nextDouble();
                sc.nextLine();

                System.out.println("Digite o tipo do funcionário (1 - CLT, 2 - PJ): ");
                int tipoFuncionario = sc.nextInt();
                sc.nextLine();

                Funcionario novoFuncionario;
                if (tipoFuncionario == 1) {
                    novoFuncionario = new FuncionarioCLT(nome, departamento, salarioBase);
                } else {
                    novoFuncionario = new FuncionarioPJ(nome, departamento, salarioBase);
                }

                funcionarios.add(novoFuncionario);
                System.out.println("Funcionário cadastrado com sucesso!");
                break;
            case 2:
                if (funcionarios.isEmpty()) {
                    System.out.println("Nenhum funcionário cadastrado.");
                } else {
                    System.out.println("Lista de Funcionários:");
                    for (Funcionario f : funcionarios) {
                        f.exibirDados();
                        System.out.println("Salário Final: " + f.calcularSalarioFinal());
                        System.out.println("--------------------");
                    }
                }
                break;
            case 3:
                System.out.println("Saindo...");
                break;
            default:
                System.out.println("Digito Inválido, Ecolha 1, 2 ou 3!");
                break;
        }
        } while (opcao != 3);
        sc.close();
    }
}