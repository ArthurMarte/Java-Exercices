package funcionario;

public abstract class Funcionario {
    protected String name;
    protected double baseSalary;
    protected double bonus;
    protected double overtime;

    //constructor
    public Funcionario(String name, double baseSalary, double bonus, double overtime) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.overtime = overtime;
    }

    //getters
    public String getName() {
        return name;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public double getBonus() {
        return bonus;
    }
    public double getOvertime() {
        return overtime;
    }
    
    //método abstrato que de deve ser implementado por todas as subclasses
    public abstract double calculateSalary();
}
