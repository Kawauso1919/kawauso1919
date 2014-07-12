/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fireemblem.util;

import java.net.URL;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author t-sato
 */
public class SoundUtils {

    /**
     * 音を鳴らす。超雑。でも弄るのめんどい。
     *
     * @param url メディアのURL
     */
    public static void playSE(URL url) {
        //TODO サウンドUtilとかかな。
        Media audioMedia = new Media(url.toString());
        MediaPlayer audioPlayer = new MediaPlayer(audioMedia);
        audioPlayer.play();
    }
}
