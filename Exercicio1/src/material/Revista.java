package material;

public class Revista extends Material{
    private String edition;

    public Revista (String title, String author, int yearPublic, String edition){
        super(title, author, yearPublic);
        this.edition = edition;
    }

    @Override
    public String getResumo() {
        return "Revista: " + title + " escrita por " + author + ", publicada em " + yearPublic + 
               ". Esta é a " + edition;
    }
}
