package produto;

public class Produto {
    private String code;
    private String name;
    private double price;
    private int stockQt;

    //constructor
    public Produto(String code, String name, double price, int stockQt) {
        this.code = code;
        this.name = name;
        this.price = price;
        this.stockQt = stockQt;
    }

    //getters
    public String getCode() {
        return code;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getStockQt() {
        return stockQt;
    }

    //setters
    //setters estão privados pois só vai ser pos´sivel alterar através das funções específicas
    public void setPrice(double price) {
        this.price = price;
    }
    public void setStockQt(int stockQt) {
        this.stockQt = stockQt;
    }
    
}
