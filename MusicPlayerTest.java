package musicplayer;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MusicPlayerTest {
	
	MusicPlayer musicPlayer;
	AudioFile oggFile;
	AudioFile mp3File;
	AudioFile flacFile;
	AudioFile aacFile;
	
	@Before
	public void setUp() throws Exception {
		musicPlayer = new MusicPlayer(); //set up music player
		
		//create music file objects
		oggFile = new AudioFile("ogg", "C://Music/Amator_Silenti.ogg");
		mp3File = new AudioFile("mp3", "C://Music/Vicissitudes.mp3");
		flacFile = new AudioFile("flac", "C://Music/Lucky_Seven.flac");
		aacFile = new AudioFile("aac", "C://Music/In_Silent_Way.aac");
		
		//register three plugins with the player
		musicPlayer.register("ogg", new OGGPlayer());
		musicPlayer.register("mp3", new MP3Player());
		musicPlayer.register("flac", new FlacPlayer());
	}
	
	// test that the OGG plugin is working with the player
	@Test
	public void testOGG() {
		try{
			musicPlayer.play(oggFile);
		}catch(UnSupportedAudioFormatException e){
			System.out.println(e.getMessage());
		}
		assertTrue(musicPlayer.getPlayState()); // assert that the Player is playing
		musicPlayer.stop();
	}

	// test that the MP3 plugin is working with the player
	@Test
	public void testMP3() {
		try{
			musicPlayer.play(mp3File);
		}catch(UnSupportedAudioFormatException e){
			System.out.println(e.getMessage());
		}
		assertTrue(musicPlayer.getPlayState()); // assert that the Player is playing
		musicPlayer.stop();
	}
	
	// test that the Flac plugin is working with the player
	@Test
	public void testFlac() {
		try{
			musicPlayer.play(flacFile);

		}catch(UnSupportedAudioFormatException e){
			System.out.println(e.getMessage());
		}
		assertTrue(musicPlayer.getPlayState()); // assert that the Player is playing
		musicPlayer.stop();
	}
	
	// test the correct unsupported audio behaviour
	@Test
	public void testUnsupportedAudio() {
		try{
			musicPlayer.play(aacFile); //no plugin is registered for aac files

		}catch(UnSupportedAudioFormatException e){
			System.out.println(e.getMessage());
		}
		assertTrue(!musicPlayer.getPlayState()); // assert that the Player is not playing
		musicPlayer.stop();
	}	
}
