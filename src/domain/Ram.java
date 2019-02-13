package domain;

public class Ram extends Components implements OverClocking {

    public static final int INCREASING_TEMP = 15;
    private double actualTiming;
    private double actualTemp;
    private double maxTemp;
    private double capacity;

    public Ram(String name, String producer, String serialNumber, double actualTiming, double actualTemp, double maxTemp, double capacity) {
        super(name, producer, serialNumber);
        if (actualTemp > maxTemp) {
            throw new IllegalArgumentException("Aktualna temperatura nie może przekraczać temperatury maksymalnej!");
        }
        this.actualTiming = actualTiming;
        this.actualTemp = actualTemp;
        this.maxTemp = maxTemp;
        this.capacity = capacity;
    }

    public double getActualTiming() {
        return actualTiming;
    }

    public void setActualTiming(double actualTiming) {
        this.actualTiming = actualTiming;
    }

    public double getActualTemp() {
        return actualTemp;
    }

    public void setActualTemp(double actualTemp) {
        this.actualTemp = actualTemp;
    }

    public double getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @Override
    public void increaseTiming(double newTiming) {
        System.out.println("=========================================================================================");
        System.out.println("Zwiększam timing RAM z " + actualTiming + " do " + newTiming);
        if (actualTiming > newTiming) {
            throw new IllegalArgumentException("Nie można zmniejszyć taktowania!");
        }
        double deltaTemp = ((newTiming - actualTiming) / 100) * INCREASING_TEMP;
        if (actualTemp > maxTemp) {
            throw new IllegalTemperatureException("Została przekroczona temperatura maksymalna - zwiększenie " +
                    "taktowania jest niemożliwe");
        }
        actualTemp += deltaTemp;
        actualTiming = newTiming;
        System.out.println("Udało się!");
    }

    @Override
    public void basicInfo() {
        super.basicInfo();
        System.out.println("RAM: ");
        System.out.println("____________________________________________");
        System.out.println("Name: " + getName() + ", Producer: " + getProducer() + ", Serial number: " + getSerialNumber());
        System.out.println("Actual timing: " + actualTiming + ", Actual temperature: " + actualTemp);
        System.out.println("Max temperature of processor: " + maxTemp);
    }
}