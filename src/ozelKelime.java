package benimSinavSorum;

public class ozelKelime extends kelime{

	
	public ozelKelime(String tersi, String kelime, int sesliHarf, int sessizHarf) {
		super(tersi, kelime, sesliHarf, sessizHarf);
		
	}
	
	public static void tersDuzAyni() {
		if (kelime.equalsIgnoreCase(tersi)) {
			System.out.println("Ters-Düz aynı");
		}
		else {
			System.out.println("Ters-Düz aynı değil");
		}
	}
	
	public static void sesli_sessizEsit() {
		if (sesliHarf == sessizHarf) {
			System.out.println("Kelime Raze kelimedir");
		}
		else {
			System.out.println("Kelime Raze değildir");
		}
	}
	
	public static void bas_son() {
		char bas = kelime.charAt(0);
		char son = kelime.charAt(kelime.length()-1);
		
		if (bas == son) {
			System.out.println("Girdiğiniz kelime Basson kelimedir");
		}
		else {
			System.out.println("Girdiğiniz kelime Basson kelime değildir");
		}
	}
	
}
