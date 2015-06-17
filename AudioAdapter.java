//Assignment 3 CT548 - Patricia Organ 01110489
package musicplayer;
import java.util.*;

public class AudioAdapter implements AudioPlayer{

	//declare a hashMap to hold 2 types a string and the audioPlayer type objects
	private HashMap<String, AudioPlayer> player;
	
	//constructor
	public AudioAdapter(){
		//initialse the HashMap local variable
		player = new HashMap<String, AudioPlayer>();
		
	}
	// declare and initialse variable to hold weather a file is playing or not, set to false first
	boolean state = false;
	
	//need to throw the exception to this method
	public void play(AudioFile aud) throws UnSupportedAudioFormatException{
		
			//check to see if the Audio type is present in the HashMap
			if (player.containsKey(aud.getAudioType())){
				//and then call the appropriate polymorphic play method
				player.get(aud.getAudioType()).play(aud);
				//set state when a file is playing
				state = true;
			}else{
			//have created a new class to handle this exception
			throw new UnSupportedAudioFormatException();
			}
	}

	//creating a method that is called in register method from MediaPlayer
	public void addPlayer(String id, AudioPlayer audioPlayer){
		//this adds to a Hashmap the type in string as the key and the AudioPlayer type object as value
		player.put(id, audioPlayer);
		
	}

	//sets the state variable back to false
	public void stop() {
		// return the player state to false
		state = false;
		
	}
	//getter for state
	public boolean getState() {
		return state;
	}
	
}//end AudioAdapter class
