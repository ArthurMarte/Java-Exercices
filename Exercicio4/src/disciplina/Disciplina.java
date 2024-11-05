package disciplina;

public class Disciplina {
    public String nome;
    public double nota;

    //constructor
    public Disciplina(String nome) {
        this.nome = nome;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getNota() {
        return nota;
    }
}
