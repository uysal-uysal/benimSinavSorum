package benimSinavSorum;

import java.util.Scanner;

public class kelime {

	private String ters;
	public static String kelime;
	public static int sesliHarf;
	public static int sessizHarf;
	public static String tersi = "";
	public static String sesliler = "aeıioöuü";
	public static String sessizlerString = "bcçdfgğhjklmnprsştvyz";
	
	
	
	

	public kelime(int sesliHarf, int sessizHarf, String ters) {
		super();
		this.sesliHarf = sesliHarf;
		this.sessizHarf = sessizHarf;
		this.ters = ters;
	}
	
	public kelime(String tersi, String kelime, int sesliHarf, int sesizHarf) {
		super();
		benimSinavSorum.kelime.tersi = tersi;
		benimSinavSorum.kelime.kelime = kelime;
		benimSinavSorum.kelime.sesliHarf = sesliHarf;
		benimSinavSorum.kelime.sessizHarf = sesizHarf;
	
	}
	
	
	public int getSesliHarf() {
		return sesliHarf;
	}
	public void setSesliHarf(int sesliHarf) {
		this.sesliHarf = sesliHarf;
	}
	public int getSessizHarf() {
		return sessizHarf;
	}
	public void setSessizHarf(int sessizHarf) {
		this.sessizHarf = sessizHarf;
	}
	public String getTers() {
		return ters;
	}
	public void setTers(String ters) {
		this.ters = ters;
		ters = tersi;
	}
	
	
	public static void sesliHarf(String kelime) {
		int sesliSayisi= 0;
		for(int i = 0 ; i<=kelime.length()-1;i++) {
			for(int j= 0 ; j<=7;j++) {
				if(kelime.charAt(i)==sesliler.charAt(j)) {
					sesliSayisi++;
				}
			}
		}
		System.out.println("Sesli harf sayısı : " + sesliSayisi);
	}
	
	
	public static void sessizHarf(String kelime) {
		int sessizSayisi= 0;
		for(int i = 0 ; i<=kelime.length()-1;i++) {
			for(int j= 0 ; j<=20;j++) {
				if(kelime.charAt(i)==sessizlerString.charAt(j)) {
					sessizSayisi++;
				}
			}
		}
		System.out.println("Sessiz harf sayısı : " + sessizSayisi);
	}
	
	
	public static void tersCevir(String kelime) {
	     
        for(int i=kelime.length()-1;i>=0;i--) {
            tersi=tersi+kelime.charAt(i);
        }
        System.out.println("Girdiğiniz kelimenin tersi: "+tersi);
	}
	

	private static void goster() {
		sesliHarf(kelime);
		sessizHarf(kelime);
		tersCevir(kelime);
		ozelKelime.tersDuzAyni();
		ozelKelime.sesli_sessizEsit();
		ozelKelime.bas_son();

	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.print("Kelime giriniz :");
		kelime = scanner.nextLine();
		
		goster();
	
	
	}
	
}
