public class Computer extends Product {
    private int id;
    private String processor;
    private int ram;
    private int storage;
    private String graphicsCard;
    private String color;
    private int batteryLife;
    private double screenSize;
    private double adapter;
    private String operatingSystem;

    public Computer(int id, String maker, double price, String type, double weight, String model, int warrantyPeriod,
                    String releaseDate, String processor, int ram, int storage, String graphicsCard, String color, 
                    int batteryLife, double screenSize, String operatingSystem, int graphicsMemory, double adapter) {
        super(maker, price, type, weight, model, warrantyPeriod, releaseDate);
        this.id = id;
        this.processor = processor; 
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.color = color;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.adapter = adapter;
    }

    @Override
    public void toInfo() {
        System.out.println("Computer ID: " + id);
        System.out.println("Maker: " + getMaker());
        System.out.println("Price: " + getPrice());
        System.out.println("Type: " + getType());
        System.out.println("Weight: " + getWeight());
        System.out.println("Model: " + getModel());
        System.out.println("Warranty Period: " + getWarrantyPeriod() + " months");
        System.out.println("Release Date: " + getReleaseDate());
    }


    // Get và set cho tung thuoc tinh
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getAdapter() {
        return adapter;
    }

    public void setAdapter(double adapter) {
        this.adapter = adapter;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
