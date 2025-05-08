public class FuncionarioCLT extends Funcionario implements Bonificavel{
    public FuncionarioCLT(String nome, String departamento, double salarioBase) {
        super(nome, departamento, salarioBase);
    }

    public double calcularSalarioFinal() {
        double desconto = salarioBase * 0.08;
        double bonificacao = calcularBonificacao();
        return salarioBase - desconto + bonificacao;
    }

    @Override
    public double calcularBonificacao(){
        return salarioBase * 0.1;
    }
}
