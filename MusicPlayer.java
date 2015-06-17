//Assignment 3 CT548 - Patricia Organ 01110489
package musicplayer;

public class MusicPlayer {

	//createing a variable to use to call the method of the AudioAdapter
	private AudioAdapter adapter;
	
	//constructor
	public MusicPlayer(){
		//initialise the local variable
		adapter = new AudioAdapter();
	}
	
	public void register(String type, AudioPlayer player) {
		//call the addPlayer method on the AudioAdapter object
		adapter.addPlayer(type, player);
	}

	public void play(AudioFile audfile) throws UnSupportedAudioFormatException {
		//call the overridden play method on the AudioAdapter object
		adapter.play(audfile);
	}

	public boolean getPlayState() {
		//return the boolean result form this method in the AudioAdapter class
		return adapter.getState();
	}

	public void stop() {
		//calling the equivelent stop method in Adapter class to turn the state variable to false
		adapter.stop();
	}

}//end MusicPlayer Class
