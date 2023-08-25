package kh.model.vo;

import java.io.*;

public class Food implements Serializable{
	private String name;
	private int kcal;
	
	public Food() {		
	}
	
	public Food(String name, int kcal) {
		this.name = name;
		this.kcal = kcal;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKcal() {
		return kcal;
	}

	public void setKcal(int kcal) {
		this.kcal = kcal;
	}
	@Override
	public String toString() {
		return this.name + ", " + this.kcal;
	}
	
	 public void fileSave(String fileName) throws IOException {
	        File file = new File(fileName);
	        FileOutputStream fos = new FileOutputStream(file);
	        ObjectOutputStream oos = new ObjectOutputStream(fos);
	        oos.close();
	        fos.close();
	    }
	 public static void main(String[] args) {
		Food food = new Food("사과", 20);
		try {
			food.fileSave("Food 객체 샘플 : ");
		} catch (IOException e) {
			e.printStackTrace();
		}
	} 
}
