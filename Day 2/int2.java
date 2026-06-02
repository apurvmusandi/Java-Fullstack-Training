interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class SmartPhone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Taking a high-resolution photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing your favorite playlist.");
    }
}

public class int2 {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.takePhoto();
        phone.playMusic();
    }
}
