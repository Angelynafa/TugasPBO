/*
NAMA	: Angelyna
NIM		: 1177050016
Kelas	: PBO-B

					TUGAS 1 : MEMBUAT INSTANCE OF CLASS DENGAN 10 ATRIBUT
*/



public class hp{
	public static void main(String []args)
	{
		handphone hp1= new handphone(" xiomi"," black"," android"," 2GB,3GB"," 16GB, 32GB"
		," utama :13MP , depan :5MP "," 5 inches"," smartphone", 1125, 137);
		System.out.println();
		System.out.println( " SPESIFIKASI HANDPHONE");
		System.out.println();
		System.out.println("merk	:"+hp1.getMerk());
		System.out.println("warna	:"+hp1.getWarna());
		System.out.println("os	:"+hp1.getOs());
		System.out.println("ram	:"+hp1.getRam());
		System.out.println("storage	:"+hp1.getStorage());
		System.out.println("camera	:"+hp1.getCamera());
		System.out.println("layar	:"+hp1.getUkuran_layar());
		System.out.println("tipe	:"+hp1.getTipe());
		System.out.println("harga	:"+hp1.getHarga());
		System.out.println("berat	:"+hp1.getBerat());
		
	}
}