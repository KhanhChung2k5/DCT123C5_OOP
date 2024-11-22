package Project.Product;

public class Laptop extends Product {
    private static int laptopCount = 0; //todo: thuoc tinh static dung de dem so luong laptop

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
    private int graphicsMemory;

    public Laptop(String name, int id, String maker,
            double price, String type, double weight,
            String model, int warrantyPeriod, String releaseDate,
            String processor, int ram, int storage,
            String graphicsCard, String color, int batteryLife, double screenSize,
            String operatingSystem,  int graphicsMemory, double adapter) {
        super(name, maker, price, type, weight, model, warrantyPeriod, releaseDate);
        this.id = id;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.color = color;
        this.batteryLife = batteryLife;
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.graphicsMemory = graphicsMemory;
        this.adapter = adapter;
        laptopCount++; //todo tang so luong laptop 
    }

    //todo: dem so luong laptop 
    

    public static int getLaptopCount(){
        return laptopCount;
    }

    //todo: reset so luong laptop 
    
    public static void setLaptopCount(int laptopCount){
        laptopCount = 0;
    }


    @Override
    public String toString() {
        // Hiển thị thông số kỹ thuật chi tiết của laptop
        return "Laptop {" +
                "name = '" + getName() + '\'' +
                "id = '" + getId()  + '\'' +
                "maker = '" + getMaker()  + '\'' +
                "price = '" + getPrice() + '\'' +
                "type = '" + getType() + '\'' +
                "weight = '" + getWeight() + '\'' +
                "model = '" + getModel() + '\'' +
                "warranty period = '" + getWarrantyPeriod() + '\'' +
                "release date = '" + getReleaseDate() + '\'' +
                "processor = '" + processor + '\'' +
                "ram = '" + ram + '\'' +
                "storage = '" + storage + '\'' +
                "graphic card = '" + graphicsCard + '\'' +
                "color = '" + color + '\'' +
                "battery life = '" + batteryLife + '\'' +
                "screen size = '" + screenSize + '\'' +
                "operating system = '" + operatingSystem + '\'' +
                "graphic memory = '" + graphicsMemory + '\'' +
                "adapter = '" + adapter + '\'' +
                '}';
    }

    public void toInfo() {
        System.out.println("Laptop Information: ");
        System.out.println("ID" + getId());
        System.out.println("Name" + getName());
        System.out.println("Maker" + getMaker());
        System.out.println("Price" + getPrice());
        System.out.println("Type" + getType());
        System.out.println("Weight" + getWeight());
        System.out.println("Model" + getModel());
        System.out.println("Warranty Period" + getWarrantyPeriod());
        System.out.println("Release Date" + getReleaseDate());
        System.out.println("Processor" + getProcessor());
        System.out.println("Ram" + getRam());
        System.out.println("Storage" + getStorage());
        System.out.println("Graphics Card" + getGraphicsCard());
        System.out.println("Color" + getColor());
        System.out.println("Battery life" + getBatteryLife());
        System.out.println("Screen Size" + getScreenSize());
        System.out.println("Operating System" + getOperatingSystem());
        System.out.println("Graphics Memory" + getGraphicsMemory());
        System.out.println("Adapter" + getAdapter());
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

    public void setGraphicsMemory(int graphicsMemory) {
        this.graphicsMemory = graphicsMemory;
    }

    public int getGraphicsMemory() {
        return graphicsMemory;
    }

}
