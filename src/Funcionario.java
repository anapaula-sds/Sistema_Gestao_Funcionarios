public abstract class Funcionario {
    protected String nome, departamento;
    protected double salarioBase;

    public Funcionario(String nome, String departamento, double salarioBase) {
        this.nome = nome;
        this.departamento = departamento;
        this.salarioBase = salarioBase;
    }

    public final void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário Base: " + salarioBase);
    }

    public abstract double calcularSalarioFinal();
}
