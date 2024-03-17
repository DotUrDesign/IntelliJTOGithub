interface MyCamera{
    void snapshot();
    void videoRecord();
    default void recordVideoIn4k(){
        System.out.println("Recording video in 4K...");
    }
    default void cameraQuality(){
        System.out.println("Unidentifiable");
    }
}

interface MyWifi{
    String[] networks();
    void connectToNetwork(String network);
}

abstract class CellPhone{
    abstract void storage(int ram);
    abstract void screenSize(int size);
}

class SmartPhone23 extends CellPhone implements MyCamera, MyWifi{
    @Override
    public void storage(int ram){
        System.out.println("Storage of this phone is : " + ram);
    }
    public void screenSize(int size){
        System.out.println("The screen size of the phone is : " + size);
    }
    public void snapshot(){
        System.out.println("Taking snapshot...");
    }
    public void videoRecord(){
        System.out.println("Recording video...");
    }

    public String[] networks() {
        String [] str = {"Network1", "Network2", "Network3"};
        return str;
    }
    public void connectToNetwork(String network){
        System.out.println("Your network " + network + " is connected !!");
    }
    public void cameraQuality(){
        System.out.println("Good camera quality!");
    }
}

public class CWH_interfaces3 {
    public static void main(String[] args) {
        SmartPhone23  smp = new SmartPhone23();
        smp.storage(64);
        smp.screenSize(6);
        smp.snapshot();
        smp.videoRecord();
        String[] ss = smp.networks();
        for(String it : ss){
            System.out.println(it);
            smp.connectToNetwork(it);
        }

        // you can also access the default methods present in an interface.
        smp.recordVideoIn4k();

        // accessing a default method which has been overridden by the subclass. default method - cameraQuality, interface - MyCamera .... -> We noticed that the contents of cameraQuality has been overridden, and when accessed the overridden contents will be printed.
        smp.cameraQuality();

    }
}
