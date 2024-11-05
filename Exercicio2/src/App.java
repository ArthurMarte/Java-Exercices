/* Sistema de Gestão de Funcionários com Herança
Desenvolva um sistema de gestão de funcionários que tenha classes base como Funcionario com subclasses 
Gerente, Desenvolvedor, e Estagiário. Cada um deve ter um método `calcularSalario()` que utiliza regras específicas 
para calcular o salário com base em bônus, horas extras ou descontos.
Utilize herança e sobrescrita de métodos.
Implemente um método para simular promoções de estagiários para desenvolvedores.*/

import java.util.ArrayList;
import java.util.List;
import funcionario.*;


public class App {
    public static void main(String[] args) throws Exception {

        // Criando a lista de Funcionarios
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Gerente("João", 7900.85, 5.3, 32));
        funcionarios.add(new Desenvolvedor("Pedro", 5300, 3.2, 25));
        funcionarios.add(new Estagiario("Jorge", 2630.33, 1.2, 50));

        System.out.println("Lista dos funcionários e seus salários: ");
        for(int i=0; i< funcionarios.size(); i++){
           System.out.println("Funcionário: " + funcionarios.get(i).getName());
           System.out.println("Salário: R$" + String.format("%.2f", funcionarios.get(i).calculateSalary()));
           System.out.println("---");                
        }
            
    }
}
