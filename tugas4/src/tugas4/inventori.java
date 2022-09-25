package tugas4;

public class inventori {
	barang[] barangs;
	void initBarang() {
	barangs = new barang[2];
	barangs[0] = new barang("001", "Baju", 10);
	barangs[1] = new barang("002", "Celana", 20);
	}
	void showbarang() {
	System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
	System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
	}
	void pengadaan() {
		initBarang();
		barangs[0].Addstok(40);
		barangs[0].Addstok(20);
		barangs[0].Addstok(10) ;
		showbarang();
	}
		public static void main(String[] args) {
		inventori beli = new inventori();
		beli.pengadaan();
		}
	}

