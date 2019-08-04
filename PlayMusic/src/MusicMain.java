import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class MusicMain {

	public static void main(String[] args) throws FileNotFoundException, JavaLayerException {
		FileInputStream fileinp=new FileInputStream("My.mp3");
		Player play1=new Player(fileinp);
		play1.play();
		System.out.println("song is playing");
		
	}

}
