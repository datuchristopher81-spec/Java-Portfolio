import java.util.ArrayList;
import java.util.List;

class Device {
    private boolean power;
    public Device() {
        power = false;
    }
    public void turnOn() {
        power = true;
    }
    public void turnOff() {
        power = false;
    }
    public boolean isOn() {
        return power;
    }
    public void showStatus() {
        System.out.println("Power: " + (power ? "ON" : "OFF"));
    }
}
class AirConditioner extends Device {
    private int fanSpeed;
    private int temperature;

    public AirConditioner() {
        this.fanSpeed = 3;      
        this.temperature = 24;  
    }
    public AirConditioner(int fs, int temp) {
        this.fanSpeed = fs;
        this.temperature = temp;
    }
    public void setFanSpeed(int fs) {
        this.fanSpeed = fs;
        System.out.println("\nUpdated Air Conditioner Fan Speed to: " + fs);
        showStatus();
    }
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("\nUpdated Air Conditioner Temperature to: " + temp);
        showStatus();
    }

    @Override
    public void showStatus() {
        System.out.println("---- Air Conditioner Status ----");
        super.showStatus();
        System.out.println("Fan Speed: " + fanSpeed);
        System.out.println("Temperature: " + temperature);
    }
}
class Lamp extends Device {
    private int brightness;
    private String color;

    public Lamp(int b, String c) {
        this.brightness = b;
        this.color = c;
    }
    public Lamp(Lamp other) {
        this.brightness = other.brightness;
        this.color = other.color;
    }
    public void setBrightness(int b) {
        this.brightness = b;
        System.out.println("\nUpdated Lamp Brightness to: " + b + "%");
        showStatus();
    }
    public void setColor(String c) {
        this.color = c;
        System.out.println("\nUpdated Lamp Color to: " + c);
        showStatus();
    }

    @Override
    public void showStatus() {
        System.out.println("---- Lamp Status ----");
        super.showStatus();
        System.out.println("Brightness: " + brightness + "%");
        System.out.println("Color: " + color);
    }
}
class Television extends Device {
    private int channel;
    private int volume;

    public Television() {
        this.channel = 1;
        this.volume = 10;
    }
    public Television(int c, int v) {
        this.channel = c;
        this.volume = v;
    }
    public void setChannel(int c) {
        this.channel = c;
        System.out.println("\nUpdated TV Channel to: " + c);
        showStatus();
    }
    public void setVolume(int v) {
        this.volume = v;
        System.out.println("\nUpdated TV Volume to: " + v + "%");
        showStatus();
    }
    @Override
    public void showStatus() {
        System.out.println("---- Television Status ----");
        super.showStatus();
        System.out.println("Channel: " + channel);
        System.out.println("Volume: " + volume + "%");
    }
}
class Microwave extends Device {
    private int timer;
    private int temperature;

    public Microwave() {
        this.timer = 0;
        this.temperature = 0;
    }
    public Microwave(int t, int temp) {
        this.timer = t;
        this.temperature = temp;
    }
    public void setTimer(int t) {
        this.timer = t;
        System.out.println("\nUpdated Microwave Timer to: " + t + " minutes");
        showStatus();
    }
    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("\nUpdated Microwave Temperature to: " + temp);
        showStatus();
    }
     @Override
    public void showStatus() {
        System.out.println("---- Microwave Status ----");
        super.showStatus();
        System.out.println("Timer: " + timer + " minutes");
        System.out.println("Temperature: " + temperature + "°C");
    }
}
public class SmartHomeSystem {
    public static void controlDevices(ArrayList<Device> list, boolean turnOn) {
        for (Device d : list) {
            if (turnOn) d.turnOn();
            else d.turnOff();
        }
    }

    public static int countOnDevices(ArrayList<Device> list) {
        int count = 0;
        for (Device d : list) {
            if (d.isOn()) count++;
        }
        return count;
    }

    public static void main(String[] args) {

        ArrayList<Device> devices = new ArrayList<>();

        AirConditioner ac = new AirConditioner();
        Lamp lamp1 = new Lamp(100, "Yellow");
        Lamp lamp2 = new Lamp(lamp1);
        Television tv = new Television(1, 10);
        Microwave mw = new Microwave();

        devices.add(ac);
        devices.add(lamp1);
        devices.add(lamp2);
        devices.add(tv);
        devices.add(mw);

        controlDevices(devices, true);

        System.out.println("\n===== STATUS AFTER TURNING ON =====");
        for (Device d : devices) {
            d.showStatus();
            System.out.println();
        }

        System.out.println("Devices currently ON: " + countOnDevices(devices));

        controlDevices(devices, false);

        System.out.println("\n===== STATUS AFTER TURNING OFF =====");
        for (Device d : devices) {
            d.showStatus();
            System.out.println();
        }
    }
}
