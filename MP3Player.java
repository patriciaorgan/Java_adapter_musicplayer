//Assignment 3 CT548 - Patricia Organ 01110489
package musicplayer;

public class MP3Player implements AudioPlayer{
	
	//constructor
	public MP3Player(){
		
	}
	
	@Override
	public void play(AudioFile audioFile) {
		//print out to screen the type and the file name
		System.out.println(audioFile.getAudioType() + " is playing " + audioFile.getFileName());
		
	}
	
}
