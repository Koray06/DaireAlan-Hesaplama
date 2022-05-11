import java.util.Scanner;

public class daireAlanıHesaplama {

	public static void main(String[] args) {
		/* * Dairenin Alanını ve Çevresini Hesaplayan Program
	        * java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
	        *  -Alan Formülü : π * r * r;
	        *  -Çevre Formülü : 2 * π * r;
	        *
	        * Ödev:
	        * Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin 
	        * alanı bulan programı yazınız.
	        *  -𝜋 sayısını = 3.14 alınız.
	        *  -Formül : (𝜋 * (r*r) * 𝛼) / 360 */

		double yariCap;
        double pi=3.14;
        double daireAlan;
        double daireCevre;
        double daireDilimAlani;
        double daireDilimAcisi;

        Scanner scan =new Scanner(System.in);

        // Yarıçap Değeri Al
        System.out.print("Dairenin Yarıçapını Giriniz: ");
        yariCap=scan.nextDouble();

        // Daire Dilim Açısı
        System.out.print("Daire Dilimin Açısını Giriniz (Derece): ");
        daireDilimAcisi=scan.nextDouble();

        // Daire Dilim Alanı
        daireDilimAlani=(pi*daireDilimAcisi*(yariCap*yariCap))/360;

        //Dairenin Çevresi Hesapla
        daireCevre=2*pi*yariCap;

        //Dairenin Alanını Hesapla
        daireAlan=pi*yariCap*yariCap;

        //Ekrana Yazdır
        
        System.out.println(" Dairenin Yarıçap Değeri : "+yariCap);
        
        System.out.println(" Daire Dilimin Açısını   : "+daireDilimAcisi);
      
        System.out.println(" Tüm Dairenin Çevresi    : "+daireCevre);
        
        System.out.println(" Tüm Dairenin Alanı      : "+daireAlan);
       
        System.out.println(" Daire Dilimin Alanı     : "+daireDilimAlani);
        
		
	}

}
