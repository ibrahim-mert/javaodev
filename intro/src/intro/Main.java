 package intro;

public class Main {
	public static void main(String[] args) {
		System.out.println("hello world!");
        
		//değişken isimleri javada ilk harf küçük ikinci harf büyük yazılır örn: camelCase
		String ortaMetin = "ilginizi çekebilir";
		String altMetin = "vade süresi";
		
		System.out.println(ortaMetin);
		
		int vade = 12;
		
		double dolarDun	= 18.28;
		double dolarBugun = 18.4;
		
		boolean dolarDustuMu = false;
		
		String okYonu = "";
		
		if (dolarBugun<dolarDun) {//false 
			okYonu = "down.svg";
			System.out.println(okYonu);
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
			
		    }
		
		//array
		String[] krediler ={"hızlı kredi","maaşı halkbank","mutlu emekli"};
		
		
	
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
	}

}
