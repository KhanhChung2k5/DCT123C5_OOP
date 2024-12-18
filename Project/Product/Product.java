package Project.Product;

public abstract class Product {
    private String name;
    private String maker;
    private double price;
    private String type;
    private double weight;
    private String model;
    private int warrantyPeriod;
    private String releaseDate;

    public Product(String name,String maker, double price, String type, double weight, String model, int warrantyPeriod, String releaseDate) {
        this.name = name;
        this.maker = maker;
        this.price = price;
        this.type = type;
        this.weight = weight;
        this.model = model; 
        this.warrantyPeriod = warrantyPeriod;
        this.releaseDate = releaseDate;
    }

    //todo: Phương thức trừu tượng
    public abstract void toInfo(); 
    

    //todo: Cac phuong thuc get va set cho tung thuoc tinh 

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        this.warrantyPeriod = warrantyPeriod;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }
    @Override
    public String toString() {
        return "Laptop {" +
                "name laptop" + name + '\'' +
                "maker" + maker  + '\'' +
                "price" + price + '\'' +
                "type" + type + '\'' +
                "weight" + weight + '\'' +
                "model" + model + '\'' +
                "warranty period" + warrantyPeriod + '\'' +
                "release date" + releaseDate + '\'' +
                " }";
    }
}
