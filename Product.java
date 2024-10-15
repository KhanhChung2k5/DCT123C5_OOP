public class khanh{
    public class Product {
        String maker;
        double price;
        String type;
        double weight;
        String model;
        int warrantyPeriod;
        String releaseDate;

        public Product(String maker, double price, String type, double weight, String model, int warrantyPeriod, String releaseDate) {
            this.maker = maker;
            this.price = price;
            this.type = type;
            this.weight = weight;
            this.model = model; 
            this.warrantyPeriod = warrantyPeriod;
            this.releaseDate = releaseDate; 
        }
        // ... existing code ...
    }
    
    public class Computer extends Product {
        int id;
        String processor;
        int ram;
        int storage;
        String graphicsCard;
        String color;
        int batteryLife;
        double  screenSize;
        String operatingSystem;

        public Computer(int id, String maker, double price, String type, double weight, String model, int warrantyPeriod,
                        String releaseDate, String processor, int ram, int storage, String graphicsCard, String color, 
                        int batteryLife, double screenSize, String operatingSystem, int graphicsMemory) {
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
        }
    }
}