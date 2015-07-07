package structural.adapter;

public class VLCPlayer implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		System.out.println("Playing VLC file: " + fileName);
	}

	public void playMp4(String fileName) {
		// do nothing
	}

}
