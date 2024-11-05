package aluno;

import java.util.List;

import disciplina.Disciplina;

public class AlunoProgramacao extends Aluno{

    //constructor
    public AlunoProgramacao(String name, int matricula, List<Disciplina> disciplinas){
        super(name, matricula, disciplinas);
    }

    //como é um aluno de programacao, as disciplinas de exatas e programacao terão peso 2
    @Override
    public double calculaMedia(List<Disciplina> disciplinas){
        double media = 0;
        int cont = 0;
        for(int i=0; i<disciplinas.size(); i++){
            if(disciplinas.get(i).getNome().equals("Matematica") || disciplinas.get(i).getNome().equals("Fisica")
            || disciplinas.get(i).getNome().equals("Programacao")){
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

    public String verificaStatus(){
        if(calculaMedia(disciplinas) > 7){
            return "Aprovado!";
        }else{
            return "Reprovado!";
        }
    }
}