package proje1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		        Galeri galeri = new Galeri();

		        Araba araba1 = new Araba("1-Toyota", "Corolla", 2020, 650000);
		        Araba araba2 = new Araba("2-BMW", "320i", 2018, 100000);
		        Araba araba3 = new Araba("3-Nissan","QASHQAI e-power", 2023, 900000);
		        Araba araba4 = new Araba("4-Renault","RXT",1998,300000);
		        Araba araba5 = new Araba("5-Nissan","Primera",1998,200000);
		        galeri.arabaEkle(araba1);
		        galeri.arabaEkle(araba2);
		        galeri.arabaEkle(araba3);
		        galeri.arabaEkle(araba4);
		        galeri.arabaEkle(araba5);
		        System.out.println();
		        galeri.arabalarListesi();
		        
		        System.out.println("Sat�n almak iste�iniz arabay� se�iniz:");
		        int a = scanner.nextInt();
		        switch (a){
		        case 1:
		        	System.out.println("Sat�n ald���n�z araba: "+araba1);
		        	break;
		        
		        case 2:
		        	System.out.println("Sat�n ald���n�z araba: "+araba2);
		        	break;
		        case 3:
		        	System.out.println("Sat�n ald���n�z araba: "+araba3);
		        	break;
		        case 4:
		        	System.out.println("Sat�n ald���n�z araba: "+araba4);
		        	break;
		        case 5:
		        	System.out.println("Sat�n ald���n�z araba: "+araba5);
		        	break;
		        	default:
		        		System.out.println("Almamay� tercih ettiniz");
		        	
		        }
		    }
		


	}


