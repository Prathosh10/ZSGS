package interfaces;

public interface Playable {
    public void play();
    public void pause();
    public void stop();
}

class MP3Player implements Playable{
    @Override
    public void play() {
        System.out.println("MP3 Player is playing!");
    }

    @Override
    public void pause() {
        System.out.println("MP3 Player is paused!");
    }

    @Override
    public void stop() {
        System.out.println("MP3 Player is stop!");
    }
}

class CDPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("CD Player is playing!");
    }

    @Override
    public void pause() {
        System.out.println("CD Player is paused!");
    }

    @Override
    public void stop() {
        System.out.println("CD Player is stop!");
    }
}

class StreamingPlayer implements Playable{
    @Override
    public void play() {
        System.out.println("Streaming Player is playing!");
    }

    @Override
    public void pause() {
        System.out.println("Streaming Player is paused!");
    }

    @Override
    public void stop() {
        System.out.println("Streaming Player is stop!");
    }
}

class PlayableDemo {
    public static void main(String[] args) {
        Playable mp3 = new MP3Player();
        mp3.play();
        mp3.pause();
        mp3.stop();

        Playable cd = new CDPlayer();
        cd.play();
        cd.pause();
        cd.stop();

        Playable streaming = new StreamingPlayer();
        streaming.play();
        streaming.pause();
        streaming.stop();
    }
}
