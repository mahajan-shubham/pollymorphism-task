package com.media;

public class VideoFile extends MultimediaFile {
	
	int resolutions;
	String subtitles;
		
public VideoFile(String title, int duration, int filesize, int resolutions, String subtitles) {
		super(title, duration, filesize);
		this.resolutions = resolutions;
		this.subtitles = subtitles;
	}

@Override
void play() {
System.out.println("Play the video file");
}
	
	@Override
	void display() {
		super.display();
		System.out.println("Resolutions = "+resolutions);
		System.out.println("Subtitles = "+subtitles);
	}

}
