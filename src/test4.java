abstract class Cellphone{
    abstract void storage(int num);
    abstract void screenSize(int size);
}

interface myWifi{
    String[] networks();
    void connectToNetwork(String network);
}

interface myCamera{
    void snapshot();
    void videoRecord();
    default void recordVideoIn4K(){
        System.out.println("Recording video in 4k...");
    }
    default void cameraQuality(){
        System.out.println("Unidentifiable");
    }
}

class Smartphone extends Cellphone implements myCamera, myWifi{
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

public class test4 {
    public static void main(String args[]){
        Smartphone  smp = new Smartphone();
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
        smp.recordVideoIn4K();

        // accessing a default method which has been overridden by the subclass. default method - cameraQuality, interface - MyCamera .... -> We noticed that the contents of cameraQuality has been overridden, and when accessed the overridden contents will be printed.
        smp.cameraQuality();
    }
}


