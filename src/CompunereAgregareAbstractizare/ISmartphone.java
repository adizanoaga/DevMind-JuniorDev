package CompunereAgregareAbstractizare;

public interface ISmartphone {

	public abstract void pressVolumeUp();

	public abstract void pressVolumeDown();

	public abstract void setPixel(int pixelIndex, String color);

	public abstract void colorScreen(String color);

	public abstract void increaseMicrophoneVolume();

	public abstract void decreaseMicrophoneVolume();

	public abstract void muteMicrophone();

	public abstract void setSilenceMode();

}