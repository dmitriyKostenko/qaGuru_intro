package guru.qa;

public class Rider {
    public String nickname;
    public boolean registration;

    public Rider(String nickname, boolean registration) {
        this.nickname = nickname;
        this.registration = registration;
    }

    public void register() {
        if(this.registration) {
            System.out.println("Пользователь " + this.nickname + " вы авторизованы!");
        } else {
            this.registration = true;
            System.out.println("Пользователь " + this.nickname + " регистрация успешно завершена.");
        }
    }

    public void scanScooter(Scooter scooter) {
        System.out.println("Самокат номер " + scooter.getId() + " / Уровень заряда " + scooter.getBattery());
        if(scooter.getBattery() <= 30) {
            System.out.println("Самокат номер " + scooter.getId() + " необходимо зарядить");
            scooter.charge();
        } else {
            scooter.status = true;
            System.out.println("Самокат номер " + scooter.getId() + " готов к использованию.");
        }
    }

    public void useScooter(Scooter scooter) {
        if(scooter.status) {
            scooter.setBattery(scooter.battery - 30);
            System.out.println("Самокат номер " + scooter.getId() + " / Уровень заряда " + scooter.getBattery());
        }
    }
}
