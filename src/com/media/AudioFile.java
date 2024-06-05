package com.media;

public class AudioFile extends MultimediaFile {
	String artist;
	String album;
	
	public AudioFile(String title, int duration, int filesize, String artist, String album) {
		super(title, duration, filesize);
		this.artist = artist;
		this.album = album;
	}
	
	@Override
	void play() {
		System.out.println("Play the audio file");
	}
	
	@Override
	void display() {
		super.display();
		System.out.println("Artist = "+artist);
		System.out.println("Album = "+album);
	}
	

}

