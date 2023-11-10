public class Main2 {
    public static void main(String[] args) {

        Phone phone = new Phone("Iphone","Aplle","13","m17","6x13");
        System.out.println(phone);
        phone.TurnOn();
        phone.TurnOff();
        phone.screenResolution();

        SamrtWatch samrtWatch = new SamrtWatch("SmartWatch","Aplle","UltraWatch","3x2","30гц");
        System.out.println(samrtWatch);
        samrtWatch.TurnOn();
        samrtWatch.TurnOff();
        samrtWatch.paying();

        Computer computer = new Computer("Mac","Aplle","M3","32x30","Cori9","Amd");
        System.out.println(computer);
        computer.TurnOn();
        computer.TurnOff();
        computer.highlights();





    }
}
