package guru.qa;

public class Scooter {

    public int id;
    public int battery;
    public boolean status;

    public Scooter(int id, int battery) {
        this.id = id;
        this.battery = battery;
    }
    public void charge() {
        System.out.println("Самокат номер " + this.id + " установлен на зарядку.");
        this.battery = battery + 20;
        this.status = true;
    }

    public int getId() {
        return id;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }
}
