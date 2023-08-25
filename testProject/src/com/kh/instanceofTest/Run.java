package com.kh.instanceofTest;

public class Run {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);

	}
	
	public static void wrapBox(Box box) {
		if (box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldWrap();
		} else if (box instanceof PaperBox){
			((PaperBox)box).paperWarp();
		} else {
			box.simpleWrap();
		}
	}

}
