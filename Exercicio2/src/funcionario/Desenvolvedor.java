package funcionario;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String name, double baseSalary, double bonus, double overtime){
        super(name, baseSalary, bonus, overtime);
    }


    //desenvolvedor ganha 3% do salario base por hora extra trabalhada
    //ele também ganha uma porcentagem de bonus com base no salario
    @Override
    public double calculateSalary(){
        return baseSalary + ((baseSalary * 0.03) * overtime) + ((baseSalary * bonus)/100);
    }
}
