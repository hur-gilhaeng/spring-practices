package com.douzone.container.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;

	// 기본생성자
	public DVDPlayer() {
	}

	// 생성자
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	// setter
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	
	public void play() {
		dvd.play();
	}
}