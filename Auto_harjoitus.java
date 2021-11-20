
public class Autot {

	public static void main(String[] args) {

// 4. Luo auto1-olio ja anna sille arvot merkki, malli ja bensanMaara.
		Auto auto1 = new Auto();
		Auto auto2 = new Auto("Toyota", "Auris", 50);
		
		auto1.merkki="Hyundai";
		auto1.malli="Getz";
		auto1.bensanMaara= 25;
		
//    Tulosta auton tiedot, kiihdytä autoa ja tulosta uudestaan.		
		auto1.naytaTiedot();
		auto1.kiihdyta();
		auto1.naytaTiedot();
		
		auto1.tankkaa(5);
		
		auto2.naytaTiedot();
		
	}

}
//Luokat
class Auto
{
public String merkki;
public String malli;
public int bensanMaara;

//OLETUSMUODOSTIN
public Auto()
{
merkki="";
malli="";
}

// PARAMETRINEN MUODOSTIN 
public Auto(String merkki, String malli, int bensanMaara)
{
	this.merkki=merkki;
	this.malli=malli;
	this.bensanMaara=bensanMaara;
}

// METODI A Jarruta
public void  jarruta()
{
	System.out.println("Auto kiihtyy");
}

// METODI B Kiihdyta
public void kiihdyta()
{
	if (bensanMaara>0)
	{
	System.out.println("Auto kiihtyy");
	bensanMaara --;
	}
}

//METODI C NaytaTiedot
public void naytaTiedot()
{
	System.out.println(merkki);
	System.out.println(malli);
	System.out.println(bensanMaara);
}

//METODI Tankkaa
public void tankkaa(int tankkauksenMaara)
{
	System.out.println("Tankissa bensaa: " + bensanMaara);
	System.out.println("Tankkaus: " + tankkauksenMaara);
	System.out.println("Tankissa bensaa tankkauksen jälkeen: " + (bensanMaara+tankkauksenMaara));
}
}