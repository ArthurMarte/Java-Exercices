package aluno;

import java.util.List;

import disciplina.Disciplina;

public class AlunoMatematica extends Aluno{

    //constructor
    public AlunoMatematica(String name, int matricula, List<Disciplina> disciplinas){
        super(name, matricula, disciplinas);
    }

    //como é um aluno de matemática, as disciplinas de exatas terão peso 2
    @Override
    public double calculaMedia(List<Disciplina> disciplinas){
        double media = 0;
        int cont = 0;
        for(int i=0; i<disciplinas.size(); i++){
            if(disciplinas.get(i).getNome().equals("Matematica") || disciplinas.get(i).getNome().equals("Fisica")){
                media = media + (disciplinas.get(i).getNota() * 2);
                cont += 2;
            }
            else{
                media = media + disciplinas.get(i).getNota();
                cont += 1;
            }
        }
        return media/cont;
    }
}
