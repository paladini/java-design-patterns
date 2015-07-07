package structural.adapter;

public class Main {
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "Johnny Cash - I Hung My Head.mp3");
		audioPlayer.play("vlc", "Mr. Robot SO1E01.vlc");
		audioPlayer.play("mp4", "Pink Floyd The Wall - Live at Berlin 1991 FULL Concert.mp4");
		audioPlayer.play("avi", "A Beautiful Mind.avi"); // not supported.
	}
}
