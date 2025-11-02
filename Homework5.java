public class Homework5 {
    public static void main(String[] args) {
        Monitor m = new Monitor();
        m.setSize("24 inch");
        m.setColor("Black");
        m.setPower("45W");

        Computer c = new Computer();
        c.setCpu("Core i7");
        c.setMemory("16GB");
        c.setHdd("2TB");
        c.setCoolerColor("White");
        c.setPower("500W");

        PersonalComputer pc = new PersonalComputer(c, m);

        pc.turnOn();
        pc.printInfo();
    }
}

class Monitor {
    private String size;
    private String color;
    private String power;

    public void setSize(String s) {
        size = s;
    }

    public void setColor(String c) {
        color = c;
    }

    public void setPower(String p) {
        power = p;
    }

    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String coolerColor;
    private String power;

    public void setCpu(String c) {
        cpu = c;
    }

    public void setMemory(String m) {
        memory = m;
    }

    public void setHdd(String h) {
        hdd = h;
    }

    public void setCoolerColor(String color) {
        coolerColor = color;
    }

    public void setPower(String p) {
        power = p;
    }

    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hdd);
        System.out.println("Color: " + coolerColor);
        System.out.println("Power: " + power);
    }
}

class PersonalComputer {
    private Computer c;
    private Monitor m;

    public PersonalComputer(Computer c1, Monitor m1) {
        c = c1;
        m = m1;
    }

    public void turnOn() {
        c.turnOn();
        m.turnOn();
    }

    public void printInfo() {
        c.printInfo();
        m.printInfo();
    }
}
