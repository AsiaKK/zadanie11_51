package domain;

public class HardDrive extends Components {

    private double capacity;

    public HardDrive(String name, String producer, String serialNumber, double capacity) {
        super(name, producer, serialNumber);
        this.capacity = capacity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    @Override
    public void basicInfo() {
        super.basicInfo();
        System.out.println("Hard drive: ");
        System.out.println("____________________________________________");
        System.out.println("Name: " + getName() + ", Producer: " + getProducer() + ", Serial number: " + getSerialNumber());
        System.out.println("Capacity: " + capacity);
    }
}