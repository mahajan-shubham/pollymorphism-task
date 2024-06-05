package com.media;

public class TestMultimedia {

		public static void main(String[] args) {
			MultimediaFile ab = new MultimediaFile("Audio / Video",30,2);
			ab.play();
			ab.display();
			System.out.println("-----------------------------");
			MultimediaFile ac = new AudioFile("Audio / Video",30,2,"Sonu Nigam","Deewana");
			ac.play();
			ac.display();
			System.out.println("-----------------------------");
			MultimediaFile ad = new VideoFile("Audio / Video",30,2,1020,"Deewana tera");
			ad.play();
			ad.display();
			}
}
