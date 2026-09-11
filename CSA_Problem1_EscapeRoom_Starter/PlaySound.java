import java.io.File;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
// or use a wildcard for all sampled audio tools:
// import javax.sound.sampled.*;

import javax.sound.sampled.Clip;



public class PlaySound {
    public static void main(String[] args) {
        try {
            // 1. Get the file
            File file = new File("coin.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);

            // 2. Get and open the line
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            // 3. Play the sound
            clip.start();

            // 4. Keep the program alive until the sound finishes
            Thread.sleep(clip.getMicrosecondLength() / 1000);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}