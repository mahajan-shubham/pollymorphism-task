package com.media;

public class MultimediaFile {
 String title;
 int duration;
 int filesize;
 
 
 
 public MultimediaFile(String title, int duration, int filesize) {
	this.title = title;
	this.duration = duration;
	this.filesize = filesize;
}

void play() {
	 System.out.println("Play the multimedia file");
	 
 }
 
 void display () {
	 System.out.println("Title = "+title);
	 System.out.println("Duration = "+duration);
	 System.out.println("Filesize = "+filesize);
 }
 
}
