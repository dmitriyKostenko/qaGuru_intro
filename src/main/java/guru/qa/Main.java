package guru.qa;

public class Main {
    public static void main(String[] args) {
        Scooter firstScooter = new Scooter(1, 85);
        Scooter secondScooter = new Scooter(2, 30);
        Rider firstRider = new Rider("first",true);
        Rider secondRider = new Rider("second",false);
        firstRider.register();
        secondRider.register();
        firstRider.scanScooter(firstScooter);
        secondRider.scanScooter(secondScooter);
        firstRider.useScooter(firstScooter);
        secondRider.useScooter(secondScooter);
    }
}
