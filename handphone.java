class handphone {
	//deklarasi
	private String merk,warna,os,ram,storage,camera,ukuran_layar,tipe;
	private int harga, berat;
	
	//constructor
	public handphone(String merk,String warna,String os,String ram,String storage,String camera,String ukuran_layar, String tipe,int harga,int berat)
	{
		this.merk=merk;
		this.warna= warna;
		this.os=os;
		this.ram=ram;
		this.storage=storage;
		this.camera=camera;
		this.ukuran_layar=ukuran_layar;
		this.tipe=tipe;
		this.harga=harga;
		this.berat=berat;
		
	}
	
	//get
	public String getMerk() {
		return merk;
	}public String getWarna() {
		return warna;
	}public String getOs() {
		return os;
	}public String getRam() {
		return ram;
	}public String getStorage() {
		return storage;
	}public String getCamera() {
		return camera;
	}public String getUkuran_layar() {
		return ukuran_layar;
	}public String getTipe() {
		return tipe;
	}public int getHarga() {
		return harga;
	}public int getBerat() {
		return berat;
	}
	
	
	
}