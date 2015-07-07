package structural.adapter;

public class MyMediaAdapter implements MediaPlayer {
	AdvancedMediaPlayer advancedMusicPlayer; 
	
	public MyMediaAdapter(String audioType) {
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer = new VLCPlayer();
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer = new MP4Player();
		}
	}
	
	public void play(String audioType, String fileName) {
		if (audioType == null || fileName == null)
			throw new IllegalArgumentException();
			
		if (audioType.equalsIgnoreCase("vlc")) {
			advancedMusicPlayer.playVlc(fileName);
		} else if (audioType.equalsIgnoreCase("mp4")) {
			advancedMusicPlayer.playMp4(fileName);
		}
	}
}
