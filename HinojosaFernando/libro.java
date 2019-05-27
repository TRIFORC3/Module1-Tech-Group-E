import java.util.ArrayList;


public class Libro {
    private String name, autor, año, editorial;
    private ArrayList<InventoryBooks> inventoryBooks;

    public Libro(){}
    public Libro(String name, String autor, String año, String editorial){
        this.name = name;
        this.autor = autor;
        this.año = año;
        this.editorial = editorial;
        this.inventoryBooks  = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public String getautor() {
        return autor;
    }

    public String getaño() {
        return año;
    }

    public String geteditorial() {
        return editorial;
    }
}