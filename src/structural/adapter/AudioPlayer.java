package structural.adapter;

public class AudioPlayer implements MediaPlayer {
	
	MyMediaAdapter mediaAdapter; 
	
	public void play(String audioType, String fileName) {
		
		// remember that our AudioPlayer has built-in support for MP3 files.
	    if(audioType.equalsIgnoreCase("mp3")){
	    	System.out.println("Playing mp3 file. Name: " + fileName);			
	    } 
	      
	    // mediaAdapter is providing support to play other file formats
	    else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")){
	       mediaAdapter = new MyMediaAdapter(audioType);
	       mediaAdapter.play(audioType, fileName);
	    } 
	    
	    else {
	         System.out.println("Invalid media. " + audioType + " format not supported");
	    }
	}

}
