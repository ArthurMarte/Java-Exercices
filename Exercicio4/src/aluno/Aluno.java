package aluno;
import disciplina.Disciplina;
import java.util.List;

public abstract class Aluno {
    protected String name;
    protected int matricula;
    protected List<Disciplina> disciplinas;

    //constructor
    public Aluno(String name, int matricula, List<Disciplina> disciplinas) {
        this.name = name;
        this.matricula = matricula;
        this.disciplinas = disciplinas;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getMatricula() {
        return matricula;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    
    public abstract double calculaMedia(List<Disciplina> disciplinas);   

    //metodo para adicionar as notas dos alunos
    public void adicionarNota(String nomeDisciplina, double nota) {
        for (Disciplina d : disciplinas) {
            if (d.getNome().equals(nomeDisciplina)) {
                d.nota = nota;  // Adiciona a nota à disciplina
                break;
            }
        }
    } 


     // Método para exibir os dados do aluno
     public void mostrarDados() {
        System.out.println("Nome: " + name);
        System.out.println("Matrícula: " + matricula);
        System.out.println("---");
        System.out.println("Disciplinas e notas:");
        for (Disciplina d : disciplinas) {
            System.out.println(d.getNome() + ": " + d.getNota());
        }
    }

    public String verificaStatus(){
        if(calculaMedia(disciplinas) > 7){
            return "Aprovado!";
        }else{
            return "Reprovado!";
        }
    }

}
