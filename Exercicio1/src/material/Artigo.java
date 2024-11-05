package material;

public class Artigo extends Material{
    public Artigo (String title, String author, int yearPublic){
        super(title, author, yearPublic);
    }


    @Override
    public String getResumo() {
        return "Artigo: " + title + " escrito por " + author + ", publicado em " + yearPublic;
    }
}
