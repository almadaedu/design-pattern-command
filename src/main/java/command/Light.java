package command;

public class Light {

    private String On;
    private String Off;
    private String mode;

    public Light(String lightOn, String lightOff) {
        this.On = On;
        this.Off = Off;
    }

    public String getMode() {
        return mode;
    }

    public void turnOn() {
        this.mode = "Luzes acesas";
    }

    public void turnOff() {
        this.mode = "Luzes apagadas";
    }
}
