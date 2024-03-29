/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118008.latihan19.saldotabungan;
import java.util.Locale;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 *
* @author
 * NAMA			: Michael Nagaku Milenn Salim
 * KELAS		: IF-1
 * NIM			: 10118008
 * Deskripsi Program	: menghitung saldo dengan bunga 15% selama beberapa bulan
 */
public class IF110118008Latihan19SaldoTabungan {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		// TODO code application logic here
		double saldoAwal = 2500000;
		double bunga = 0.15;
		double saldoSekarang = saldoAwal + (saldoAwal * bunga);
		int lamaBulan = 6;
		DecimalFormat Idr = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols RP = new DecimalFormatSymbols();
		RP.setCurrencySymbol("Rp. ");
		RP.setMonetaryDecimalSeparator(',');
		RP.setGroupingSeparator('.');
		Idr.setDecimalFormatSymbols(RP);
		for (int i = 1; i <= lamaBulan; i++, saldoSekarang+=(saldoSekarang * bunga)){
			System.out.printf("Saldo di bulan ke-%d %s\n", i, Idr.format((int) saldoSekarang).replaceAll(",00", ""));

		}
	}
	
}
