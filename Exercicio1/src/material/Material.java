package material;

public abstract class Material {
    protected String title;
    protected String author;
    protected int yearPublic;
    protected boolean emprestado;

    //constructor
    public Material(String title, String author, int yearPublic) {
        this.title = title;
        this.author = author;
        this.yearPublic = yearPublic;
        this.emprestado = false;
    }

    //getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getYearPublic() {
        return yearPublic;
    }

    // Método abstrato
    public abstract String getResumo();  


    //método para emprestar o material
    public void emprestar(){
        if(!emprestado){
            emprestado = true;
            System.out.println(title + " foi emprestado!");
        }
        else{
            System.out.println(title + " ja está emprestado para alguem!");
        }
    }

    //método para devolver o material
    public void devolver(){
        if(emprestado){
            emprestado = false;
            System.out.println(title + " foi devolvido!");
        }
        else{
            System.out.println(title + " não está emprestado para ninguém!");
        }
    }


}
