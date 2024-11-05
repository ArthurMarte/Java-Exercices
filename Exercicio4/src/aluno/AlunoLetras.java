package aluno;

import java.util.List;

import disciplina.Disciplina;

public class AlunoLetras extends Aluno{

    //constructor
    public AlunoLetras(String name, int matricula, List<Disciplina> disciplinas){
        super(name, matricula, disciplinas);
    }

    //como é um aluno de letras, as disciplinas de letras
    @Override
    public double calculaMedia(List<Disciplina> disciplinas){
        double media = 0;
        int cont = 0;
        for(int i=0; i<disciplinas.size(); i++){
            if(disciplinas.get(i).getNome().equals("Portugues") || disciplinas.get(i).getNome().equals("Ingles")){
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