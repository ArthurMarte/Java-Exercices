package funcionario;

public class Gerente extends Funcionario{
    public Gerente(String name, double baseSalary, double bonus, double overtime){
        super(name, baseSalary, bonus, overtime);
    }


    //gerente ganha 10% do salario base por hora extra trabalhada
    //ele também ganha uma porcentagem de bonus com base no salario
    @Override
    public double calculateSalary(){
        return baseSalary + ((baseSalary * 0.1) * overtime) + ((baseSalary * bonus)/100);
    }
}
