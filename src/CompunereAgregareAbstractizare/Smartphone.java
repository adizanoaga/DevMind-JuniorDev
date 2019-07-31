package CompunereAgregareAbstractizare;

public class Smartphone implements ISmartphone{
	// Composition:
	private Screen theScreen;
	private Case theCase;
	private Speaker theSpeaker;
	private Microphone theMicrophone;

	public Smartphone(Screen theScreen, Case theCase, Speaker theSpeaker,
			Microphone theMicrophone) {
		this.theScreen = theScreen;
		this.theCase = theCase;
		this.theSpeaker = theSpeaker;
		this.theMicrophone = theMicrophone;
	}

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

	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#pressVolumeUp()
	 */
	@Override
	public void pressVolumeUp() {
		this.theCase.pressVolumeUp();
		this.theSpeaker.increaseVolume();
	}

	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#pressVolumeDown()
	 */
	@Override
	public void pressVolumeDown() {
		this.theCase.pressVolumeDown();
		this.theSpeaker.decreaseVolume();
	}
	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#setPixel(int, java.lang.String)
	 */
	@Override
	public void setPixel(int pixelIndex, String color){
		this.theScreen.setPixel(pixelIndex, color);
	}
	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#colorScreen(java.lang.String)
	 */
	@Override
	public void colorScreen(String color){
		this.theScreen.colorScreen(color);
	}
	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#increaseMicrophoneVolume()
	 */
	@Override
	public void increaseMicrophoneVolume(){
		this.theMicrophone.increaseVolume();
	}
	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#decreaseMicrophoneVolume()
	 */
	@Override
	public void decreaseMicrophoneVolume(){
		this.theMicrophone.decreaseVolume();
	}
	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#muteMicrophone()
	 */
	@Override
	public void muteMicrophone(){
		this.theMicrophone.setSilenceMode();
	}
	/* (non-Javadoc)
	 * @see CompunereAgregareAbstractizare.ISmartphone#setSilenceMode()
	 */
	@Override
	public void setSilenceMode(){
		this.theSpeaker.setSilenceMode();
	}

}
