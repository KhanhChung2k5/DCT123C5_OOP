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
    
    public static void setLaptopCount(int count){
        laptopCount = count;
    }


    @Override
    public String toString() {
        
        //? Hiển thị thông số kỹ thuật chi tiết của laptop
        StringBuilder sb = new StringBuilder();
        sb.append("+------------------------+------------------------------+\n");
        sb.append("|         Field          |            Value            |\n");
        sb.append("+------------------------+------------------------------+\n");
        sb.append(String.format("| %-22s | %-28s |\n", "ID", getId()));
        sb.append(String.format("| %-22s | %-28s |\n", "Name", getName()));
        sb.append(String.format("| %-22s | %-28s |\n", "Maker", getMaker()));
        sb.append(String.format("| %-22s | %-28.2f |\n", "Price", getPrice())); 
        sb.append(String.format("| %-22s | %-28s |\n", "Type", getType()));
        sb.append(String.format("| %-22s | %-28.2f |\n", "Weight", getWeight())); 
        sb.append(String.format("| %-22s | %-28s |\n", "Model", getModel()));
        sb.append(String.format("| %-22s | %-28d |\n", "Warranty Period", getWarrantyPeriod())); 
        sb.append(String.format("| %-22s | %-28s |\n", "Release Date", getReleaseDate()));
        sb.append(String.format("| %-22s | %-28s |\n", "Processor", processor));
        sb.append(String.format("| %-22s | %-28d |\n", "RAM", ram)); 
        sb.append(String.format("| %-22s | %-28d |\n", "Storage", storage));
        sb.append(String.format("| %-22s | %-28s |\n", "Graphics Card", graphicsCard));
        sb.append(String.format("| %-22s | %-28s |\n", "Color", color));
        sb.append(String.format("| %-22s | %-28d |\n", "Battery Life (hours)", batteryLife));

        sb.append(String.format("| %-22s | %-28.1f |\n", "Screen Size", screenSize)); 
        sb.append(String.format("| %-22s | %-28s |\n", "Operating System", operatingSystem));
        sb.append(String.format("| %-22s | %-28d |\n", "Graphics Memory", graphicsMemory)); 
        sb.append(String.format("| %-22s | %-28.2f |\n", "Adapter", adapter)); 
        sb.append("+------------------------+------------------------------+");
        return sb.toString();
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

    //? Cac get set cho tung thuoc tinh co trong Laptop
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
