/* 4. Sistema de Gestão de Alunos com Polimorfismo e Streams API
Implemente um sistema para gerenciar alunos de diferentes cursos universitários, 
como Ciência da Computação, Engenharia, e Direito. Cada curso terá um método específico para calcular 
a média ponderada das notas de seus alunos, baseado em disciplinas diferentes, com pesos variados para cada curso.*/

import java.util.ArrayList;
import java.util.List;

import aluno.AlunoLetras;
import aluno.AlunoMatematica;
import aluno.AlunoProgramacao;
import disciplina.Disciplina;

public class App {
    public static void main(String[] args) throws Exception {
        Disciplina d1 = new Disciplina("Matematica");
        Disciplina d2 = new Disciplina("Fisica");
        Disciplina d3 = new Disciplina("Programacao");
        Disciplina d4 = new Disciplina("Portugues");
        Disciplina d5 = new Disciplina("Ingles");

        // Lista com todas as disciplinas que todos os alunos vão cursar
        List<Disciplina> todasDisciplinas = new ArrayList<>();
        todasDisciplinas.add(d1);
        todasDisciplinas.add(d2);
        todasDisciplinas.add(d3);
        todasDisciplinas.add(d4);
        todasDisciplinas.add(d5);

        AlunoMatematica aM = new AlunoMatematica("Jose", 3019, todasDisciplinas);
        // Adicionando notas para todas as disciplinas que José está cursando
        aM.adicionarNota("Matematica", 9.5);
        aM.adicionarNota("Fisica", 8.0);
        aM.adicionarNota("Programacao", 10.0);
        aM.adicionarNota("Portugues", 4.5);
        aM.adicionarNota("Ingles", 5.5);


        AlunoProgramacao aP = new AlunoProgramacao("Arthur", 3042, todasDisciplinas);
        // Adicionando notas para todas as disciplinas que José está cursando
        aP.adicionarNota("Matematica", 9.5);
        aP.adicionarNota("Fisica", 8.0);
        aP.adicionarNota("Programacao", 10.0);
        aP.adicionarNota("Portugues", 4.5);
        aP.adicionarNota("Ingles", 5.5);

        AlunoLetras aL = new AlunoLetras("Leticia", 3023, todasDisciplinas);
        // Adicionando notas para todas as disciplinas que José está cursando
        aL.adicionarNota("Matematica", 9.5);
        aL.adicionarNota("Fisica", 8.0);
        aL.adicionarNota("Programacao", 10.0);
        aL.adicionarNota("Portugues", 4.5);
        aL.adicionarNota("Ingles", 5.5);

        System.out.println("Dados dos alunos: ");
        System.out.println("-----");
        aM.mostrarDados();
        System.out.println("-");
        System.out.println("Media ponderada das notas: " + String.format("%.2f", aP.calculaMedia(todasDisciplinas)));
        System.out.println("Status do aluno: " + aM.verificaStatus());
        System.out.println("-----------------------------------------------");
        aP.mostrarDados();
        System.out.println("-");
        System.out.println("Media ponderada das notas: " + String.format("%.2f", aP.calculaMedia(todasDisciplinas)));
        System.out.println("Status do aluno: " + aP.verificaStatus());
        System.out.println("-----------------------------------------------");
        aL.mostrarDados();
        System.out.println("-");
        System.out.println("Media ponderada das notas: " + String.format("%.2f", aL.calculaMedia(todasDisciplinas)));
        System.out.println("Status do aluno: " + aL.verificaStatus());
        System.out.println("-----------------------------------------------");


    }
}
