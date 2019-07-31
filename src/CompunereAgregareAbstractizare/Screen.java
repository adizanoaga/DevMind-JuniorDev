package CompunereAgregareAbstractizare;

import java.util.ArrayList;

public class Screen {
	int nrPixels;
	ArrayList<Pixel> pixels;
	Dimensions dimensions;
	
	public Screen (int nrPixels, int width, int length, int depth){
		this.nrPixels=nrPixels;
		dimensions=new Dimensions(width,length,depth);
	}
	public void setPixel(int pixelIndex,String culoare){
		this.pixels.get(pixelIndex).setPixel(culoare);
	}
	public void colorScreen(String color){
		for(int i=0; i<this.pixels.size();i++){
			setPixel(i, color);
		}
	}

	
}
