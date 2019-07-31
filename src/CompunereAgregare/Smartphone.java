package CompunereAgregare;

public class Smartphone {
	// Composition:
	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;


	public Smartphone(int pixelsNo, int width, int length, int depth,
			int speakerMaxVol, int speakerCrtVol, int microMaxVol,
			int microCrtVol) {
		this.theScreen = new Screen(pixelsNo, width, length, depth);
		this.theCase = new Case();
		this.theSpeaker = new Speaker(speakerMaxVol, speakerCrtVol);
		this.theMicrophone = new Microphone(microMaxVol, speakerCrtVol);
	}

	public Smartphone(int nrPixels, int screenWidth, int screenLength,
			int screenDepth, int maxSpkVolume, int maxMicVolume) {
		this.theScreen = new Screen(nrPixels, screenWidth, screenLength,
				screenDepth);
		this.theMicrophone = new Microphone(maxMicVolume);
		this.theSpeaker = new Speaker(maxSpkVolume);
	}

	public void pressVolumeUp() {
		this.theCase.pressVolumeUp();
		this.theSpeaker.increaseVolume();
	}

	public void pressVolumeDown() {
		this.theCase.pressVolumeDown();
		this.theSpeaker.decreaseVolume();
	}
	public void setPixel(int pixelIndex, String color){
		this.theScreen.setPixel(pixelIndex, color);
	}
	public void colorScreen(String color){
		this.theScreen.colorScreen(color);
	}
	public void increaseMicrophoneVolume(){
		this.theMicrophone.increaseVolume();
	}
	public void decreaseMicrophoneVolume(){
		this.theMicrophone.decreaseVolume();
	}
	public void muteMicrophone(){
		this.theMicrophone.muteMicrophone();
	}
	public void setSilenceMode(){
		this.theSpeaker.setSilenceMode();
	}

}
