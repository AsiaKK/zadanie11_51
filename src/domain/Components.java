package domain;

public abstract class Components {

    private String name;
    private String producer;
    private String serialNumber;

    public Components(String name, String producer, String serialNumber) {
        this.name = name;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void basicInfo() {
        System.out.println("____________________________________________");
        System.out.print("Basic information about ");
    }
}