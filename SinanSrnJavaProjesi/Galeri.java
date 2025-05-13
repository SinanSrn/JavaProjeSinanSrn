package proje1;
import java.util.ArrayList;
public class Galeri {

		
		    private ArrayList<Araba> arabalar;

		    public Galeri() {
		        arabalar = new ArrayList<>();
		    }

		    public void arabaEkle(Araba araba) {
		        arabalar.add(araba);
		        System.out.println(araba.getMarka() + " " + araba.getModel() + " eklendi.");
		    }

		    public void arabalarListesi() {
		        if (arabalar.isEmpty()) {
		            System.out.println("Galeride hiç araba yok.");
		        } else {
		            System.out.println("Galerideki Arabalar:");
		            for (int i = 0; i < arabalar.size(); i++) {
		                System.out.println((i + 1) + ". " + arabalar.get(i));
		            }
		        }
		    }


		   
		 }


