package cls.observer.weather;

public class PhoneDisplay extends Observer {
    public PhoneDisplay(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("PhoneDisplay: Temperature updated to " + subject.getTemperature() + "°C");
    }
}
