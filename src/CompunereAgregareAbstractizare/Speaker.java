package CompunereAgregareAbstractizare;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Speaker implements IAudio{
	int maxVolume;
	int crtVolume;
	
	public Speaker(int maxVolume){
		this.maxVolume=maxVolume;
		this.crtVolume=maxVolume/4;
	}	
	public Speaker(int maxVolume, int crtVolume){
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
	public void setSilenceMode(){
		this.crtVolume=0;
	}
}
