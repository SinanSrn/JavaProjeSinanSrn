package proje1;

public class Araba {
	    private String marka;
	    private String model;
	    private int yil;
	    private double fiyat;

	    public Araba(String marka, String model, int yil, double fiyat) {
	        this.marka = marka;
	        this.model = model;
	        this.yil = yil;
	        this.fiyat = fiyat;
	    }

	    public String getMarka() {
	        return marka;
	    }

	    public String getModel() {
	        return model;
	    }

	    public int getYil() {
	        return yil;
	    }

	    public double getFiyat() {
	        return fiyat;
	    }

	    
	    public String toString() {
	        return marka + " " + model + " (" + yil + ") - " + fiyat + " TL";
	    }
	}



