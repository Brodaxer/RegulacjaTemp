public class HeaterApp {
    public static void main(String[] args) {
        Heater heat1= new Heater();
        upOrDown knob = new upOrDown();
        knob.adjustTemp(heat1);
    }
}
