package com.tech.core;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 * 
 * @author Girdhar.Singh
 * @date November 16, 2017
 */
@SuppressWarnings("restriction")
public class PlaySound {

	/**
	 * 
	 * this method will play audio clip
	 * 
	 * @param none
	 * @return void
	 * @throws none
	 */
	public void playClips() throws IOException {
		String soundFile = "love.wav";
		InputStream in = new FileInputStream(soundFile);
		// create an audiostream from the inputstream
		AudioStream audioStream = new AudioStream(in);
		// play the audio clip with the audioplayer class
		AudioPlayer.player.start(audioStream);
	}
	public static void main(String[] args) throws IOException {
		new PlaySound().playClips();
	}
}
