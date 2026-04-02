package workshop2;



public class qs6 {
 boolean isOn;

 void turnOn() {
     isOn = true;
     System.out.println("Lamp is ON: " + isOn);
 }

 void turnOff() {
     isOn = false;
     System.out.println("Lamp is ON: " + isOn);
 }

 public static void main(String[] args) {
     qs6 lamp = new qs6();
     lamp.turnOn();
     lamp.turnOff();
 }
}