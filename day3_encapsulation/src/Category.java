public class Category {
    // fields,attributes
    private int id;
    private String name;

    // constructor
    public Category() {}

    public Category(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    // getter setter methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name + "!";
    }

    public void setName(String name) {
        this.name = name;
    }
}
