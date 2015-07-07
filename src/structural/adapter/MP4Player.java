package structural.adapter;

public class MP4Player implements AdvancedMediaPlayer {

	public void playVlc(String fileName) {
		// do nothing
	}

	public void playMp4(String fileName) {
		System.out.println("Playing MP4 file: " + fileName);
	}

}
