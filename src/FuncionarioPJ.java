public class FuncionarioPJ extends Funcionario {
    public FuncionarioPJ(String nome, String departamento, double salarioBase) {
        super(nome, departamento, salarioBase);
    }

    @Override
    public double calcularSalarioFinal() {
        return salarioBase;
    }
}
