package funcionario;

public class Estagiario extends Funcionario{
    public Estagiario(String name, double baseSalary, double bonus, double overtime){
        super(name, baseSalary, bonus, overtime);
    }

    //Estagiário ganha 1% do salario base por hora extra trabalhada
    //ele também ganha uma porcentagem de bonus com base no salario
    @Override
    public double calculateSalary(){
        return baseSalary + ((baseSalary * 0.01) * overtime) + ((baseSalary * bonus)/100);
    }
}
