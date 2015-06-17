//Assignment 3 CT548 - Patricia Organ 01110489
package musicplayer;

public class UnSupportedAudioFormatException extends Exception {

	private static final long serialVersionUID = 1L;

	//constructor
	public UnSupportedAudioFormatException(){
		System.out.println("This file is not registered");
	}
}
