package material;

public class Livro extends Material{
    private int numPages;

    public Livro (String title, String author, int yearPublic, int numPages){
        super(title, author, yearPublic);
        this.numPages = numPages;
    }

    @Override
    public String getResumo() {
        return "Livro: " + title + " escrito por " + author + ", publicado em " + yearPublic + 
               ". Possui " + numPages + " páginas.";
    }
    

}
