interface AudioPlayer{
    void playAudio();
    void pauseAudio();
    void stopAudio();
}

interface VideoPlayer{
    void playVideo();
    void pauseVideo();
    void stopVideo();
}

class MediaPlayer implements AudioPlayer, VideoPlayer{
    // the methods of the interface when overridden, should always be declared as "public".
    public void playAudio(){
        System.out.println("Playing audio...");
    }
    public void pauseAudio(){
        System.out.println("Pause audio...");
    }
    public void stopAudio(){
        System.out.println("Stopping audio...");
    }
    public void playVideo(){
        System.out.println("Playing video...");
    }
    public void pauseVideo(){
        System.out.println("Playing video...");
    }
    public void stopVideo(){
        System.out.println("Stopping video...");
    }
}

public class CWH_interfaces2 {
    public static void main(String[] args) {
        MediaPlayer mp3 = new MediaPlayer();
        mp3.playAudio();
        mp3.pauseAudio();
        mp3.stopAudio();
        mp3.playVideo();
        mp3.pauseVideo();
        mp3.stopVideo();
    }
}
