package CompunereAgregare;

public class Microphone {
	private int maxVolume;
	private int crtVolume;
	
	public Microphone(int maxVolume){
		this.maxVolume=maxVolume;
		this.crtVolume=maxVolume/4;
	}	
	public Microphone(int maxVolume, int crtVolume){
		this.maxVolume=maxVolume;
		this.crtVolume=crtVolume;
	}
	public boolean increaseVolume(){
		if(crtVolume<maxVolume){
			crtVolume++;
		} else {
			return false;
		}
		return true;			
	}
	public boolean decreaseVolume(){
		if(crtVolume>0){
			crtVolume--;
		} else {
			return false;
		}
		return true;			
	}
	public void muteMicrophone(){
		this.crtVolume=0;
	}
}
